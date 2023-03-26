package EmpleadoFijoTemporal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainEmpleado {

    public static void main(String[] args) throws IOException, ParseException {
        boolean continuar =false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tipodeContrato;
        // Para guardar los atrib comunes
        String numeroSS;
        String nombre;
        String fechaNacimiento;
        char sexo;

        //Para atributos del temporal
        String fechaInicio;
        String fechaFin;
        double precioDia;

        //Para atributos del fijo
        int salario;
        float irpf;
        int trienios;

        int controlFlujoMenu;

        ArrayList<Empleado> listadoEmpleadosActivo = new ArrayList<>();
        ArrayList<Empleado> listadoEmpleadosDadosDeBaja = new ArrayList<>();

        rellenarEmpleados(listadoEmpleadosActivo);

        for (int i = 0; i <5 ; i++) {
            bajas(listadoEmpleadosActivo,listadoEmpleadosDadosDeBaja,i);
        }
        Visualizar v = new Visualizar();
        v.visualiza(listadoEmpleadosActivo);

        v.visualiza(listadoEmpleadosActivo,listadoEmpleadosDadosDeBaja);

        System.out.println("""
                ###########################################
                                Menu:   
                                                
                1.Alta nuevo empleado. 
                2.Añadir venta(Solo a empleados temporales). 
                3.Bajas.
                4.Modifcar datos de empleado existente.
                5.Visualizar.    
                """);
        controlFlujoMenu = Integer.parseInt(br.readLine());
        if (controlFlujoMenu==10){
            continuar=false;
        }
        do {
            switch (controlFlujoMenu) {
                case 1 -> {
                    do {
                        System.out.println("""
                                1.Empleado Fijo.
                                                        
                                2.Empleado Temporal.
                                                        
                                3.Dejar de introducir empleados. 
                                
                                4.Modificaciones.                       
                                """);
                        switch (Integer.parseInt(br.readLine())) {
                            case 1 -> {
                                tipodeContrato = "Fijo";
                                do {
                                    System.out.println("Numero de Seguridad Social");
                                    numeroSS = br.readLine();
                                } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$"));
                                System.out.println("Nombre");
                                nombre = br.readLine();

                                do {
                                    System.out.println("Fecha de nacimiento");
                                    fechaNacimiento = br.readLine();
                                } while (!validateWregex(numeroSS, "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"));
                                System.out.println("Sexo(H/M)");
                                //Llamo a un metodo para cortar la String y pasarla a char
                                //Devuelve 0 si el dato no es ok
                                sexo = validateLenght(br.readLine());
                                System.out.println("Salario");
                                salario = Integer.parseInt(br.readLine());
                                System.out.println("IRPF");
                                irpf = Integer.parseInt(br.readLine());
                                System.out.println("Trienios");
                                trienios = Integer.parseInt(br.readLine());
                                addEmployeeF(listadoEmpleadosActivo, numeroSS, nombre, fechaNacimiento, sexo, salario, irpf, trienios);
                            }
                            case 2 -> {
                                tipodeContrato = "Temporal";

                                do {
                                    System.out.println("Numero de Seguridad Social");
                                    numeroSS = br.readLine();
                                } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$"));
                                System.out.println("Nombre");
                                nombre = br.readLine();

                                do {
                                    System.out.println("Fecha de nacimiento");
                                    fechaNacimiento = br.readLine();
                                } while (!validateWregex(numeroSS, "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"));

                                System.out.println("Sexo(H/M)");
                                //Llamo a un metodo para cortar la String y pasarla a char
                                //Devuelve 0 si el dato no es ok
                                sexo = validateLenght(br.readLine());
                                System.out.println("Fecha de inicio del contrato");
                                fechaInicio = br.readLine();
                                System.out.println("Fecha fin del contrato");
                                fechaFin = br.readLine();
                                System.out.println("Coste por dia del trabajador");
                                precioDia = Double.parseDouble(br.readLine());
                                addEmployeeT(listadoEmpleadosActivo, numeroSS, nombre, fechaNacimiento, sexo, fechaInicio, fechaFin, precioDia);
                            }
                            case 3 -> {
                                continuar = false;
                            }
                        }
                    } while (continuar);
                }

                case 2 -> {

                    do {
                        System.out.println("Empleado al que añadir la venta?(NSS)");
                        numeroSS = br.readLine();
                    } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$") && (!buscarEmpleado(listadoEmpleadosActivo, numeroSS,0).equalsIgnoreCase("Nombre no encontrado")));
                    System.out.println("Quieres añadir la venta a " + buscarEmpleado(listadoEmpleadosActivo, numeroSS) + " (Y/N)?");
                    if (br.readLine().equalsIgnoreCase("Y")) {
                        addSale(listadoEmpleadosActivo, numeroSS);
                    }
                }

                case 3 -> {
                    System.out.println("""
                            Que deseas hacer ?
                            1.Guardar y dar de baja.
                            2.Solo guardar.
                            """);
                    controlFlujoMenu=Integer.parseInt(br.readLine());
                    switch (controlFlujoMenu) {
                        case 1 -> {
                            do {
                                System.out.println("Empleado al que dar de baja?(NSS)");
                                numeroSS = br.readLine();
                                //a este le pase parametros distintos para tener dos devoluciones distintas al mismo nombre
                            } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$") && (!buscarEmpleado(listadoEmpleadosActivo, numeroSS,0).equalsIgnoreCase("Nombre no encontrado")));
                            System.out.println("Quieres dar de baja a " + buscarEmpleado(listadoEmpleadosActivo, numeroSS) + " (Y/N)?");
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                //este buscarEmpleado me devuelve la posicion
                                bajas(listadoEmpleadosActivo, buscarEmpleado(listadoEmpleadosActivo,numeroSS));
                            }
                        }
                        case 2 -> {
                            do {
                                System.out.println("Empleado al que dar de baja?(NSS)");
                                numeroSS = br.readLine();
                            } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$") && (!buscarEmpleado(listadoEmpleadosActivo, numeroSS,0).equalsIgnoreCase("Nombre no encontrado")));
                            System.out.println("Quieres dar de baja a " + buscarEmpleado(listadoEmpleadosActivo, numeroSS) + " (Y/N)?");
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                //este buscarEmpleado me devuelve la posicion
                                bajas(listadoEmpleadosActivo,listadoEmpleadosDadosDeBaja, buscarEmpleado(listadoEmpleadosActivo,numeroSS));
                            }
                        }
                        }
                }
                //TODO pendiente punto 5
                case 4->{
                    System.out.println("Modificaciones");
                    do {
                        System.out.println("Introduce el numero de seguridad social");
                        numeroSS = br.readLine();
                    } while (!validateWregex(numeroSS, "^[0-9]{8}[a-zA-Z]$") && (!buscarEmpleado(listadoEmpleadosActivo, numeroSS,0).equalsIgnoreCase("Nombre no encontrado")));
                    int index=buscarEmpleado(listadoEmpleadosActivo,numeroSS);
                    System.out.println("Empleado de tipo "+ listadoEmpleadosActivo.getClass().getSimpleName());
                    System.out.println("Quieres modificar a "+listadoEmpleadosActivo.get(index).getNombre()+"? (Y/N)");
                    if(br.readLine().equalsIgnoreCase("Y")){
                        if(listadoEmpleadosActivo.get(index) instanceof EmpTemporal){
                            System.out.println("Precio dia?");
                            precioDia=Double.parseDouble(br.readLine());
                            ((EmpTemporal) listadoEmpleadosActivo.get(index)).setPrecioDia(precioDia);
                        } else if(listadoEmpleadosActivo.get(index) instanceof EmpFijo) {
                            System.out.println("Salario base");
                            salario=Integer.parseInt(br.readLine());
                            System.out.println("Trienios");
                            trienios=Integer.parseInt(br.readLine());
                            ((EmpFijo)listadoEmpleadosActivo.get(index)).setSalario(salario);
                            ((EmpFijo)listadoEmpleadosActivo.get(index)).setTrienios(trienios);
                        }
                    }
                }
                case 5->{
                    String entradaTeclado;
                    do {
                    System.out.println("""
                            
                            Visualizar:
                            1.Empleados y sueldo.
                            2.Empleados(fijos/temporales) y sus caracteristicas particulares.
                            
                            """);
                        entradaTeclado=br.readLine();
                    }while(!validateWregex(entradaTeclado, "^[0-9]{1}$"));

                    switch (Integer.parseInt(entradaTeclado)){
                        case 1->{
                            v.visualiza(listadoEmpleadosActivo);
                        }
                        case 2->{
                            v.visualiza(listadoEmpleadosActivo,listadoEmpleadosDadosDeBaja);
                        }
                    }
                }
            }
        } while (continuar);
    }

    // TODO no se como hacer un return de datos distintos desde el mismo metodo un Array debe ser de los mismos datos
    public static void requestKeyboardCommon()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static void addEmployeeF(ArrayList<Empleado> listadoEmpleadosActivo, String numeroSS, String nombre,String fechaNacimiento, char sexo, int salario, float irpf, int trienios){
        listadoEmpleadosActivo.add(new EmpFijo(numeroSS,nombre,fechaNacimiento,sexo,salario,irpf,trienios));
    }

    public static void addEmployeeT(ArrayList<Empleado> listadoEmpleadosActivo, String numeroSS, String nombre,String fechaNacimiento, char sexo,
            String fechaInicio,String fechaFin,double precioDia){
        listadoEmpleadosActivo.add(new EmpTemporal(numeroSS,nombre,fechaNacimiento,sexo,fechaInicio,fechaFin,precioDia));

    }

    public static  String buscarEmpleado(ArrayList<Empleado> listadoEmpleadosActivo,String nss,int z){
        OrdenacionesBusquedas.ordenarPorAtributo(listadoEmpleadosActivo,nss);
        for(Empleado e:listadoEmpleadosActivo){
            if ((e instanceof EmpTemporal)&&(e.getNss().equalsIgnoreCase(nss))){
                return e.getNombre();
            }
        }
        return "Nombre no encontrado";
    }

    public static int buscarEmpleado(ArrayList<Empleado> listadoEmpleadosActivo,String nss){
        OrdenacionesBusquedas.ordenarPorAtributo(listadoEmpleadosActivo,nss);
        int salida=-1;
        for (int i = 0; i < listadoEmpleadosActivo.size(); i++) {
            if(listadoEmpleadosActivo.get(i).getNss().equalsIgnoreCase(nss)){
               salida=i;
            }
        }
       return salida;
    }
    public static void bajas(ArrayList<Empleado> listadoEmpleadosActivo,ArrayList<Empleado> listadoEmpleadosDadosdeBaja,int indice) throws ParseException {
        listadoEmpleadosDadosdeBaja.add(listadoEmpleadosActivo.get(indice));
        listadoEmpleadosActivo.remove(indice);
    }
    public static void bajas(ArrayList<Empleado> listadoEmpleadosActivo,int indice){
        listadoEmpleadosActivo.remove(indice);
    }
    public static void addSale(ArrayList<Empleado> listadoEmpleadosActivo,String nss){
        OrdenacionesBusquedas.ordenarPorAtributo(listadoEmpleadosActivo,nss);
        for(Empleado e:listadoEmpleadosActivo){
            if ((e instanceof EmpTemporal)&&(e.getNss().equalsIgnoreCase(nss))){
                ((EmpTemporal) e).añadirVenta();
            }
        }
    }
    public static boolean validateWregex(String entradaTeclado, String regex) {
/*
        -9 digitos 8numeros el ultimo letra
        "^[0-9]{8}[a-zA-Z]$"
        - formato fecha DD/MM/AAAA
        "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"
*/
        return entradaTeclado.matches(regex);
    }

    public static char validateLenght(String requestKeyboard){
        char c='0';
        if (requestKeyboard.length()==1){
            c = requestKeyboard.charAt(0);
        }
        return c;
    }




    /*
     public boolean validateWregex(String entradaTeclado, String regex) {

        En la String metemos que queremos comprobar,asi es lo mas generico posible
        "^[0-9]{8}[a-zA-Z]$"


    '^' indica el inicio de la cadena.
    '\d{8}' indica que deben haber exactamente 8 caracteres numéricos del 0 al 9.
    '[a-zA-Z]' indica que el último carácter debe ser una letra en mayúscula o minúscula.
    '$' indica el final de la cadena.


        return entradaTeclado.matches(regex);
}


public static boolean validateNSS(String s){
        return s.matches("^[0-9]{8}[a-zA-Z]$");
    }
     */
    public static void rellenarEmpleados(ArrayList<Empleado> listaEmp){
        for (int i = 0; i < 5; i++) {
            listaEmp.add(new EmpTemporal(Enum.nss[genNAle(0,19)],
                                        Enum.nombresHombres[genNAle(0,9)],
                                        Enum.fechasNacimiento[genNAle(0,19)],
                                        Enum.sexos[genNAle(0,1)],
                                        Enum.fechasInicio[genNAle(0,4)],
                                        Enum.fechasFin[genNAle(0, 4)],
                                        Enum.preciosDia[genNAle(0,9)]));
        }
        for (int i = 0; i < 5; i++) {
            listaEmp.add(new EmpTemporal(Enum.nss[genNAle(0,19)],
                    Enum.nombresMujeres[genNAle(0,9)],
                    Enum.fechasNacimiento[genNAle(0,19)],
                    Enum.sexos[genNAle(0,1)],
                    Enum.fechasInicio[genNAle(0,4)],
                    Enum.fechasFin[genNAle(0,4)],
                    Enum.preciosDia[genNAle(0,9)]));
        }

        for (int i = 0; i < 5; i++) {
            listaEmp.add(new EmpFijo(Enum.nss[genNAle(0,19)],
                    Enum.nombresHombres[genNAle(0,9)],
                    Enum.fechasNacimiento[genNAle(0,19)],
                    Enum.sexos[genNAle(0,1)],
                    Enum.salarios[genNAle(0,9)],
                    Enum.irpf[genNAle(0,9)],
                    genNAle(0,3)));
        }
        for (int i = 0; i < 5; i++) {
            listaEmp.add(new EmpFijo(Enum.nss[genNAle(0,19)],
                    Enum.nombresMujeres[genNAle(0,9)],
                    Enum.fechasNacimiento[genNAle(0,19)],
                    Enum.sexos[genNAle(0,1)],
                    Enum.salarios[genNAle(0,9)],
                    Enum.irpf[genNAle(0,9)],
                    genNAle(0,3)));
        }
    }

    public static int genNAle(int desde, int hasta) {
        Random random = new Random();
        return random.nextInt(hasta - desde + 1) + desde;
    }
}
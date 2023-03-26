package EmpleadoFijoTemporal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class MainEmpleado {

    public static void main(String[] args)throws IOException {

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

        ArrayList<Empleado> listadoEmpleadosActivo=         new ArrayList<>();
        ArrayList<Empleado> listadoEmpleadosDadosDeBaja=    new ArrayList<>();

        System.out.println("""
                Menú:     
                1.Alta nuevo empleado. 
                2.Añadir venta(Solo a empleados temporales). 
                3.Bajas.          
                """);
        controlFlujoMenu=Integer.parseInt(br.readLine());

        switch (controlFlujoMenu){
            case 1->{
                boolean continuar=true;
                do {
                    System.out.println("""
                            1.Empleado Fijo.
                                                    
                            2.Empleado Temporal.
                                                    
                            3.Dejar de introducir empleados.                        
                            """);
                    switch (Integer.parseInt(br.readLine())) {
                        case 1 -> {
                            tipodeContrato = "Fijo";
                            do {
                                System.out.println("Numero de Seguridad Social");
                                numeroSS=br.readLine();
                            }while(!validateWregex(numeroSS,"^[0-9]{8}[a-zA-Z]$"));
                            System.out.println("Nombre");
                            nombre=br.readLine();

                            do {
                                System.out.println("Fecha de nacimiento");
                                fechaNacimiento=br.readLine();
                            }while(!validateWregex(numeroSS,"^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"));
                            System.out.println("Sexo(H/M)");
                            //Llamo a un metodo para cortar la String y pasarla a char
                            //Devuelve 0 si el dato no es ok
                            sexo=validateLenght(br.readLine());
                            System.out.println("Salario");
                            salario=Integer.parseInt(br.readLine());
                            System.out.println("IRPF");
                            irpf=Integer.parseInt(br.readLine());
                            System.out.println("Trienios");
                            trienios=Integer.parseInt(br.readLine());
                            addEmployeeF(listadoEmpleadosActivo,numeroSS,nombre,fechaNacimiento,sexo,salario,irpf,trienios);
                        }
                        case 2 -> {
                            tipodeContrato = "Temporal";

                            do {
                                System.out.println("Numero de Seguridad Social");
                                numeroSS=br.readLine();
                            }while(!validateWregex(numeroSS,"^[0-9]{8}[a-zA-Z]$"));
                            System.out.println("Nombre");
                            nombre=br.readLine();

                            do {
                                System.out.println("Fecha de nacimiento");
                                fechaNacimiento=br.readLine();
                            }while(!validateWregex(numeroSS,"^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$"));

                            System.out.println("Sexo(H/M)");
                            //Llamo a un metodo para cortar la String y pasarla a char
                            //Devuelve 0 si el dato no es ok
                            sexo=validateLenght(br.readLine());
                            System.out.println("Fecha de inicio del contrato");
                            fechaInicio=br.readLine();
                            System.out.println("Fecha fin del contrato");
                            fechaFin=br.readLine();
                            System.out.println("Coste por dia del trabajador");
                            precioDia=Double.parseDouble(br.readLine());
                            addEmployeeT(listadoEmpleadosActivo,numeroSS,nombre,fechaNacimiento,sexo,fechaInicio,fechaFin,precioDia);
                        }
                        case 3 -> {
                            continuar = false;
                        }
                    }
                }while(continuar);
            }

            case 2->{

                do {
                    System.out.println("Empleado al que añadir la venta?(NSS)");
                    numeroSS=br.readLine();
                }while(!validateWregex(numeroSS,"^[0-9]{8}[a-zA-Z]$")&&(!buscarEmpleado(listadoEmpleadosActivo,numeroSS).equalsIgnoreCase("Nombre no encontrado")));
                System.out.println("Quieres añadir la venta a "+buscarEmpleado(listadoEmpleadosActivo,numeroSS)+" (Y/N)?");
                if (br.readLine().equalsIgnoreCase("Y")){
                    addSale(listadoEmpleadosActivo,numeroSS);
                }
            }
        }
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

    public static  String buscarEmpleado(ArrayList<Empleado> listadoEmpleadosActivo,String nss){
        ordenarPorAtributo(listadoEmpleadosActivo,nss);
        for(Empleado e:listadoEmpleadosActivo){
            if ((e instanceof EmpTemporal)&&(e.getNss().equalsIgnoreCase(nss))){
                return e.getNombre();
            }
        }
        return "Nombre no encontrado";
    }

    public static void addSale(ArrayList<Empleado> listadoEmpleadosActivo,String nss){
        ordenarPorAtributo(listadoEmpleadosActivo,nss);
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

    public static void ordenarPorAtributo(ArrayList<Empleado> lista, String atributo) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                Empleado p1 = lista.get(i);
                Empleado p2 = lista.get(j);

                if (atributo.equalsIgnoreCase("nss")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
                if (atributo.equalsIgnoreCase("nombre")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
                if (atributo.equalsIgnoreCase("fechaDeNacimiento")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
            }
        }
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

}
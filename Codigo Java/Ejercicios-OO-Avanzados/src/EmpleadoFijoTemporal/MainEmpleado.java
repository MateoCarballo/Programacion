package EmpleadoFijoTemporal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
                            System.out.println("Numero de Seguridad Social");
                            numeroSS=br.readLine();
                            System.out.println("Nombre");
                            nombre=br.readLine();
                            System.out.println("Fecha de nacimiento");
                            fechaNacimiento=br.readLine();
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
                            System.out.println("Numero de Seguridad Social");
                            System.out.println("Nombre");
                            System.out.println("Fecha de nacimiento");
                            System.out.println("Sexo");
                            System.out.println("Fecha de inicio del contrato");
                            System.out.println("Fecha fin del contrato");
                            System.out.println("Coste por dia del trabajador");
                            addEmployeeT();
                        }
                        case 3 -> {
                            continuar = false;
                        }
                    }
                }while(continuar);
            }

            case 2->{

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

    public static void addEmployeeT(){

    }

    public static void validateNSS(String s){

    }

    public boolean validateWregex(String entradaTeclado, String regex) {
        /*
        En la String metemos que queremos comprobar,asi es lo mas generico posible
        "^[0-9]{8}[a-zA-Z]$"


    '^' indica el inicio de la cadena.
    '\d{8}' indica que deben haber exactamente 8 caracteres numéricos del 0 al 9.
    '[a-zA-Z]' indica que el último carácter debe ser una letra en mayúscula o minúscula.
    '$' indica el final de la cadena.

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

}
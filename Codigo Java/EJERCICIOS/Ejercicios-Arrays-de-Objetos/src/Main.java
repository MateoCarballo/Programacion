import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int empleados=10;
        double salarioMedioEmpleados=0;
        double sumaDeSalarios=0;
        Empleado[] misEmpleados=new Empleado[empleados];
        //Cliente[] misClientes=new Cliente[100];

        for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i]= new Empleado();
        }

        for (int i = 0; i < misEmpleados.length; i++) {
            sumaDeSalarios=sumaDeSalarios+misEmpleados[i].getSalario();
        }

        System.out.println("For Each");
        for (Empleado a:misEmpleados) {
            System.out.println(a.toString());
        }
        salarioMedioEmpleados=sumaDeSalarios/misEmpleados.length;

        System.out.println("La media de salarios de los empleados es -> "+salarioMedioEmpleados);
        System.out.println("La suma de todos los salarios es -> "+sumaDeSalarios);

        System.out.println("Bucle for");
        for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println(misEmpleados[i].toString());
            //System.out.println(misEmpleados.toString());
        }

    }


}
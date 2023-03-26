package EmpleadoFijoTemporal;
import java.text.ParseException;
import java.util.ArrayList;

public class Visualizar {

    public void visualiza(ArrayList<Empleado> listaEmpleadosActivos){
        OrdenacionesBusquedas.ordenarPorAtributo(listaEmpleadosActivos,"nombre");
        System.out.println("      Empleado");
        System.out.format("%-15s %-15s\n", "Nombre", "Sueldo");
        for (Empleado e: listaEmpleadosActivos){
            if(e instanceof EmpFijo){
                System.out.format("%-15s %-15s\n",e.getNombre(),((EmpFijo)e).getSalario());

            }
        }

    }

    public void visualiza(ArrayList<Empleado> listaEmpleadosActivos,ArrayList<Empleado> listaEmpleadosBaja) throws ParseException {
        int contador=0;
        OrdenacionesBusquedas.ordenarPorAtributo(listaEmpleadosActivos,"nombre");
        System.out.println("                                Empleados en activo"+"\n");
        System.out.println("Empleados Temporales"+"\n");
        System.out.format("%-15s %-15s %-15s %-15s\n", "Nombre", "Fecha Inicio","Fecha Fin","Sueldo");

        for (Empleado e: listaEmpleadosActivos){
            if(e instanceof EmpTemporal){
                contador+=1;
                System.out.format("%-15s %-15s %-15s %-15s\n",((EmpTemporal)e).getNombre(),((EmpTemporal)e).getFechaInicio(),((EmpTemporal)e).getFechaFin(),((EmpTemporal)e).sueldo());
            }
            if (contador==3){
                System.out.format("%-15s %-15s %-15s %-15s\n", "Nombre", "Fecha Inicio","Fecha Fin","Sueldo");
                contador=0;
            }
        }
        System.out.println("\n");
        System.out.println("Empleados Fijos"+"\n");
        System.out.format("%-15s %-15s %-15s\n", "Nombre", "Trienios","Sueldo");
        contador=0;

        for (Empleado e: listaEmpleadosActivos){

            if(e instanceof EmpFijo){
                contador+=1;
                System.out.format("%-15s %-15s %-15s\n",((EmpFijo)e).getNombre(),((EmpFijo) e).getTrienios(),(e).sueldo());
            }
            if (contador==3){
                System.out.format("%-15s %-15s %-15s\n", "Nombre", "Trienios","Sueldo");
                contador=0;
            }
        }
        System.out.println(                            "\n"+" Empleados dados de baja"+"\n");
        System.out.format("%-15s %-15s\n", "Nombre","Sueldo");
        contador=0;

        for (Empleado e: listaEmpleadosBaja){
            contador+=1;
            System.out.format("%-15s %-15s\n",(e).getNombre(),String.format("%.2f",e.sueldo()));
            if (contador==3){
                System.out.format("%-15s %-15s\n", "Nombre","Sueldo");
                contador=0;
            }
        }
    }
public void visualizarVentasTemporales(ArrayList<Empleado> listaEmpleados,ArrayList<Integer> indices){
    System.out.println(                            "\n"+" Ventas"+"\n");
    System.out.format("%-15s %-15s\n", "Empleado","Total de ventas");
    for (int i = 0; i < indices.size(); i++) {
        System.out.format("%-15s %-15s\n",listaEmpleados.get(indices.get(i)).getNombre(),((EmpTemporal) listaEmpleados.get(indices.get(i))).totalVentas());
    }
}
    }


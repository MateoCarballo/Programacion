package EmpleadoFijoTemporal;
import java.util.ArrayList;

public class Visualizar {

    public void visualiza(ArrayList<Empleado> listaEmpleadosActivos){
        OrdenacionesBusquedas.ordenarPorAtributo(listaEmpleadosActivos,"nombre");
        System.out.println("##################################################");
        System.out.println("                    Empleado                      ");
        System.out.println("##################################################");
        System.out.println("    Nombre                              Sueldo    ");
        System.out.println("##################################################");
        for (Empleado e: listaEmpleadosActivos){

            if(e instanceof EmpFijo){
                String salidaPantalla;
                String espacio=" ";
                do{
                    espacio=espacio+" ";
                    salidaPantalla=e.getNombre()+espacio+((EmpFijo)e).getSalario();
                }while(salidaPantalla.length()<42);
                salidaPantalla="    "+e.getNombre()+espacio+((EmpFijo)e).getSalario();
                System.out.println(salidaPantalla);
                System.out.println("--------------------------------------------------");
            }
        }

    }

    public void visualiza(ArrayList<Empleado> listaEmpleadosActivos,ArrayList<Empleado> listaEmpleadosBaja){

    }
}

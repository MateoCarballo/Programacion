package EmpleadoFijoTemporal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainEmpleado {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tipodeContrato;
        int entradaTeclado;
        ArrayList<Empleado> listadoEmpleadosActivo=         new ArrayList<>();
        ArrayList<Empleado> listadoEmpleadosDadodDeBaja=    new ArrayList<>();

        System.out.println("""
                Menú:
                
                1.Alta nuevo empleado.            
                
               
                
                
                """);
        entradaTeclado=Integer.parseInt(br.readLine());

        switch (entradaTeclado){
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
                        }
                        case 2 -> {
                            tipodeContrato = "Temporal";
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
}
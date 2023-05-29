import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean continuar = true;
        int opcion=0;
        /**
         * 100 filas una para cada alumno
         * la columna [0] es para el nombre
         * la columna [1] es para su nota
         * la columna [2] es para saber si es aprobado o no
         */

        notas misAlumnos= new notas();
        rellenarCampos(misAlumnos.alumnos);

        do {
            System.out.println("\n");
            System.out.println("""
                    Programa de gestion de notas:
                    1.Ver notas.
                    2.Anadir nota.
                    3.Borar nota.
                    4.Estadisticas.
                    5.Ver suspensos.
                    6.Salir
                    """);
            opcion=Integer.parseInt(br.readLine());
            switch (opcion){
                case 1->    misAlumnos.escribirNotas();
                case 2->    misAlumnos.añadirNota();
                case 3->    misAlumnos.borrarNota();
                case 4->    misAlumnos.estadisticas();
                case 5->    misAlumnos.verSuspensos();
                case 6->    continuar=false;
                default -> System.out.println("valor fuera de rango");
            }
        }while(continuar);
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void rellenarCampos(String[][]miMatriz){
        String[] nombres = {"Andres","Brais","Carlos","Daniel","Francisco","Elena","Alba","Marta"};
        for (int i = 0; i < miMatriz.length ; i++) {
            for (int j = 0; j <miMatriz[i].length ; j++) {
                miMatriz[i][j]="*";
            }
        }

        for (int i = 0; i < nombres.length; i++) {
            miMatriz[i][0]=nombres[utilidadesMatematicas.numAleatorioEntero(0,7)];
            miMatriz[i][1]=String.valueOf(utilidadesMatematicas.numAleatorioEntero(0,10));
        }
    }
/*
    public static void escribirNotas(){

    }
    public static void añadirNota(){

    }
    public static void borrarNota(){

    }
    public static void estadisticas(){

    }

    public static void verSuspensos(){

    }


 */
}
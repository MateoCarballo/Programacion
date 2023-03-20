import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean continuar = true;
        int opción;

        materia miMateria= new materia();

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
            opción=Integer.parseInt(br.readLine());
            switch (opción){
                case 1->    miMateria.escribirNotas();
                case 2->    miMateria.misAlumnos.añadirNota();
                case 3->    miMateria.misAlumnos.borrarNota();
                case 4->    miMateria.estadisticas();
                case 5->    miMateria.misAlumnos.verSuspensos();
                case 6->    continuar=false;
                default -> System.out.println("valor fuera de rango");

            }
        }while(continuar);
        System.out.println("FIN DEL PROGRAMA");
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroAlumnos=numAleatorioEntero(5,15);
        int incremento=1000;



        Alumno[] misAlumnos = new Alumno[numeroAlumnos];

        for (int i = 0; i < misAlumnos.length; i++) {
            misAlumnos[i]=new Alumno();
        }
        for (int i = 0; i <  misAlumnos.length; i++) {
            misAlumnos[i].idAlumno=incremento;
            incremento++;
        }
        for (int i = 0; i < misAlumnos.length; i++) {
            System.out.println("Posicion "+i+" del vector de Objetos valor de (idAlumno)-> "+misAlumnos[i].idAlumno);
        }

        for (Alumno mA:misAlumnos){
            System.out.println(mA.nombre);
        }
            /*

            Product[] obj = new Product[5] ;

            System.out.println("Visualización con forEach:");

             */


        }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    }

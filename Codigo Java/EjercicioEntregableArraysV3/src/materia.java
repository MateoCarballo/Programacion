import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;

public class materia {
    alumnos misAlumnos =new alumnos();
    int notaMaxima= Integer.MIN_VALUE;
    int notaMinima= Integer.MAX_VALUE;
    double notaMedia=0.00;

    public materia(){

    }

    public materia(int notaMaxima, int notaMinima, int notaMedia, int filaNotaMinima, int filaNotaMaxima, String[] alumnos, int[] notas) {
        this.notaMaxima = notaMaxima;
        this.notaMinima = notaMinima;
        this.notaMedia = notaMedia;

    }

    public void escribirNotas(){
        for (int i = 0; i < misAlumnos.nombres.length; i++) {
            System.out.println("Nota "+i+": "+misAlumnos.nombres[i]+" "+misAlumnos.notas[i]);
        }
    }
    public void estadisticas(){
        notaMaxima();
        notaMinima ();

        System.out.println("La nota media de los alumnos en la materia es de "+ notaMedia());
        System.out.println("La mejor nota es de "+misAlumnos.nombres[misAlumnos.posicionNotaMaxima]+" con un "+misAlumnos.notas[misAlumnos.posicionNotaMaxima]);
        System.out.println("La peor nota es de "+misAlumnos.nombres[misAlumnos.posicionNotaMinima]+" con un "+misAlumnos.notas[misAlumnos.posicionNotaMinima]);
    }

    public double notaMedia() {
        int numerodeNotas=0;
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if ((misAlumnos.notas[i])!=-1) {
                notaMedia += misAlumnos.notas[i];
                numerodeNotas++;
            }
        }
        notaMedia=notaMedia/numerodeNotas;
        notaMedia = (double) Math.round(notaMedia * 100d) / 100d;
        return notaMedia;
    }
    public int notaMaxima (){
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if (misAlumnos.notas[i]>notaMaxima) {
              notaMaxima=misAlumnos.notas[i];
              misAlumnos.setPosicionNotaMaxima(i);
            }
        }
        return (notaMaxima);
    }
    public int notaMinima (){
        for (int i = 0; i < misAlumnos.notas.length; i++) {
            if ((misAlumnos.notas[i]<notaMinima)&(misAlumnos.notas[i]>0)) {
                notaMinima=misAlumnos.notas[i];
                misAlumnos.setPosicionNotaMinima(i);
            }
        }
        return (notaMinima);
    }
}

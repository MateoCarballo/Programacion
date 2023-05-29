package EjerciciosBidimensionales.Avanzados;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static EjerciciosBidimensionales.misUtilidades.utilidadesArrays.escribirMatriz;
import static EjerciciosBidimensionales.misUtilidades.utilidadesArrays.tresEnRaya;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int filas = 3;
        int columnas = 3;

        String[][] matrizEntradas = new String[filas][columnas];

        for (int i = 0; i < matrizEntradas.length; i++) {
            for (int j = 0; j<matrizEntradas[i].length; j++) {
                matrizEntradas[i][j]="   ";
            }
        }

        tresEnRaya(matrizEntradas);

        for (int i = 0; i < 9; i++) {
            System.out.println("Jugador-1");
            System.out.println("Escribe la fila");
            filas=Integer.parseInt(br.readLine());
            System.out.println("Escribe la columna");
            columnas=Integer.parseInt(br.readLine());
            matrizEntradas[filas][columnas]="X";
            tresEnRaya(matrizEntradas);
            System.out.println("Jugador-2");
            System.out.println("Escribe la fila");
            filas=Integer.parseInt(br.readLine());
            System.out.println("Escribe la columna");
            columnas=Integer.parseInt(br.readLine());
            matrizEntradas[filas][columnas]="O";
            tresEnRaya(matrizEntradas);
        }


    }
}

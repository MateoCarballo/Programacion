package EjerciciosBidimensionales.Avanzados;

import EjerciciosBidimensionales.misUtilidades.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static EjerciciosBidimensionales.misUtilidades.utilidadesArrays.escribirMatriz;


public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int filas = 5;
        int columnas = 5;

        int[][] matrizEntradas = new int[filas][columnas];

        for (int i = 0; i < matrizEntradas.length; i++) {
            for (int j = 0; j<matrizEntradas[i].length; j++) {
                matrizEntradas[i][j] = utilidadesMatematicas.numAleatorioEntero(1, 25);
            }
        }
        escribirMatriz(matrizEntradas);
    }

}


package EjerciciosBidimensionales.Avanzados;

import EjerciciosBidimensionales.misUtilidades.utilidadesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static EjerciciosBidimensionales.misUtilidades.utilidadesArrays.escribirMatriz;

public class Ejercicio2 {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int num1=1;
                int num2=1;
                int filas = 10;
                int columnas = 10;

                int[][] matrizEntradas = new int[filas][columnas];

                for (int i = 0; i < matrizEntradas.length; i++) {
                        for (int j = 0; j<matrizEntradas[i].length; j++) {
                                matrizEntradas[i][j] = num1*num2;
                                num2++;
                        }
                        num1++;
                        num2=1;
                }
                escribirMatriz(matrizEntradas);
        }
}


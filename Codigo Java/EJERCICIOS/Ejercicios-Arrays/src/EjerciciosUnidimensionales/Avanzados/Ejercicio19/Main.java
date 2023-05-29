package EjerciciosUnidimensionales.Avanzados.Ejercicio19;


import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tamañoMatriz=7;

        int[] matrizEntradas = new int[tamañoMatriz];

        for (int i = 0; i < matrizEntradas.length; i++) {
            do {
                System.out.println("Introduce el rating del jugador(entre 1.000 y 2.800)->" + (i+1));
                matrizEntradas[i] = Integer.parseInt(br.readLine());
            }while((matrizEntradas[i]<=1000)|(matrizEntradas[i]>2800));
        }
        utilidadesArrays.ordenarMatrizInt(matrizEntradas,false);
        utilidadesArrays.escribirMatriz(matrizEntradas);
    }
}

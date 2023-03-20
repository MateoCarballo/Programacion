package EjerciciosUnidimensionales.Avanzados.Ejercicio15;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
15.Crea un programa que pida al usuario dos valores N y M y luego cree un array
de tamaño N que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 */

public class Ejercicio15 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tamañoMatriz=0;
        int valorPosiciones=0;

        System.out.println("Tamaño de la matriz?");
        tamañoMatriz=Integer.parseInt(br.readLine());
        System.out.println("Valor a introducir en todas las posiciones?");
        valorPosiciones=Integer.parseInt(br.readLine());

        int[] matrizEntradas = new int[tamañoMatriz];
        Arrays.fill(matrizEntradas,valorPosiciones);

        utilidadesArrays.escribirMatriz(matrizEntradas);


    }
}

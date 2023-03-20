package EjerciciosUnidimensionales.Avanzados.Ejercicio11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int tamanoMatriz = 10;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] matrizInicio = new int[tamanoMatriz];
        int[] matrizFin = new int[tamanoMatriz];
        llenarMatriz(matrizInicio);

        inversaMatriz(matrizInicio,matrizFin);
        System.out.println("Matriz original");
        utilidadesArrays.escribirMatriz(matrizInicio);
        System.out.println("\n");
        System.out.println("Matriz inversa");
        utilidadesArrays.escribirMatriz(matrizFin);
        System.out.println("\n");
    }
    public static void llenarMatriz(int[] miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
        miMatriz[i]=i;
        }
    }
    public static void inversaMatriz(int[] originalMatriz,int[]inversaMatriz){
        int longitudMatriz = (originalMatriz.length-1);
        for (int i = 0; i < originalMatriz.length; i++) {
                inversaMatriz[longitudMatriz]=originalMatriz[i];
                longitudMatriz--;
        }
    }

}
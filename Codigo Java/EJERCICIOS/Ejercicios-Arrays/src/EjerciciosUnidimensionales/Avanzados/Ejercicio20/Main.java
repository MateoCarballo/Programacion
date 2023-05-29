package EjerciciosUnidimensionales.Avanzados.Ejercicio20;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tamañoMatriz = 1000;
        int numeroBuscado=0;
        int numeroVeces=0;
        int[] matrizEntradas = new int[tamañoMatriz];

        utilidadesArrays.llenarMatriz(matrizEntradas,0,99);
        Arrays.sort(matrizEntradas);
        System.out.println("Introduce el numero que quieres comprobar");
        numeroBuscado=Integer.parseInt(br.readLine());

        for (int i = 0; i < matrizEntradas.length; i++) {
            if (matrizEntradas[i]==numeroBuscado){
                numeroVeces++;
            }
        }
        if (numeroVeces!=0){
            System.out.println("Tu numero aparece "+numeroVeces+" veces en la matriz");
        }else{
            System.out.println("Tu numero no aparece");
        }

    }
}
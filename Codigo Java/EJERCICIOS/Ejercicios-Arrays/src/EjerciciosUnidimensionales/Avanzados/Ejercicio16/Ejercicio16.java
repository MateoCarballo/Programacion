package EjerciciosUnidimensionales.Avanzados.Ejercicio16;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio16 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tamañoMatriz=0;
        int posInicio=0;
        int posFin=0;
        int valorPosiciones=1;

        System.out.println("Tamaño de la matriz?");
        tamañoMatriz=Integer.parseInt(br.readLine());

        int[] matrizEntradas = new int[tamañoMatriz];

        for (int j = 0; j < matrizEntradas.length; j++) {
            if (posFin<matrizEntradas.length){
                posFin=posInicio+valorPosiciones;
                Arrays.fill(matrizEntradas,posInicio,posFin,valorPosiciones);
                posInicio=posFin;
                valorPosiciones++;
            }
        }
        utilidadesArrays.escribirMatriz(matrizEntradas);
    }
}
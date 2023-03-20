package EjerciciosUnidimensionales.Avanzados.Ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tamanoMatriz;

        String inicio;
        //pasos es el numero de veces que vamos a incrementar el valor inicial
        String pasos;
        String incremento;

        System.out.println("######### SECUENCIA ARITMETICA #########");
        System.out.println("Dimension de la matriz(numero de posiciones)?");
        tamanoMatriz = br.readLine();
        System.out.println("Inicio?");
        inicio= br.readLine();
        System.out.println("Incremento?");
        incremento= br.readLine();
        int[] matrizEntradas = new int[Integer.parseInt(tamanoMatriz)];
        crearSecuencia(matrizEntradas,Integer.parseInt(inicio),Integer.parseInt(incremento));
        System.out.println("Aqui tienes tu secuencia aritmetica");
        utilidadesArrays.escribirMatriz(matrizEntradas);
    }

    public static void crearSecuencia(int[]miMatriz,int inicio,int incremento){

        for (int i = 0; i <miMatriz.length ; i++) {
            miMatriz[i]=inicio;
            inicio=inicio+incremento;
        }

    }

}
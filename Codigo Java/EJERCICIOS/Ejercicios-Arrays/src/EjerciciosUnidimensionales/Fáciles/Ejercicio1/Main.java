package EjerciciosUnidimensionales.Fáciles.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[] matrizReales =new float[10];
        for (int i = 0; i < matrizReales.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matrizReales[i]=Float.parseFloat(br.readLine());
        }
        for (int i = 0; i < matrizReales.length; i++) {
            System.out.println("Posicion "+ i+"->"+matrizReales[i]);
        }
    }
}
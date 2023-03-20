package EjerciciosUnidimensionales.Fáciles.Ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double acumulado=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float matrizReales[]=new float[10];
        for (int i = 0; i < matrizReales.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matrizReales[i]=Float.parseFloat(br.readLine());
        }
        for (int i = 0; i < matrizReales.length; i++) {
            acumulado=acumulado+matrizReales[i];
        }
        System.out.println("El resultado de la suma de todos los valores introducidos es->"+acumulado);

    }
}

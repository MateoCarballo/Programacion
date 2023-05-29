package EjerciciosUnidimensionales.Fáciles.Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int longitudVector=0;
        int valorPosiciones=0;
        System.out.println("Longitud del vector?(la primera posicion es la cero)");
        longitudVector=Integer.parseInt(br.readLine());
        System.out.println("Valor para rellenar?");
        valorPosiciones=Integer.parseInt(br.readLine());
        int[] matrizEnteros =new int[longitudVector];

        for (int i = 0; i < matrizEnteros.length; i++) {
            matrizEnteros[i]=valorPosiciones;
            System.out.println("Posicion-> "+i+" -> "+matrizEnteros[i]);
        }

    }

}

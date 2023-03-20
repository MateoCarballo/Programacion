package EjerciciosUnidimensionales.Fáciles.Ejercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inicio=0;
        int fin=0;
        int diferencia=0;
        System.out.println("Que numero ocupa la primera posicion de la matriz?");
        inicio=Integer.parseInt(br.readLine());
        System.out.println("Que numero ocupa la ultima posicion?");
        fin=Integer.parseInt(br.readLine());
        diferencia=fin-inicio;
        int[] matrizEnteros =new int[diferencia+1];

        for (int i = 0; i < matrizEnteros.length; i++) {
            matrizEnteros[i]=inicio;
            System.out.println("Posicion-> "+i+" -> "+matrizEnteros[i]);
            inicio++;
        }

    }

}
package EjerciciosUnidimensionales.Fáciles.Ejercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] matrizEnteros =new int[20];

        llenarMatrizEnteros(matrizEnteros);
        System.out.println("La media de todos los numeros introducidos es -> "+ mediaAcumuladoMatriz(matrizEnteros));

    }

    public static void  llenarMatrizEnteros(int matriz[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matriz[i]=Integer.parseInt(br.readLine());
        }
    }

    public static int mediaAcumuladoMatriz(int [] matriz){
        int acumulado=0;

        for (int i = 0; i < matriz.length; i++) {
            acumulado= acumulado+matriz[i];
        }
        return (acumulado/matriz.length);
    }
}
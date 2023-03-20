package EjerciciosUnidimensionales.Fáciles.Ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] matrizEnteros =new int[5];
        llenarMatrizEnteros(matrizEnteros);
        System.out.println("El suma de los numeros mayores de cero es-> "+acumuladoMatriz(matrizEnteros,true));
        System.out.println("El suma de los numeros mayores de cero es-> "+acumuladoMatriz(matrizEnteros,false));
    }

    public static void  llenarMatrizEnteros(int matriz[])throws IOException{

        int acumuladoNeg=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matriz[i]=Integer.parseInt(br.readLine());
        }
    }

    public static int acumuladoMatriz(int [] matriz,boolean acumuladoP){
        int acumulado=0;

        for (int i = 0; i < matriz.length; i++) {

            if ((matriz[i]>0)&&(acumuladoP)){
                acumulado=acumulado+matriz[i];
            }else if ((matriz[i]<0)&&(!acumuladoP)){
                acumulado=acumulado+matriz[i];
            }
        }

        return acumulado;
    }
}
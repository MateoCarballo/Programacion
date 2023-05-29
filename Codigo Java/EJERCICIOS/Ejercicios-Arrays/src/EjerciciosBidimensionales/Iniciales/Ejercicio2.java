package EjerciciosBidimensionales.Iniciales;

import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][]miMatriz=new int[4][5];
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Fila-> "+i);
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.println("Columna-> "+j);
                miMatriz[i][j]=Integer.parseInt(br.readLine());
            }

        }
        utilidadesArrays.escribirMatriz(miMatriz);
    }

}
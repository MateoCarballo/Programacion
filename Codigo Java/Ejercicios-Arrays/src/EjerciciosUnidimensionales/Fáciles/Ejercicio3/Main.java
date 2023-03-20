package EjerciciosUnidimensionales.Fáciles.Ejercicio3;


import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        double acumulado=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double matrizReales[]=new double[10];
        for (int i = 0; i < matrizReales.length; i++) {
            System.out.println("Introduce el numero de la posicion "+i);
            matrizReales[i]=Float.parseFloat(br.readLine());
        }

        utilidadesArrays.ordenarMatrizDouble(matrizReales,true);
        System.out.println("El minimo es ->"+ matrizReales[0]);
        System.out.println("El maximo es ->"+ matrizReales[9]);
    }
}
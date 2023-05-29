package EjerciciosUnidimensionales.Avanzados.Ejercicio8;

import EjerciciosBidimensionales.misUtilidades.utilidadesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int longitudVector = utilidadesMatematicas.numAleatorioEntero(5,10);
        double numero=0;
        double[] matrizReales =new double[longitudVector];

        System.out.println("Escribe un numero y te dire cuantos de los numeros dentro del vector lo superan"+"\n"+
                "(El numero debe estar comprendido entre 0.1 y 0.9 ambos incluidos)");
        numero=Double.parseDouble(br.readLine());

        llenarMatriz(matrizReales);

        System.out.println("Numeros iguales o superiores al introducido -> "+comprobarCondicion(matrizReales,numero));
        System.out.println(" ");
        System.out.println("Escribo la matriz para que compruebes");
        escribirMatriz(matrizReales);
    }
public static void llenarMatriz(double[]miMatriz) {
    for (int i = 0; i < miMatriz.length; i++) {
        miMatriz[i]=utilidadesMatematicas.numAleatorioDouble(0,1);
    }
}

    public static void escribirMatriz(double[]miMatriz){
        System.out.println("Posiciones de la matriz:");
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Posicion: "+i+"->"+miMatriz[i]);
        }
    }

public static int comprobarCondicion(double []miMatriz,double numComprobador){
    // Numero entero para acumular las veces que se cumple la condicion
    int auxiliar=0;
    for (int i = 0; i < miMatriz.length; i++) {
       if(miMatriz[i]>=numComprobador){
           auxiliar++;
       }
    }
return auxiliar;
}
}
package EjerciciosUnidimensionales.Avanzados.Ejercicio12;


import EjerciciosBidimensionales.misUtilidades.utilidadesArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class miMain {
    public static void main(String[] args) throws IOException {
        int tamanoMatriz = 10;
        String posicion;
        String valor;
        String continuar="";
        System.out.println("#########Bienvenido al rellenador de matrices#########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] matrizEntradas = new int[tamanoMatriz];

        do {
            System.out.println("""                            
                    Elige una de las siguientes opciones:
                    a) Mostrar valores.
                    b) Introducir valor.
                    c) Cerrar aplicacion.""");
            continuar = br.readLine();

            if (continuar.equals("a")){
                utilidadesArrays.escribirMatriz(matrizEntradas);
                System.out.println("zzzz");
                utilidadesArrays.ordenarMatrizInt(matrizEntradas,true);
            }
            if (continuar.equals("b")){
                System.out.println("Posicion?");
                posicion=br.readLine();
                System.out.println("Valor?");
                valor=br.readLine();
                llenarMatriz(matrizEntradas,Integer.parseInt(posicion),Integer.parseInt(valor));
            }

        }while((continuar.equals("a"))|(continuar.equals("b")));
    }



    public static void llenarMatriz(int[] miMatriz,int posicion,int valor){
        miMatriz[posicion]=valor;
    }

}

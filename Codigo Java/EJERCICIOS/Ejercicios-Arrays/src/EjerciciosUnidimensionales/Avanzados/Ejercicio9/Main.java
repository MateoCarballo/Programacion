package EjerciciosUnidimensionales.Avanzados.Ejercicio9;

import EjerciciosBidimensionales.misUtilidades.utilidadesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int longitudVector = 100;
    static int[] matrizEnteros =new int[longitudVector];
    static int[] registroPosiciones =new int[longitudVector];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int longitudVector = 100;
        int numero=0;



        System.out.println("Numero a buscar en las posiciones de la matriz(Numero entre 1-10 incluidos)");
        numero=Integer.parseInt(br.readLine());
        //Llenar la matriz con numeros entre 1-10
        llenarMatriz(matrizEnteros);

        System.out.println("El numero -> "+numero+" aparece "+buscarNumero(matrizEnteros,numero)+" veces.");
        System.out.println("Lo encontramos en las posiciones->");

        escribirPosiciones();

        System.out.println(" ");

        System.out.println("Escribo la matriz para que compruebes");
        escribirMatriz(matrizEnteros);
    }
    public static void llenarMatriz(int[]miMatriz) {
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i]= utilidadesMatematicas.numAleatorioEntero(1,10);
        }
    }

    public static void escribirMatriz(int[]miMatriz){
        System.out.println("Posiciones de la matriz:");
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Posicion: "+i+"->"+miMatriz[i]);
        }
    }

    public static int buscarNumero(int []miMatriz,int numBuscado){
        // Numero entero para acumular las veces que se cumple la condicion
        int auxiliar=0;
        for (int i = 0; i < miMatriz.length; i++) {
            /*
            Como tienen la misma dimension y dandose la coincidencia de que todos los numeros fueran iguales copiaria
            la matriz pero nunca me pasaria de rango asi que no pongo antierrores
             */
            if(miMatriz[i]==numBuscado){
               registroPosiciones[auxiliar]=i;
               auxiliar++;
            }
        }
        return auxiliar;
    }
    public static void escribirPosiciones(){
        for (int i = 0; i < registroPosiciones.length; i++) {
            if (registroPosiciones[i]>0) {
                System.out.print(registroPosiciones[i]+" | ");
            }
        }
        System.out.println(" ");
    }
}

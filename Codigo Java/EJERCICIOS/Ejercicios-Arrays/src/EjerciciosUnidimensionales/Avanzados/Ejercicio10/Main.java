package EjerciciosUnidimensionales.Avanzados.Ejercicio10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        int tamanoMatriz;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numero de alturas a registrar?");
        tamanoMatriz =Integer.parseInt(br.readLine());
        double []matrizAlturas=new double [tamanoMatriz];
        /*
        Matriz Resultados.
        Posición 0→ Media de las alturas
        Posición 1→ Maximo
        Posición 2→ Minimo
         */
        double[]resultados=new double[3];
        llenarMatriz(matrizAlturas);
        mediaMatriz(matrizAlturas,resultados);
        System.out.println("La media de todas las alturas introducidas es →"+resultados[0]);
        minMaxMatriz(matrizAlturas,resultados);
        System.out.println("La mayor altura es →"+resultados[1]);
        System.out.println("La menor altura es →"+resultados[2]);

        /*
        No necesito otra matriz para meter los valores ordenados o llenados porque a diferencia de las variables
        apuntamos a la posición de memoria en la que se encuentra (paso por valor), es decir, no trabajamos con una
        copia sino con la propia matriz.
         */
    }
    public static void llenarMatriz(double[]miMatriz)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println("Posicion "+i+":");
            miMatriz[i]= Double.parseDouble(br.readLine());
        }
    }
    public static void mediaMatriz(double[]miMatriz,double[]resultados){
        resultados[0]=0;

        //replace with enhanced for¿?¿?¿?¿?

        for (double v : miMatriz) {
            resultados[0] = resultados[0] + v;
        }
        resultados[0]=(resultados[0]/miMatriz.length);
    }


    public static void minMaxMatriz(double[]miMatriz,double[]resultados){

        for (int i = 0; i < miMatriz.length; i++) {
            if (i==0){
                resultados[1]=miMatriz[i];//Maximo
                resultados[2]=miMatriz[i];//Minimo
            }
            /*
            A partir de este momento si el número guardado en la posicion 'i' es mayor que mi maximo
            se convierte en mi nuevo maximo. El minimo sigue la misma logica
             */
            if ((i!=0)&&(resultados[1]<miMatriz[i])){
                resultados[1]=miMatriz[i];
            }
            if ((i!=0)&&(resultados[2]>miMatriz[i])){
                resultados[2]=miMatriz[i];
            }

        }

    }


}

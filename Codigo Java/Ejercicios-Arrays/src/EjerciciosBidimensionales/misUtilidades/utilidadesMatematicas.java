package EjerciciosBidimensionales.misUtilidades;

import java.util.Random;

public class utilidadesMatematicas {

    public static int generador2(int limSuperior){
        /*
        numero aleatorio hasta valor dado, no incluye el valor que introducimos
     como salida
         */
        Random r =new Random(limSuperior);
        int aleatorio =r.nextInt(limSuperior);
        return aleatorio;
    }

    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    public static double numAleatorioDouble(int limInferior, int limSuperior){
        Double aleatorio = (Double)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    public static boolean booleanoConSemilla (int limiteInferior,int limiteSuperior,int valorSemilla){
        /*
        Genera aleatoriamente valores booleanos (0-1), al introducirle
        una semilla el conjunto de resultados será idéntico.

        Este "generador.next<tipodeDato>();"
        puede generar valores aleatorios de int, float etc.

         */
           Random generador = new Random(valorSemilla);
           boolean miBooleano = generador.nextBoolean();
           return miBooleano;
    }
    /*
    en la variable max guardamos el valor maximo del tipo de dato
    en min el valor mas pequeño del tipo de dato
     */
    public static double max= Double.MIN_VALUE;
    public static double min= Double.MAX_VALUE;

}

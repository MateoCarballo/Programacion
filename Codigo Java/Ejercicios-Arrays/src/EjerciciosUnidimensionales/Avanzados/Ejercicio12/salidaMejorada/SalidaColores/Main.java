package EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores;

import java.util.ArrayList;

import static EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl.Color.*;
import static  EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl.Tabla.visuTabla;

class Main {
    //Reset
    public static final String ANSI_RESET = "\u001B[0m";
    //Colores de letra
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    //Colores de fondo
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    //Vamos a probarlos!!
    public static void main(String[] args) {
        System.out.println("\n\nColor normal!!\n\n");
        System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLUE + "Texto de color azul sobre fondo verde");
        System.out.println("Como no lo he resetado sigue igual.");
        System.out.println("¡Reseteo ahora!" + ANSI_RESET);
        System.out.println("FIN");

        //Usando libreria color_table
        System.out.println(FGRIS + "Uso del metodo now():" + ANSI_RESET);

        System.out.println(CYAN + "Uso del metodo now():" + ANSI_RESET);
        //System.out.println( + "Uso del metodo now():" + ANSI_RESET);

        System.out.println(FAMARILLO + "Uso del metodo now():" + ANSI_RESET);

        System.out.println(CNFB + "Uso del metodo now():" + ANSI_RESET);

        String titulo="LISTA DE ENFERMOS";
        String c1="----DNI-----";
        String c2="---NOMBRE---";
        String c3="--PATOLOGIA-";
        String c4="---SEGUROS--";

        ArrayList resultado;
        resultado = new ArrayList();

        ArrayList fila;
        fila = new ArrayList();
        String n1="  44444444t ";
        String n2="  Maria Rguez ";
        String n3="  Rinitis  ";
        String n4="  Adeslas  ";

        fila.add(n1);
        fila.add(n2);
        fila.add(n3);
        fila.add(n4);

        resultado.add(fila);


       visuTabla(resultado,titulo,c1,c2,c3,c4);
    }
}

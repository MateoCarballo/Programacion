/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl;

/**
 *
 * @author mrnov
 */
public class Color {
    
    public static final String NEGRO = "\u001b[30m";//\033[30m
    public static final String ROJO = "\u001b[31m";//\033[31m
    public static final String VERDE = "\u001b[32m";//\033[32m
    public static final String AMARILLO = "\u001b[33m";//\033[33m
    public static final String AZUL = "\u001b[34m";//\033[34m
    public static final String MAGENTA = "\u001b[35m";//\033[35m
    public static final String CYAN = "\u001b[36m";//\033[36m
    public static final String BLANCO = "\u001b[37m";//\033[37m
    
    public static final String ANSI_RESET = "\u001B[0m";
    
    public static final String FBLANCO = "\u001b[40m";
    public static final String FROJO = "\u001b[41m";
    public static final String FVERDE = "\u001b[42m";
    public static final String FAMARILLO = "\u001b[43m";
    public static final String FAZUL = "\u001b[44m";
    public static final String FMAGENTA = "\u001b[45m";
    public static final String FCYAN = "\u001b[46m";
    public static final String FGRIS = "\u001b[47m";
    public static final String CNFB = "\u001b[30;40m";

    public static final String CBFN = "\u001b[37;30m";

    public Color() {
    }
    
    public static void cNfB(String frase) {
    
    }
    
    public static String sRB(String frase) {
        return frase;
    }
    
    public static void pRB(String frase) {
    
    }
    
    public static String sAzB(String frase) {
        return frase;
    }
    
}

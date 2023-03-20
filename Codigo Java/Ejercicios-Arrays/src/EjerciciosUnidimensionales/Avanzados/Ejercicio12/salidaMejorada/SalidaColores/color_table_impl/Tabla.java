/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl;

import java.util.ArrayList;

import java.util.Iterator;

/**
 *
 * @author mrnov
 */
public class Tabla {

    public Tabla() {
    }
    
    
    // ----------  METODOS PARA LA VISUALIZACION EN UNA TABLA  ---------------//
    
    public static void titulo (String titulo, int n1, int n2) {
        System.out.printf("\033[34m%" + n1 + "s%n", titulo);
        separacion(n2);
    }
    
    public static void cabecera (String [] titulos, int n1) {
        System.out.printf(" ");
        for (String titulo : titulos) {
            System.out.printf("\033[34m%s%-"+ n1 + "s%1$s", "|", titulo);
        }
        System.out.println("");
    }
    
    public static void contenido (String [] contenido, int n1) {
        System.out.printf(" ");
        for (String conten : contenido) {
            System.out.printf("\033[35m%s%-" + n1 + "s%1$s", "|", conten);
        }
        System.out.println("");
    }
    
    public static void separacion (int n1) {
        System.out.printf(" ");
        for (int i = 0; i < n1; i++) {
            System.out.printf("%s", "─");
        }
        System.out.println("");
    }
    
    public static void separadorEnTabla (String nombre, int n1, int n2) {
        System.out.printf(" ");
        for (int i = 0; i < n1; i++) {
            if (i == 0)
                System.out.printf("|");
            
            System.out.printf("%s", "-"); 
           
            if (n2 == i)
                System.out.printf(" %s ", nombre);
            
            if (i == n1 - 1)
                System.out.printf("|");
        }
        System.out.println("");
    }
    
    public static void visuTabla (/*ObjectContainer baseDatos*/ ArrayList resultado,
                                    String titulo,String c1, String c2, String c3, String c4) {
        
//        ObjectSet resultado = baseDatos.queryByExample(new Enfermo());
        
        titulo(titulo, 39, 36);
        cabecera(new String [] {c1, c2, c3, 
                        c4}, 12);
        
        Iterator <ArrayList> it=resultado.iterator();
        
        while (it.hasNext()) {
            ArrayList fila = (ArrayList) it.next();
            System.out.println(fila);
        }

        separacion(36);  
    }
}

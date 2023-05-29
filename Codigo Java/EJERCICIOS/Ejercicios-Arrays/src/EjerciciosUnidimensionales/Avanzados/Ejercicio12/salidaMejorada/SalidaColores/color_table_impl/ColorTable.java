/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl;
import static EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl.Color.*;
import static EjerciciosUnidimensionales.Avanzados.Ejercicio12.salidaMejorada.SalidaColores.color_table_impl.Tabla.*;
import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class ColorTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5Ficheros.FichSecuenciales.LecturaEscrtitura.Main;
import java.io.*;
// Ejemplo de escritura en un fichero binario
/**
 *
 * @author mrnov
 */ 
public class FicheroBinarioEscribir {
     public static void main( String[] args )
    {
        // ----------------
        // Copiar todo un fichero, con bloques de 512 Kb
        // Sin ninguna comprobación de errores
 
        System.out.println("Copiando fichero binario...");
        final int BUFFER_SIZE = 512*1024;
 
        try
        {
            InputStream ficheroEntrada3 = new FileInputStream(
                    new File("fichero.in"));
            OutputStream ficheroSalida3 = new FileOutputStream(
                    new File("fichero2.out"));
 
            byte[] buf = new byte[BUFFER_SIZE];
            int cantidadLeida;
            while ((cantidadLeida = ficheroEntrada3.read(buf, 0, 
                    BUFFER_SIZE)) > 0) 
            {
                ficheroSalida3.write(buf, 0, cantidadLeida);
            }
            ficheroEntrada3.close();
            ficheroSalida3.close();
        }
        catch (Exception errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
 
        System.out.println("Terminado!");
    }
}

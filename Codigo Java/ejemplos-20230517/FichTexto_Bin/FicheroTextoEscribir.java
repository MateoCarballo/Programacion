/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDFicheros.FichSecuenciales.LecturaEscrtitura.Main;
import java.io.*;
/**
 *
 * @author mrnov
 */

// Ejemplo de escritura en un fichero de texto
public class FicheroTextoEscribir {
     public static void main( String[] args )
    {
        System.out.println("Volcando a fichero de texto...");
 
        try
        {
            BufferedWriter ficheroSalida = new BufferedWriter(
                new FileWriter(new File("fichero.txt")));
 
            ficheroSalida.write("Hola");
            ficheroSalida.newLine();
            ficheroSalida.write("Este es");
            ficheroSalida.write(" un fichero de texto");
            ficheroSalida.newLine();
 
            ficheroSalida.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
    }
}

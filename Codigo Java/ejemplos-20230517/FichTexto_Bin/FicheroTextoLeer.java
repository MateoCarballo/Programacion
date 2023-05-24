/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDFicheros.FichSecuenciales.LecturaEscrtitura.Main;
// Ejemplo de lectura desde un fichero de texto
import java.io.*;
/**
 *
 * @author mrnov
 */
public class FicheroTextoLeer {
     public static void main( String[] args )
    {
        // Volcar a un fichero las líneas de otro (de texto)
        // que empiecen por "A"
        // Errores: sólo se comprueba si no existe el de origen
 
        if (! (new File("fichero.txt")).exists() )
        {
            System.out.println("No he encontrado fichero.txt");
            return;
        }
 
        System.out.println("Leyendo fichero de texto...");
 
        try
        {
            BufferedReader ficheroEntrada = new BufferedReader(
                    new FileReader(new File("fichero.txt")));
 
            String linea=null;
            while ((linea=ficheroEntrada.readLine()) != null) {
                System.out.println(linea);
            }
 
            ficheroEntrada.close();
        }
        catch (IOException errorDeFichero)
        {
            System.out.println(
                "Ha habido problemas: " +
                errorDeFichero.getMessage() );
        }
    }
}

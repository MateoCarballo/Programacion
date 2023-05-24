/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5Ficheros.FichSecuenciales.flujodebytes;
import java.io.*;
/**
 *
 * @author Usuario
 */
public class FlujoDeBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));
        int op;
        try{
        do
        {
            System.out.println ("1-Grabar texto");
            System.out.println ("2-Leer texto");
            System.out.println ("3-Salir");
            System.out.println  ("Elegir opción:");
            
            op=Integer.parseInt(lee.readLine());
            
            switch(op)
            {
                case 1: Escribir.escribir();
                    break;
                case 2: Leer.leer();
                    break;
            }  
        }while (op ==1 |op ==2);  
    
    }catch (NumberFormatException e)
    {
      e.getMessage();
        
    }
    }
}
    


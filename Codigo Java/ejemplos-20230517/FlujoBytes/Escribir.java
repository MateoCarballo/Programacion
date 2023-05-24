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
public class Escribir {
        public static void escribir(){
        FileOutputStream fs=null;
        byte [] buffer = new byte [200];
               // String texto=null;
        int nbytes=0;
        try{
            System.out.println("Escribir las definiciones para almacenar en el fichero: ");
            System.out.print("");
                
              
                 File fl=new File("Tema1.txt");
                  
                 if (!fl.exists()){
                  System.out.println( "entra if");  
                 fs = new FileOutputStream(fl);
                 //texto=lee.readLine();
                nbytes=System.in.read();
                fs.write(buffer, 0, nbytes-1);
                 }
                 else
                 {
                      fs = new FileOutputStream(fl,true);
                     // texto=lee.readLine();
                      nbytes=System.in.read(buffer);
                fs.write(buffer, 0, nbytes-1);
                 }
        }
        catch(NumberFormatException e){
            System.out.println("Error."+e.toString());
        }
        catch(IOException e){
            System.out.println("Error."+e.toString());
        }finally{
            try{
                if (fs!=null)
                    fs.close();
            }catch(IOException e){
                System.out.println("Error."+e.toString());
            }
        }
        }
}
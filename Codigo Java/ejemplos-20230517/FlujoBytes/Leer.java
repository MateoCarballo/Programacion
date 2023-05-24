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
public class Leer {
    public static void leer(){
        FileInputStream fe=null;
        byte [] buffer = new byte [200];
        int nbytes;
               
        try{
             
            fe = new FileInputStream("Tema1.txt"); 
            nbytes=fe.read(buffer, 0, 200);
            String str=new String(buffer, 0, nbytes);
             System.out.println("HOLAAA");        
            System.out.println(str);
            
        }catch(IOException e){
            System.out.println("Error."+e.toString());
        }finally{
            try{
                if (fe!=null)
                    fe.close();
             }catch(IOException e){
                System.out.println("Error."+e.toString());
            }
        }
    }
}

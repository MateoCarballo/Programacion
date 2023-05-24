/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD5Ficheros.FichSecuenciales.serializacionobj;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author mrnov
 */
//Esta clase hereda sus propiedades de ObjectOutputStream
public class MiObjectOutputStream extends ObjectOutputStream  {
    //Sobrescribimos el método que crea la cabecera
    protected void writeStreamHeader() throws IOException{
        // No hacer nada.
    }
 
    //Constructores
    public MiObjectOutputStream () throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException{
                super(out);
        }
}
//La idea es que si el fichero binario NO existe, usaremos la clase original
//y si existe usamos nuestra clase creada antes. Para indicar si existe o 
//no un fichero, se puede usar el método exists() de la clase File.

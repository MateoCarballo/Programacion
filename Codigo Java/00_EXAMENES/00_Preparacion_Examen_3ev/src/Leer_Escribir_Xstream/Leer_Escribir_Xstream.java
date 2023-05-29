package Leer_Escribir_Xstream;

import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Leer_Escribir_Xstream {
    //TODO: Se debe de cambiar el parametro objeto por el tipo de dato que deseemos grabar
    public static void writeXML(XStream xstream, Object Objeto, File fileName ) throws FileNotFoundException {
        xstream.toXML(Objeto,new FileOutputStream(fileName));
    }

    public static void readXML(XStream xstream,File fileName){
    //TODO: Cambiar "objeto" por la clase que deseamos cambiar
        try {
            Object objeto = xstream.fromXML(fileName);
        }catch (Exception e){

        }
    }











}

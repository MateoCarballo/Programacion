package Leer_Escribir_Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class EscribirYLeer { /*TODO: En donde pone objeto se debe cambiar por el tipo de dato que se desea recibir,*/
    public static void writeFile(Gson gson, File FileName, Object objeto) throws IOException, FileNotFoundException {
        try {
            gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter writer = new FileWriter(FileName);
            gson.toJson(objeto, writer);
        } catch (FileNotFoundException e) {
        }
    }

    public static void readFile(Gson gson, File FileName, Object objeto) throws FileNotFoundException {
        try {
            gson = new GsonBuilder().setPrettyPrinting().create();
            FileReader Reader = new FileReader(FileName);
            objeto = gson.fromJson(Reader, Object.class); /*TODO: Cambiar el "Object.class" por el tipo de clase que queremos que lea;*//*personas = gson.fromJson(Reader, persona.class); /*TODO: Como deberiamos hacerlo si estamos leyendo un ArrayList de Objetos de la clase Persona* /*/
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}

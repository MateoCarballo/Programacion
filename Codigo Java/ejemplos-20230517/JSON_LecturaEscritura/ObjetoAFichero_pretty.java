/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON.ejemplos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import ficheros.ejemplosApuntesAV.JSON.LecturaEscritura.Asignatura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mrnov
 */
public class ObjetoAFichero_pretty {
    public static void main (String args []) throws IOException{
       // Gson gson = new Gson();

        //Para salida maquetada
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();

 
        Persona persona = new Persona("Maria", "RN", 120);
        persona.getAsignaturas().add(new Asignatura(1,"AADD"));
        persona.getAsignaturas().add(new Asignatura(2,"CD"));

        // Java objects to File
        try (FileWriter writer = new FileWriter("ficheros\\datos_personaConAsig.json")) {
            gson.toJson(persona, writer);
            //directamente en una sentencia???
            //gson.toJson(persona, new FileWriter("datos_personaConAsig2.json"));

            //Generación de la cadena con formato fichero .json
            String json = gson.toJson(persona);

            //maquetación para visualización agradable
            JsonElement je = jp.parse(json);
            String prettyJsonString = gson.toJson(je);

            System.out.println(prettyJsonString);

            //Volcado de la cadena con formato .json en forma de Fich.Texto
            GuardarJSON(json);
        }  
    }
    
    public static void GuardarJSON(String json){
        try (
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros\\datos_personaConAsig.json"))) {
            bw.write(json);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }
    }
}

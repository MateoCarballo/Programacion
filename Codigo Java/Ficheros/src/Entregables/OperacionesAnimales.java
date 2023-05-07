package Entregables;

import Entregables.Animales.Gato;
import Entregables.Animales.Perro;

import java.io.*;

public class OperacionesAnimales {

    // * ATRIBUTOS DE LA CLASE *
    private final String NOMBRE_ARCHIVO = "GuardadoDatosAnimales.dat";
    private final String RUTA_ARCHIVO = System.getProperty("user.dir") + "/" + NOMBRE_ARCHIVO;
    private final int LONGITUD_ARRAY =5;
    private static  Gato[] gatosGuardados;
    private static Perro[] perrosGuardados;
    private int contadorGatos;
    private int contadorPerros;

    // * GETTER Y SETTER NECESARIOS *

    public Gato[] getGatosGuardados() {
        return gatosGuardados;
    }

    public Perro[] getPerrosGuardados() {
        return perrosGuardados;
    }

    public int getContadorGatos() {
        return contadorGatos;
    }

    public int getContadorPerros() {
        return contadorPerros;
    }

    public String getRUTA_ARCHIVO() {
        return RUTA_ARCHIVO;
    }

    // * CONSTRUCTOR *
    public OperacionesAnimales() throws IOException {
        gatosGuardados=new Gato[LONGITUD_ARRAY];
        perrosGuardados=new Perro[LONGITUD_ARRAY];
        settearArrays();
        settearContadores();
    }
    void settearArrays() throws IOException {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()){
            crearFichero(RUTA_ARCHIVO);
        }else{
            //Volcar los datos al ARRAY de perros y al de gatos
        }
    }
    void settearContadores(){
        contadorGatos=0;
        contadorPerros=0;
        for (int i = 0; i < gatosGuardados.length; i++) {
            if(gatosGuardados[i]!=null){
                contadorGatos+=1;
            }
        }
        for (int i = 0; i < gatosGuardados.length; i++) {
            if(perrosGuardados[i]!=null){
                contadorPerros+=1;
            }
        }
    }

    void crearFichero(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()){
            archivo.createNewFile();
        }
    }

    // * METODOS DE LA CLASE PARA ESCRIBIR Y LEER DATOS DEL FICHERO

    public void guardarAnimalesADisco(String rutaFichero) {
        ObjectOutputStream saveData = null;
        File registroAnimales= new File(rutaFichero);

        try {
            saveData = new ObjectOutputStream(new FileOutputStream(rutaFichero));
            for (int i = 0; i < gatosGuardados.length; i++) {
                if(gatosGuardados[i]!=null){
                    saveData.writeObject(gatosGuardados[i]);
                }
            }
            for (int i = 0; i < perrosGuardados.length; i++) {
                if(perrosGuardados[i]!=null){
                    saveData.writeObject(perrosGuardados[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
            e.printStackTrace();
        } finally {
            if (registroAnimales != null) try {
                saveData.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                e.printStackTrace();
            }
        }
    }


    void leerAnimalesDeDisco(){

    }

    //  * METODOS PARA AÑADIR PERROS Y GATOS AL ARRAYLIST *

    public void addGato(Gato gato){
        for (int i = 0; i < gatosGuardados.length; i++) {
            if(gatosGuardados[i]==null){
                gatosGuardados[i]=gato;
                contadorGatos+=1;
            }
        }
    }
    public void addPerro(Perro perro){
        for (int i = 0; i < gatosGuardados.length; i++) {
            if(perrosGuardados[i]==null){
                perrosGuardados[i]=perro;
                contadorPerros+=1;
            }
        }
    }

}

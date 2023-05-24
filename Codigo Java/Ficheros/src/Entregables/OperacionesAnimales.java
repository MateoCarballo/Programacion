package Entregables;

import Entregables.Animales.Animal;
import Entregables.Animales.Gato;
import Entregables.Animales.Perro;

import java.io.*;
import java.util.ArrayList;

public class OperacionesAnimales {

       /*
        TODO pendientes de personalizar las excepciones para cada erros concreto crear
         una clase con las excepciones necesarias, solo mensaje.
     */

    // *ATRIBUTOS DE LA CLASE*
    private final String NOMBRE_ARCHIVO = "GuardadoDatosAnimales.dat";
    private final String RUTA_ARCHIVO = System.getProperty("user.dir") + "/src/Entregables/" + NOMBRE_ARCHIVO;
    private final int LONGITUD_ARRAY = 5;
    private static Gato[] gatosGuardados;
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
        gatosGuardados = new Gato[LONGITUD_ARRAY];
        perrosGuardados = new Perro[LONGITUD_ARRAY];
        settearArrays();
        settearContadores();
    }

    void settearArrays() throws IOException {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()) {
            crearFichero(RUTA_ARCHIVO);
        } else {
            /*
            TODO pendiente de completar esta parte
            leerAnimalesDeDisco(RUTA_ARCHIVO);
             */
        }
    }

    void settearContadores() {
        contadorGatos = 0;
        contadorPerros = 0;
        for (int i = 0; i < gatosGuardados.length; i++) {
            if (gatosGuardados[i] != null) {
                contadorGatos += 1;
            }
        }
        for (int i = 0; i < gatosGuardados.length; i++) {
            if (perrosGuardados[i] != null) {
                contadorPerros += 1;
            }
        }
    }

    void crearFichero(String rutaArchivo) throws IOException {
        File archivo = new File(rutaArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
    }

    // * METODOS DE LA CLASE PARA ESCRIBIR DATOS DEL FICHERO
    public void guardarAnimalesADisco(String rutaFichero) {
        //En este caso podriamos usar directamente RUTA_ARCHIVO que es un parametro de la clase
        guardarNumeroPerros(rutaFichero);
        guardarElementosArrayListPerros(rutaFichero);
        guardarNumeroGatos(rutaFichero);
        guardarElementosArrayListGatos(rutaFichero);

    }

    public void guardarNumeroPerros(String rutaFichero) {
        FileOutputStream saveLength = null;
        File registroAnimales = new File(rutaFichero);
        try {
            saveLength = new FileOutputStream(rutaFichero);
            saveLength.write(perrosGuardados.length);

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                saveLength.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                e.getMessage();
            }
        }
    }

    public void guardarNumeroGatos(String rutaFichero) {
        FileOutputStream saveLength = null;
        File registroAnimales = new File(rutaFichero);
        try {
            saveLength = new FileOutputStream(rutaFichero);
            saveLength.write(gatosGuardados.length);

        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                saveLength.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                e.getMessage();
            }
        }
    }

    public void guardarElementosArrayListPerros(String rutaFichero) {
        ObjectOutputStream saveData = null;
        File registroAnimales = new File(rutaFichero);
        try {
            saveData = new ObjectOutputStream(new FileOutputStream(rutaFichero));
            for (int i = 0; i < perrosGuardados.length; i++) {
                if (perrosGuardados[i] != null) {
                    saveData.writeObject(perrosGuardados[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir array Perros");
            e.printStackTrace();
        } finally {
            if (registroAnimales != null) try {
                saveData.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                e.getMessage();
            }
        }
    }

    public void guardarElementosArrayListGatos(String rutaFichero) {
        ObjectOutputStream saveData = null;
        File registroAnimales = new File(rutaFichero);
        try {
            saveData = new ObjectOutputStream(new FileOutputStream(rutaFichero));
            for (int i = 0; i < gatosGuardados.length; i++) {
                if (gatosGuardados[i] != null) {
                    saveData.writeObject(gatosGuardados[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al escribir array de Gatos");
            e.printStackTrace();
        } finally {
            if (registroAnimales != null) try {
                saveData.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
                e.getMessage();
            }
        }
    }

    //  * METODOS DE LA CLASE PARA LEER DATOS DE FICHERO
    public void leerAnimalesDeDisco(String rutaFichero) {
        leerElementosArrayListPerros(rutaFichero);
        leerElementosArrayListGatos(rutaFichero);
    }

    public void leerElementosArrayListPerros(String rutaFichero) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(rutaFichero));
            for (int i = 0; i < perrosGuardados.length; i++) {
                if (objectInputStream.readObject() instanceof Perro) {
                    perrosGuardados[i] = (Perro) objectInputStream.readObject();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    public void leerElementosArrayListGatos(String rutaFichero) {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(rutaFichero));
            for (int i = 0; i < gatosGuardados.length; i++) {
                if (objectInputStream.readObject() instanceof Gato) {
                    gatosGuardados[i] = (Gato) objectInputStream.readObject();
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }


    //  * METODOS PARA AÑADIR PERROS Y GATOS AL ARRAY *
    public boolean addGato(Gato gato) {
        int posicionGatoEscrito = 0;
        boolean esPosibleEscribir =false;

        for (int i = 0; i < gatosGuardados.length; i++) {
            if (gatosGuardados[i] == null) {
                posicionGatoEscrito = i;
                esPosibleEscribir=true;
            }
        }

        if (esPosibleEscribir){
            gatosGuardados[posicionGatoEscrito] = gato;
            contadorGatos += 1;
        }
        return esPosibleEscribir;
    }

    public boolean addPerro(Perro perro) {
        int posicionPerroEscrito =0;
        boolean esPosibleEscribir=false;

        for (int i = 0; i < gatosGuardados.length; i++) {
            if (perrosGuardados[i] == null) {
                posicionPerroEscrito = i;
                esPosibleEscribir=true;
            }
        }

        if (esPosibleEscribir){
            perrosGuardados[posicionPerroEscrito] = perro;
            contadorPerros += 1;
        }
        return esPosibleEscribir;
    }
}
package examen.Biblioteca.POJOS;

import examen.Biblioteca.POJOS.ConsorcioBibliotecas.Consorcio;

import java.io.*;
import java.util.ArrayList;

public class ConexionesFicheros {

    public File crearFicheroDat(String ficheroPath) throws IOException {
        File fileDat = new File(ficheroPath);
        if (!fileDat.exists()) fileDat.createNewFile();
        return fileDat;
    }


    public void writeConsorcio(Consorcio consorcio, String pathToWrite) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(pathToWrite));
            out.writeObject(consorcio);
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public Consorcio readConsorcio(String pathToRead) throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        Consorcio consorcio= null;
        try {
            in = new ObjectInputStream(new FileInputStream(pathToRead));
            try {while (true) {
            consorcio= (Consorcio) in.readObject();
            }}catch(EOFException e){}
        } finally {
            if(in !=null){
                in.close();
            }
        }
        return consorcio;
    }
}

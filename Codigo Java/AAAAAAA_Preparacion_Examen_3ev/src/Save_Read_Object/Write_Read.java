package Save_Read_Object;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import Creacion_Ficheros.CreateFiles;

public class Write_Read {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Prueba> Arr = new ArrayList();
        Arr.add(new Prueba("Hola"));
        Arr.add(new Prueba("soy"));
        Arr.add(new Prueba("una"));
        Arr.add(new Prueba("prueba"));

        CreateFiles createFile = new CreateFiles();
        Write_Read save = new Write_Read();
        Collections.sort(Arr,(Prueba a ,Prueba b)->a.clasedePrueba.compareToIgnoreCase(b.clasedePrueba));
        File fichero = createFile.createDatFile("Hola");
        save.writeObject(Arr, fichero);
        save.readObject(fichero);



    }


    public Write_Read() {
    }

    public void writeObject(ArrayList<Prueba> ArrayList, File File) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(File));
            out.writeObject(ArrayList);

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

    public void readObject(File File) throws IOException, ClassNotFoundException {
        ObjectInputStream in = null;
        ArrayList<Prueba> Lista = null;
        try {
            in = new ObjectInputStream(new FileInputStream(File));
            try {while (true) {

                    Lista = (ArrayList<Prueba>) in.readObject();
                }}catch(EOFException e){}


            } finally {
            if(in !=null){
                in.close();
            }
            /*for (Prueba p: Lista
                 ) {
                System.out.println(p);

            }*/

            }

        }
    }


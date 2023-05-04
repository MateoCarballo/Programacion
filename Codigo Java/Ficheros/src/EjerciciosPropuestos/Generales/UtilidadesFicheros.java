package EjerciciosPropuestos.Generales;

import EjerciciosPropuestos.Ejercicio_05.Vehiculo;
import java.io.*;
import java.util.ArrayList;

public class UtilidadesFicheros {

    public void createFileIfItDoesntExist (String filePath) throws IOException {
        File filetoCreate = new File(filePath);
        if(!filetoCreate.exists()){
            filetoCreate.createNewFile();
        }
    }

    public void writeFile('Introducir arrayList AQUÍ',String filePath) throws IOException {
        File register = new File(filePath);
        ObjectOutputStream write =null;
        try{
            write = new ObjectOutputStream(new FileOutputStream(register));
            write.writeObject('Lista de objetos a guardar');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(write!= null){
                write.close();
            }
        }
    }

    public static ArrayList<'Tipo de dato del ArrayList'> readFile('Posible parametro de entrada', String sourcePath) throws IOException {
        File register = new File(sourcePath);
        ObjectInputStream read =null;
        ArrayList<'Tipo de dato del arrayList'> myList;
        try{
            read = new ObjectInputStream(new FileInputStream(register));
            myList= (ArrayList<Vehiculo>) read.readObject();
            for (Vehiculo objectOfList:myList) {
                objefctsOfList.toString();
            }
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(read!= null){
                read.close();
            }
        }
        return myList;
    }

}

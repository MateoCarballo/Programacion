package EjerciciosPropuestos.Ejercicio_04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_04 {
    public static void main(String[] args) throws IOException {
        System.out.println("######### EJERCICIO 04 ##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String sourcePath= "C:\\Users\\a22mateoca\\Desktop\\Ficheros\\src\\Ficheros\\";
        String sourcePath= "C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_04\\";
        File register = new File(sourcePath+"Register.dat");
        if (!register.exists()){
            register.createNewFile();
        }else{
            writteCarsSaved(readRegister(sourcePath));
        }
        String matricula = "matricula";
        String marca= "marca";
        String modelo = "modelo";
        int volumenDeposito= 100;
        saveCar(createCar(matricula,marca,modelo,volumenDeposito),sourcePath);

    }
    public static Vehiculo createCar (String matricula,String marca,String modelo,int volumenDeposito){
        Vehiculo miCoche= new Vehiculo(matricula,marca,modelo,volumenDeposito);
        return miCoche;
    }

    public static boolean saveCar(Vehiculo car, String sourcePath) throws IOException {
        boolean writeComplete = false;
        File register = new File(sourcePath+"Register.dat");
        DataOutputStream writeAtributes =null;
        try{
                writeAtributes = new DataOutputStream(new FileOutputStream(register));
                writeAtributes.writeUTF(car.getMatricula());
                writeAtributes.writeUTF(car.getMarca());
                writeAtributes.writeUTF(car.getModelo());
                writeAtributes.writeInt(car.getVolumenDesposito());
                writeComplete=true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(writeAtributes!= null){
                writeAtributes.close();
            }
        }
        return writeComplete;
    }

    public static ArrayList<Vehiculo> readRegister(String sourcePath) throws IOException {
        ArrayList<Vehiculo> vehiclelist = new ArrayList<>();
        boolean readComplete=false;
        File register = new File(sourcePath+"Register.dat");
        DataInputStream readAtributes =null;
        try{
            readAtributes = new DataInputStream(new FileInputStream(register));
            while(readAtributes.available()>0){
                String matricula = readAtributes.readUTF();
                String marca = readAtributes.readUTF();
                String modelo = readAtributes.readUTF();
                int volumenDeposito= readAtributes.readInt();
                vehiclelist.add(createCar(matricula,marca,modelo,volumenDeposito));
                readComplete=true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(readAtributes!= null){
                readAtributes.close();
            }
        }
        if(readComplete){
            return vehiclelist;
        }else{
            return null;
        }
    }

    public static void writteCarsSaved(ArrayList <Vehiculo> savedCars){
        for (Vehiculo v :savedCars) {
            System.out.println(v.toString());
        }
    }
}
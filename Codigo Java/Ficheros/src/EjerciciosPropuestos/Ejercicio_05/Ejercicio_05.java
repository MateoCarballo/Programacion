package EjerciciosPropuestos.Ejercicio_05;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Ejercicio_05 {
    private static final String SOURCE_PATH_EJ5 = "C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_05\\Register.ser";
    public static void main(String[] args) throws IOException {
        System.out.println("######### EJERCICIO 05 ##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String sourcePath= "C:\\Users\\a22mateoca\\Desktop\\Ficheros\\src\\Ficheros\\";
        File register = new File(SOURCE_PATH_EJ5);
        ArrayList<Vehiculo> vehicleList=new ArrayList<>();
        if (!register.exists()){
            register.createNewFile();
        }else{
            if(register.length()!=0){
                // writteCarsSaved(readRegister(vehicleList,SOURCE_PATH));
            }
        }
        String matricula = "";
        String marca= "";
        String modelo = "";
        int volumenDeposito;
        Vehiculo car = null;


        matricula = "1111-AAA";
        marca= "Peugeot";
        modelo = "508 GT";
        volumenDeposito= 70;
        car=createCar(matricula,marca,modelo,volumenDeposito);
        vehicleList.add(car);

        matricula = "2222-BBB";
        marca= "Peugeot";
        modelo = "308 GTI";
        volumenDeposito= 60;
        car=createCar(matricula,marca,modelo,volumenDeposito);
        vehicleList.add(car);

        matricula = "3333-CCC";
        marca= "Audi";
        modelo = "RS6";
        volumenDeposito= 90;
        car=createCar(matricula,marca,modelo,volumenDeposito);
        vehicleList.add(car);

        saveList(vehicleList, SOURCE_PATH_EJ5);
        writteCarsSaved(readRegister(vehicleList, SOURCE_PATH_EJ5));

    }
    public static Vehiculo createCar (String matricula,String marca,String modelo,int volumenDeposito){
        Vehiculo miCoche= new Vehiculo(matricula,marca,modelo,volumenDeposito);
        return miCoche;
    }

    public static boolean saveList(ArrayList<Vehiculo>vehicleList, String sourcePath) throws IOException {
        boolean writeComplete = false;
        File register = new File(sourcePath);
        ObjectOutputStream write =null;
        try{
            write = new ObjectOutputStream(new FileOutputStream(register));
            write.writeObject(vehicleList);
            writeComplete=true;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(write!= null){
                write.close();
            }
        }
        return writeComplete;
    }

    public static ArrayList<Vehiculo> readRegister(ArrayList<Vehiculo>vList, String sourcePath) throws IOException {
        File register = new File(sourcePath);
        ObjectInputStream read =null;
        try{
            read = new ObjectInputStream(new FileInputStream(register));
            vList= (ArrayList<Vehiculo>) read.readObject();
            for (Vehiculo v:vList) {
                System.out.println(v.toString());
            }
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(read!= null){
                read.close();
            }
        }
        return vList;
    }

    public static void writteCarsSaved(ArrayList <Vehiculo> savedCars){
        for (int i = 0; i < savedCars.size(); i++) {
            JOptionPane.showMessageDialog(null, "Elemento" + i + " " + savedCars.get(i));
        }
    }
}
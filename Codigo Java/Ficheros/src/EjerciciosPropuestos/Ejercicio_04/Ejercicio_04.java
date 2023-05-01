package EjerciciosPropuestos.Ejercicio_04;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_04 {
    private static final String SOURCE_PATH = "C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_04\\Register.dat";
    public static void main(String[] args) throws IOException {
        System.out.println("######### EJERCICIO 04 ##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String sourcePath= "C:\\Users\\a22mateoca\\Desktop\\Ficheros\\src\\Ficheros\\";
        File register = new File(SOURCE_PATH);
        if (!register.exists()){
            register.createNewFile();
        }else{
            if(register.length()!=0){
                writteCarsSaved(readRegister(SOURCE_PATH));
            }
        }
        String matricula = "";
        String marca= "";
        String modelo = "";
        int volumenDeposito;
        Vehiculo carrrr = null;
        matricula = "1111-AAA";
        marca= "Peugeot";
        modelo = "508·GT";
        volumenDeposito= 70;
        carrrr=createCar(matricula,marca,modelo,volumenDeposito);
        saveCar(carrrr,SOURCE_PATH);
        JOptionPane.showMessageDialog(null,carrrr);
        matricula = "2222-BBB";
        marca= "Peugeot";
        modelo = "308·GTI";
        volumenDeposito= 60;
        carrrr=createCar(matricula,marca,modelo,volumenDeposito);
        JOptionPane.showMessageDialog(null,carrrr);
        saveCar(carrrr,SOURCE_PATH);
        matricula = "3333-CCC";
        marca= "Audi";
        modelo = "RS6";
        volumenDeposito= 90;
        carrrr=createCar(matricula,marca,modelo,volumenDeposito);
        JOptionPane.showMessageDialog(null,carrrr);
        saveCar(carrrr,SOURCE_PATH);

    }
    public static Vehiculo createCar (String matricula,String marca,String modelo,int volumenDeposito){
        Vehiculo miCoche= new Vehiculo(matricula,marca,modelo,volumenDeposito);
        return miCoche;
    }

    public static boolean saveCar(Vehiculo car, String sourcePath) throws IOException {
        boolean writeComplete = false;
        File register = new File(sourcePath);
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
        File register = new File(sourcePath);
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
        for (int i = 0; i < savedCars.size(); i++) {
            JOptionPane.showMessageDialog(null, "Elemento" + i + " " + savedCars.get(i));
        }
    }
}
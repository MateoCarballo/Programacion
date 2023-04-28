package EjerciciosPropuestos.Ejercicio_04;

import java.io.*;

public class Ejercicio_04 {

    public static void main(String[] args) throws IOException {
        System.out.println("######### EJERCICIO 04 ##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sourcePath= "C:\\Users\\a22mateoca\\Desktop\\Ficheros\\src\\Ficheros\\";
        File register = new File(sourcePath+"Register.dat");
        if (!register.exists()){
            register.createNewFile();
        }

        String matricula = br.readLine();
        String marca= br.readLine();
        String modelo = br.readLine();
        int volumenDeposito= Integer.parseInt(br.readLine());


        saveCar(createCar(matricula,marca,modelo,volumenDeposito),sourcePath);

    }
    public static Vehiculo createCar (String matricula,String marca,String modelo,int volumenDeposito){
        Vehiculo miCoche= new Vehiculo(matricula,marca,modelo,volumenDeposito);
        return miCoche;
    }


    public static void saveCar(Vehiculo Coche,String sourcePath) throws IOException {
        File register = new File(sourcePath+"Register.dat");
        DataOutputStream writeAtributes =null;
        try{
        writeAtributes = new DataOutputStream(new FileOutputStream(register));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally{
            if(writeAtributes!= null){
                writeAtributes.close();
            }
        }

    }

    public static void readCar(Vehiculo Coche,String sourcePath) {

    }
}
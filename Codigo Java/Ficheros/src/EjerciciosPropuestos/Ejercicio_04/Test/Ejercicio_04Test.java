package EjerciciosPropuestos.Ejercicio_04.Test;

import EjemplosTeoria.Main;
import EjerciciosPropuestos.Ejercicio_04.Ejercicio_04;
import EjerciciosPropuestos.Ejercicio_04.Vehiculo;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_04Test {

    private static final String SOURCE_PATH = "C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_04\\";
    private static final String REGISTER_FILE = "Register.dat";

    @AfterEach
    void tearDown() {
        //Añadir cerrar las conexiones de lectura y escritura
        File file = new File(SOURCE_PATH + REGISTER_FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    @org.junit.jupiter.api.Test
    void createCar() {
        String matricula = "matricula";
        String modelo="modelo";
        String marca="marca";
        int volumendDeposito=100;
        Vehiculo car=Ejercicio_04.createCar(matricula,marca,modelo,volumendDeposito);
        Assert.assertEquals(car.getMatricula(),matricula);
        Assert.assertEquals(car.getMarca(),marca);
        Assert.assertEquals(car.getModelo(),modelo);
        Assert.assertEquals(car.getVolumenDesposito(),volumendDeposito);
    }

    @org.junit.jupiter.api.Test
    void saveCar() throws IOException {
        String matricula = "matricula";
        String modelo="modelo";
        String marca="marca";
        int volumenDeposito=100;
        Vehiculo car = Ejercicio_04.createCar(matricula, marca, modelo, volumenDeposito);
        assertTrue(Ejercicio_04.saveCar(car, SOURCE_PATH));
    }

    @org.junit.jupiter.api.Test
    void readCar() {
    }
}
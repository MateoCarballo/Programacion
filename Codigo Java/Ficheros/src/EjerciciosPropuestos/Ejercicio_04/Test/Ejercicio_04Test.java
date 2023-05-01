package EjerciciosPropuestos.Ejercicio_04.Test;

import EjemplosTeoria.Main;
import EjerciciosPropuestos.Ejercicio_04.Ejercicio_04;
import EjerciciosPropuestos.Ejercicio_04.Vehiculo;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_04Test {
    private static final String SOURCE_PATH = "C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_04\\Register.dat";
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        //TODO Añadir cerrar las conexiones
        // de lectura y escritura sería necesario ?
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

    @Test
    void readRegister() throws IOException {
        ArrayList <Vehiculo> vehicles = new ArrayList<>();
        String matricula = "1111-AAA";
        String modelo="508·GT";
        String marca="Peugeot";
        int volumenDeposito=75;
        Vehiculo car = Ejercicio_04.createCar(matricula, marca, modelo, volumenDeposito);
        Ejercicio_04.saveCar(car, SOURCE_PATH);
        vehicles=Ejercicio_04.readRegister(SOURCE_PATH);
        assert vehicles != null;
        Assertions.assertEquals(vehicles.get(0).getMarca(),marca);
        Assertions.assertEquals(vehicles.get(0).getModelo(),modelo);
        Assertions.assertEquals(vehicles.get(0).getMatricula(),matricula);
        Assertions.assertEquals(vehicles.get(0).getVolumenDesposito(),volumenDeposito);

    }
}
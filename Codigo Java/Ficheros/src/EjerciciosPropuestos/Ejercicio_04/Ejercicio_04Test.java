package EjerciciosPropuestos.Ejercicio_04;

import EjemplosTeoria.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio_04Test {


    @org.junit.jupiter.api.Test
    void createCar() {

    }

    @org.junit.jupiter.api.Test
    void saveCar() throws IOException {
        Vehiculo car = Ejercicio_04.createCar("matricula","marca","modelo",100);
        Assertions.assertTrue(Ejercicio_04.saveCar(car,"C:\\Users\\mateo\\Desktop\\Organizacion Git Marzo\\Programacion\\Codigo Java\\Ficheros\\src\\EjerciciosPropuestos\\Ejercicio_04\\"));

    }

    @org.junit.jupiter.api.Test
    void readCar() {
    }
}
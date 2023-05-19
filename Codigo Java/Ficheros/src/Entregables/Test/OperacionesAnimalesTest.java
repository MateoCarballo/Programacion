package Entregables.Test;

import Entregables.Animales.Gato;
import Entregables.Animales.Perro;
import Entregables.OperacionesAnimales;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;

class OperacionesAnimalesTest {

    OperacionesAnimales misOperaciones= new OperacionesAnimales();

    OperacionesAnimalesTest() throws IOException {
    }

    @BeforeClass
    @Test
    void setCondiciones(){
        Gato gatoPadre = new Gato("Gato Padre",10,true);
        Perro perroPadre = new Perro("Perro Padre",10,true);
        misOperaciones.addGato(gatoPadre);
        misOperaciones.addGato(gatoPadre);
        misOperaciones.addGato(gatoPadre);
        misOperaciones.addGato(gatoPadre);
        misOperaciones.addPerro(perroPadre);
        misOperaciones.addPerro(perroPadre);
        misOperaciones.addPerro(perroPadre);
        misOperaciones.addPerro(perroPadre);
    }
    @Test
    @DisplayName("Insertar un gato sabiendo que tenemos espacio-> El metodo devuelve TRUE")
    void addGato1() throws IOException {
        Gato gato = new Gato("Gato",10,false);
        assertTrue(misOperaciones.addGato(gato));
    }
    @Test
    @DisplayName("Insertar un perro sabiendo que tenemos espacio-> El metodo devuelve TRUE")
    void addPerro1() throws IOException {
        Perro perro = new Perro("Perro",10,false);
        assertTrue(misOperaciones.addPerro(perro));
    }

    @Test
    @DisplayName("Insertar un gato sabiendo que NO tenemos espacio-> El metodo devuelve FALSE")
    void addGato2() throws IOException {
        Gato gato = new Gato("Gato",10,false);
        misOperaciones.addGato(gato);
        assertFalse(misOperaciones.addGato(gato));
    }
    @Test
    @DisplayName("Insertar un perro sabiendo que NO tenemos espacio-> El metodo devuelve FALSE")
    void addPerro2() throws IOException {
        Perro perro = new Perro("Perro",10,false);
        misOperaciones.addPerro(perro);
        assertFalse(misOperaciones.addPerro(perro));
    }
    @Test
    void guardarAnimalesADisco() {
    }

    @Test
    void guardarNumeroPerros() {
    }

    @Test
    void guardarNumeroGatos() {
    }

    @Test
    void guardarElementosArrayListPerros() {
    }

    @Test
    void guardarElementosArrayListGatos() {
    }

    @Test
    void leerAnimalesDeDisco() {
    }

}
package Entregables.Test;

import Entregables.Animales.Gato;
import Entregables.Animales.Perro;
import Entregables.OperacionesAnimales;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesAnimalesTest {

    OperacionesAnimales misOperaciones= new OperacionesAnimales();

    OperacionesAnimalesTest() throws IOException {
    }

    @BeforeEach
    void setUp(){

    }

    @Test
    void addGato() throws IOException {
        OperacionesAnimales misOperaciones= new OperacionesAnimales();
        Gato gato1 = new Gato("gato1",10,true);
        Gato gato2 = new Gato("gato2",10,false);
        misOperaciones.addGato(gato1);
        misOperaciones.addGato(gato2);
        Gato gatos[]= misOperaciones.getGatosGuardados();
        Assert.assertEquals(gatos[0],gato1);
        Assert.assertEquals(gatos[1],gato1);
    }

    @Test
    void addPerro() throws IOException {
        Perro perro1 = new Perro("perro1",10,true);
        Perro perro2 = new Perro("perro2",10,false);
        misOperaciones.addPerro(perro1);
        misOperaciones.addPerro(perro2);
        Perro perros[]= misOperaciones.getPerrosGuardados();
        Assert.assertEquals(perros[0],perro1);
        Assert.assertEquals(perros[1],perro1);
    }
    @Test
    void guardarAnimalesADisco(){
        Perro perros[]= new Perro[5];
        perros[0]=new Perro("perro0",0,true);
        perros[1]= new Perro("perro1",1,false);
        perros[2]= new Perro("perro2",2,true);
        perros[3]= new Perro("perro3",3,false);
        perros[4]= new Perro("perro4", 4,true);
        misOperaciones.guardarAnimalesADisco(misOperaciones.getRUTA_ARCHIVO());
        File file = new File(misOperaciones.getRUTA_ARCHIVO());

    }

}
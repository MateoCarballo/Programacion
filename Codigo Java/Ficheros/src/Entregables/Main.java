package Entregables;

import Entregables.Animales.Gato;
import Entregables.Animales.Perro;

import java.io.IOException;
import java.sql.Array;

public class Main {
    public static void main(String[] args) throws IOException {
        OperacionesAnimales op = new OperacionesAnimales();

        op.leerAnimalesDeDisco(op.getRUTA_ARCHIVO());

        Gato gatos[] = op.getGatosGuardados();
        Perro perros[]= op.getPerrosGuardados();

        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i] != null){
                System.out.println(gatos[i].toString());
            }
        }
        for (int i = 0; i < perros.length; i++) {
            if (perros[i] != null){
                System.out.println(perros[i].toString());
            }
        }
    }
}

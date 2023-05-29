package EjercicioCartas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mazo miMazo= new Mazo();
        int puntosJugada=0;
        for (int i = 0; i < miMazo.mazoCartas.size(); i++) {
            System.out.println("Palo de la carta "+(i+1)+" del mazo "+miMazo.mazoCartas.get(i).getPaloCarta());
        }
    int valorJugada=0;

        for (int i = 0; i < miMazo.mazoCartas.size(); i++) {
            switch (miMazo.mazoCartas.get(i).getPaloCarta()){
                case ORO -> {
                    valorJugada=+10;
                }
                case COPAS -> {
                    valorJugada=+8;
                }
                case ESPADAS -> {
                    valorJugada=+5;
                }
                case BASTOS -> {
                    valorJugada=+1;
                }
            }


        }
        System.out.println("La jugada ha sido de "+valorJugada+" puntos");

    }


}


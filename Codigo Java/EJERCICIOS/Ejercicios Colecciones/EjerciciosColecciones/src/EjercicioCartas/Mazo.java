package EjercicioCartas;

import java.util.ArrayList;

public class Mazo {

    ArrayList<Carta> mazoCartas= new ArrayList<>();

    public Mazo() {
        for (int i = 0; i < 8; i++) {
        switch (numAleatorioEntero(1, 4)) {
            case 1 -> {
                mazoCartas.add(new Carta(Carta.Palo.ORO, numAleatorioEntero(1, 12)));
            }
            case 2 -> {
                mazoCartas.add(new Carta(Carta.Palo.COPAS, numAleatorioEntero(1, 12)));
            }
            case 3 -> {
                mazoCartas.add(new Carta(Carta.Palo.ESPADAS, numAleatorioEntero(1, 12)));
            }
            case 4 -> {
                mazoCartas.add(new Carta(Carta.Palo.BASTOS, numAleatorioEntero(1, 12)));
            }
        }
    }
    }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
}

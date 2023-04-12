package EjercicioFutbolista;

import EjercicioCartas.Carta;

import java.util.ArrayList;

import static EjercicioCartas.Mazo.numAleatorioEntero;

public class Main {
    public static void main(String[] args) {
        ArrayList<Futbolista> plantilla= new ArrayList<>();
        rellenarEquipo(plantilla);
        printearPlantilla(plantilla);

    }
    public static void rellenarEquipo(ArrayList<Futbolista> plantilla){
        int numeroDorsal=0;
        for (int i = 0; i < 23; i++) {
            numeroDorsal++;
            switch (numAleatorioEntero(1, 4)) {
                case 1 -> {
                    plantilla.add(new Futbolista("Portero", numeroDorsal, Demarcacion.PORTERO, Equipo.BARCELONA));
                }
                case 2 -> {
                    plantilla.add(new Futbolista("Defensa", numeroDorsal, Demarcacion.DEFENSA, Equipo.BARCELONA));
                }
                case 3 -> {
                    plantilla.add(new Futbolista("Centrocampista", numeroDorsal, Demarcacion.CENTROCAMPISTA, Equipo.BARCELONA));
                }
                case 4 -> {
                    plantilla.add(new Futbolista("Delantero", numeroDorsal, Demarcacion.DELANTERO, Equipo.BARCELONA));
                }
            }
        }
    }
   public static void printearPlantilla(ArrayList<Futbolista> plantilla){
       for (int i = 0; i < plantilla.size(); i++) {
           System.out.println(plantilla.get(i));
       }
   }
}


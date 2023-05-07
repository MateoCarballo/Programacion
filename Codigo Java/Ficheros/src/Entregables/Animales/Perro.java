package Entregables.Animales;

import Entregables.Animales.Animal;

public class Perro extends Animal {
    private boolean tieneRaboLargo;

    public Perro(String nombre, int edad, boolean tieneRaboLargo) {
        super(nombre, edad);
        this.tieneRaboLargo = tieneRaboLargo;
    }

    public boolean isTieneRaboLargo() {
        return tieneRaboLargo;
    }

    public void setTieneRaboLargo(boolean tieneRaboLargo) {
        this.tieneRaboLargo = tieneRaboLargo;
    }

    @Override
    protected void expresarse() {
        System.out.println("GUAU GUAU");
    }

    @Override
    public String toString() {
        return super.toString()+
                "tieneRaboLargo=" + tieneRaboLargo +
                '}';
    }
}

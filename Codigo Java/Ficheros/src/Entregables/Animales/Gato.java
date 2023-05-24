package Entregables.Animales;

import Entregables.Animales.Animal;

public class Gato extends Animal {

    private boolean tieneRaboLargo;

    public Gato(String nombre, int edad, boolean tieneRaboLargo) {
        super(nombre, edad);
        this.tieneRaboLargo = tieneRaboLargo;
    }

    public boolean getTieneRaboLargo() {
        return tieneRaboLargo;
    }

    public void setTieneRaboLargo(boolean tieneRaboLargo) {
        this.tieneRaboLargo = tieneRaboLargo;
    }

    @Override
    protected void expresarse() {
        System.out.println("MIAU MIAU");
    }

    @Override
    protected void getTipoAnimal() {

    }


    @Override
    public String toString() {
        return super.toString()+
                "tieneRaboLargo=" + tieneRaboLargo +
                '}';
    }
}

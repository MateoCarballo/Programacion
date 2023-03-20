package Astros;

public class Planeta extends Astro{

    private float distanciaAlSol;
    private boolean orbitaElSol;
    private boolean tieneSatelites;

    public float getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public boolean getOrbitaElSol() {
        return orbitaElSol;
    }

    public boolean getTieneSatelites() {
        return tieneSatelites;
    }

    public Planeta(float radioEcuatorial, boolean rotacionSobreEje, float masa, float tempMedia, float gavedad, float distanciaAlSol, boolean orbitaElSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gavedad);
        this.distanciaAlSol = distanciaAlSol;
        this.orbitaElSol = orbitaElSol;
        this.tieneSatelites = tieneSatelites;
    }



    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Distancia al Sol            ->"+getDistanciaAlSol());
        System.out.println("Orbita el sol?              ->"+getOrbitaElSol());
        System.out.println("Tiene satelites?            ->"+getTieneSatelites());
    }
}

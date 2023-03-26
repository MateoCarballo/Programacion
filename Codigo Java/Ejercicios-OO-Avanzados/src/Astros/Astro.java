package Astros;

public abstract class Astro {

    private final float radioEcuatorial;
    private final boolean rotacionSobreEje;
    private final float masa;
    private final float tempMedia;
    private final float gavedad;

    public Astro(float radioEcuatorial, boolean rotacionSobreEje, float masa, float tempMedia, float gavedad) {
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionSobreEje = rotacionSobreEje;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.gavedad = gavedad;
    }

    public float getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public boolean getRotacionSobreEje() {
        return rotacionSobreEje;
    }

    public float getMasa() {
        return masa;
    }

    public float getTempMedia() {
        return tempMedia;
    }

    public float getGavedad() {
        return gavedad;
    }

    public  void muestra(){
        System.out.println("Radio ecuatorial            ->"+getRadioEcuatorial());
        System.out.println("Rotacion sobre el eje       ->"+getRotacionSobreEje());
        System.out.println("Masa                        ->"+getMasa());
        System.out.println("Temperatura media           ->"+getTempMedia());
        System.out.println("Gravedad                    ->"+getGavedad());
    }
}

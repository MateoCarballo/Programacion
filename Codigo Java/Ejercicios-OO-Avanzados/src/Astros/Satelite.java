package Astros;

public class Satelite extends Astro{
    private float distanciaPlaneta;
    private float orbitaPlanetaria;
    private String planetaContenedor;

    public float getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public float getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public String getPlanetaContenedor() {
        return planetaContenedor;
    }

    public Satelite(float radioEcuatorial, boolean rotacionSobreEje, float masa, float tempMedia, float gavedad, float distanciaPlaneta, float orbitaPlanetaria, String planetaContenedor) {
        super(radioEcuatorial, rotacionSobreEje, masa, tempMedia, gavedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaContenedor = planetaContenedor;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println("Distancia planeta->"+getDistanciaPlaneta());
        System.out.println("Orbita planeta ->"+getOrbitaPlanetaria());
        System.out.println("Planeta contenedor ->"+getPlanetaContenedor());

    }
}

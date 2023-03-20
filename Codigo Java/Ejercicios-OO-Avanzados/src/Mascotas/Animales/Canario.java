package Mascotas.Animales;

public class Canario extends Ave{

    private String color;
    private boolean puedeCantar;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPuedeCantar() {
        return puedeCantar;
    }

    public void setPuedeCantar(boolean puedeCantar) {
        this.puedeCantar = puedeCantar;
    }

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean puedeCantar) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.puedeCantar = puedeCantar;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre                          ->"+this.getNombre());
        System.out.println("Edad                            ->"+this.getEdad());
        System.out.println("Estado                          ->"+this.getEstado());
        System.out.println("Fecha de nacimiento             ->"+this.getFechaNacimiento());
        System.out.println("Color del canario               ->"+this.getColor());
        System.out.println("Puede cantar?                   ->"+this.getPuedeCantar());
        System.out.println("\n");
    }

    @Override
    public void hablar() {
        System.out.println("El canario habla");
    }

    @Override
    public void volar() {
        System.out.println("El canario vuela");
    }
}

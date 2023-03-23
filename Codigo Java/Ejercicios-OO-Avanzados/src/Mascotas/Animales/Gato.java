package Mascotas.Animales;

public class Gato extends Mascota {

    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado,
                String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }

    public Gato(String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
    }

    public void muestra() {
        System.out.println("Nombre              ->"+this.getNombre());
        System.out.println("Edad                ->"+this.getEdad());
        System.out.println("Estado              ->"+this.getEstado());
        System.out.println("Fecha de nacimiento ->"+this.getFechaNacimiento());
        System.out.println("Color               ->"+this.getColor());
        System.out.println("Pelo largo          ->"+this.getPeloLargo());
        System.out.println("\n");

    }

    @Override
    public void hablar() {
        System.out.println("MIAU MIAU");

    }
}

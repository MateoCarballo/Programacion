package Mascotas.Animales;

public class Loro extends Ave{
    private String origen;
    private boolean habla;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public Loro(String nombre, int edad, String estado, String fechaNacimiento,
                String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela!");
    }

    @Override
    public void muestra() {
        System.out.println("Nombre                          ->"+this.getNombre());
        System.out.println("Edad                            ->"+this.getEdad());
        System.out.println("Estado                          ->"+this.getEstado());
        System.out.println("Fecha de nacimiento             ->"+this.getFechaNacimiento());
        System.out.println("Origen del bicho                ->"+this.getOrigen());
        System.out.println("El bicho habla?                 ->"+this.getHabla());
        System.out.println("\n");
    }

    public void saluda(){
        System.out.println("El loro te saluda!");

    }
}

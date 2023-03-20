package Mascotas.Animales;

public abstract class Ave extends Mascota{
    public Ave(String nombre, int edad, String estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
    }

    public abstract void volar();
}

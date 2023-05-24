package Pilas_Colas;

public class Persona {
    String Nombre;
    int dni;

    public Persona(String nombre, int dni) {
        Nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + Nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}

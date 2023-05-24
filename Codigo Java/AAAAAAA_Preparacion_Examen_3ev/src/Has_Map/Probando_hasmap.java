package Has_Map;

public class Probando_hasmap {

    String Nombre;
    int edad;

    public Probando_hasmap(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Probando_hasmap{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

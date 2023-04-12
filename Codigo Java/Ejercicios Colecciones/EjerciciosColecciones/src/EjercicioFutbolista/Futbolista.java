package EjercicioFutbolista;

public class Futbolista {
    private String nombre;
    private int dorsal;
    private Demarcacion demarcacion;
    private Equipo equipo;

    public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }

    private void viajar(){

    }
    private void concentrarse(){

    }

    private void jugarPartido(){

    }
    @Override
    public String toString() {
        return "Futbolista{" +
                "nombre='" + nombre + '\'' +
                ", dorsal=" + dorsal +
                ", demarcacion=" + demarcacion +
                ", equipo=" + equipo +
                '}';
    }
}

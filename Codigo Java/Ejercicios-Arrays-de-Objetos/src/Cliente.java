public class Cliente {
    String nombre;
    int idCliente;

    public Cliente(String nombre, int idCliente) {
        this.nombre = nombre;
        this.idCliente = idCliente;
    }
    public Cliente(){

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}

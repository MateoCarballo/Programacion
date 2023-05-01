package EjerciciosPropuestos.Ejercicio_04;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int volumenDesposito;

    public Vehiculo(String matricula, String marca, String modelo, int volumenDesposito) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.volumenDesposito = volumenDesposito;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVolumenDesposito() {
        return volumenDesposito;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVolumenDesposito(int volumenDesposito) {
        this.volumenDesposito = volumenDesposito;
    }

    @Override
    public String toString() {
            return String.format("| %-10s | %-10s | %-15s | %,10d L |", matricula, marca, modelo, volumenDesposito);
    }
}

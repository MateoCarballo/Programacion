package EmpleadoFijoTemporal;

import java.text.ParseException;

public abstract class Empleado {

    private String nss;
    private String nombre;
    private String fechaDeNacimiento;
    private char sexo;


    public Empleado(String nss, String nombre, String fechaDeNacimiento, char sexo) {
        this.nss = nss;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

   public abstract float sueldo() throws ParseException;

    @Override
    public String toString() {
        return "Empleado{" +
                "nss='" + nss + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}

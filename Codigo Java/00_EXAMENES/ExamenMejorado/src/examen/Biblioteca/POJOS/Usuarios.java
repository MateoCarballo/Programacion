package examen.Biblioteca.POJOS;

import java.time.LocalDate;

public class Usuarios {
    public Usuarios() {
    }

    public Usuarios(int id, String dniLector, String nombre, String apellido1, String apellido2, String domicilio, String tel) {
        this.id = id;
        this.dniLector = dniLector;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.domicilio = domicilio;
        this.tel = tel;
    }

    private int id;
    private String dniLector, nombre, apellido1, apellido2, domicilio, tel;
    private boolean sancion;
    private LocalDate sancion_hasta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDniLector() {
        return dniLector;
    }

    public void setDniLector(String dniLector) {
        this.dniLector = dniLector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isSancion() {
        return sancion;
    }

    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }

    public LocalDate getSancion_hasta() {
        return sancion_hasta;
    }

    public void setSancion_hasta(LocalDate sancion_hasta) {
        this.sancion_hasta = sancion_hasta;
    }
}

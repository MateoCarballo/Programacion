package Mascotas.Animales;

import java.time.LocalDate;

public class Consulta {

    private String lugarConsulta;
    private String tipoConsulta;

    private LocalDate fechadeIngreso;

    private LocalDate fechadeAlta;

    public Consulta(){}

    public Consulta(String lugarConsulta, String tipoConsulta, LocalDate fechadeIngreso, LocalDate fechadeAlta) {
        this.lugarConsulta = lugarConsulta;
        this.tipoConsulta = tipoConsulta;
        this.fechadeIngreso = fechadeIngreso;
        this.fechadeAlta = fechadeAlta;
    }

    public String getLugarConsulta() {
        return lugarConsulta;
    }

    public void setLugarConsulta(String lugarConsulta) {
        this.lugarConsulta = lugarConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public LocalDate getFechadeIngreso() {
        return fechadeIngreso;
    }

    public void setFechadeIngreso(LocalDate fechadeIngreso) {
        this.fechadeIngreso = fechadeIngreso;
    }

    public LocalDate getFechadeAlta() {
        return fechadeAlta;
    }

    public void setFechadeAlta(LocalDate fechadeAlta) {
        this.fechadeAlta = fechadeAlta;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "lugarConsulta='" + lugarConsulta + '\'' +
                ", tipoConsulta='" + tipoConsulta + '\'' +
                ", fechadeIngreso=" + fechadeIngreso +
                ", fechadeAlta=" + fechadeAlta +
                '}';
    }
}

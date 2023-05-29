package Mascotas.Animales;

import java.time.LocalDate;

public class Consulta {


    private  int idConsulta;
    private String lugarConsulta;
    private String tipoConsulta;

    private LocalDate fechadeIngreso;

    private LocalDate fechadeAlta;

    private boolean tratamientoCompletado=false;

    public Consulta(){}

    public Consulta(int idConsulta, String lugarConsulta, String tipoConsulta, LocalDate fechadeIngreso) {
        this.idConsulta = idConsulta;
        this.lugarConsulta = lugarConsulta;
        this.tipoConsulta = tipoConsulta;
        this.fechadeIngreso = fechadeIngreso;
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

    public boolean isTratamientoCompletado() {
        return tratamientoCompletado;
    }

    public void setTratamientoCompletado(boolean tratamientoCompletado) {
        this.tratamientoCompletado = tratamientoCompletado;
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

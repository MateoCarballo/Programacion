public class Consulta {
    private String fechaConsulta;
    private String tipodeTrabajo;
    private int importe;
    private boolean consultaRealizada;

    public Consulta(String fechaConsulta, String tipodeTrabajo, int importe, boolean consultaRealizada) {
        this.fechaConsulta = fechaConsulta;
        this.tipodeTrabajo = tipodeTrabajo;
        this.importe = importe;
        this.consultaRealizada = consultaRealizada;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getTipodeTrabajo() {
        return tipodeTrabajo;
    }

    public void setTipodeTrabajo(String tipodeTrabajo) {
        this.tipodeTrabajo = tipodeTrabajo;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public boolean isConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public void visualizarNombreyPrecioConsulta(){


    }
}

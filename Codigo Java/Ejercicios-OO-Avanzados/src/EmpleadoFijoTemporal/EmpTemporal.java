package EmpleadoFijoTemporal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EmpTemporal extends Empleado{

    private String fechaInicio;
    private String fechaFin;
    private double precioDia;

    private ArrayList<Ventas> listadoVentas = new ArrayList<>();

    public EmpTemporal(String nss, String nombre, String fechaDeNacimiento,
                   char sexo, String fechaInicio, String fechaFin, double precioDia,
                   ArrayList<Ventas> listadoVentas) {
        super(nss, nombre, fechaDeNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;
        this.listadoVentas = listadoVentas;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public ArrayList<Ventas> getListadoVentas() {
        return listadoVentas;
    }

    public void setListadoVentas(ArrayList<Ventas> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }

    @Override
    public float sueldo() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
        Date f1 =sdf.parse(fechaInicio);
        Date f2 =sdf.parse(fechaFin);
        float dias = (f2.getTime()-f1.getTime()/(1000*60*60*24));
        float sueldo=0;
        return sueldo;
    }
}

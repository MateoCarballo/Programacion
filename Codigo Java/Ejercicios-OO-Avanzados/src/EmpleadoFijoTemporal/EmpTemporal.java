package EmpleadoFijoTemporal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EmpTemporal extends Empleado{

    private String fechaInicio;
    private String fechaFin;
    private double precioDia;

    private ArrayList<Venta> listadoVentas = new ArrayList<>();

    public EmpTemporal(String nss, String nombre, String fechaDeNacimiento,
                   char sexo, String fechaInicio, String fechaFin, double precioDia) {
        super(nss, nombre, fechaDeNacimiento, sexo);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioDia = precioDia;

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

    public ArrayList<Venta> getListadoVentas() {
        return listadoVentas;
    }

    public void setListadoVentas(ArrayList<Venta> listadoVentas) {
        this.listadoVentas = listadoVentas;
    }


    public void añadirVenta(Venta ventaEntrada){
        listadoVentas.add(ventaEntrada);
    }

    public void borrarVenta(int indice){
        listadoVentas.remove(indice);
    }
    @Override
    public float sueldo() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date f1 =sdf.parse(fechaInicio);
        Date f2 =sdf.parse(fechaFin);
        long diffInMillis = f2.getTime() - f1.getTime();
        long diffInDays = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);

        float sueldo= ((float) (diffInDays*precioDia));
        return sueldo;
    }

    public int totalVentas(){
        int totalVentas=0;
        for (int i = 0; i < listadoVentas.size(); i++){
            totalVentas += listadoVentas.get(i).getValorVenta();
        }
        return totalVentas;
    }
    public boolean buscarVentas(){
        boolean ventaOK=false;
        for (int i = 0; i <listadoVentas.size() ; i++) {
            if(listadoVentas.get(i).getValorVenta()>10000){
                ventaOK=true;
            }
        }
        return ventaOK ;
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "EmpTemporal{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", precioDia=" + precioDia +
                ", listadoVentas=" + listadoVentas +
                '}';
    }
}

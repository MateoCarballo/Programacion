package EmpleadoFijoTemporal;

public class Venta {

    private int valorVenta;
    private String fechaVenta;

    public Venta(int valorVenta, String fechaVenta) {
        this.valorVenta = valorVenta;
        this.fechaVenta = fechaVenta;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}

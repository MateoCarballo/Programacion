package EmpleadoFijoTemporal;

import java.util.ArrayList;

public class EmpFijo extends Empleado{

    private int salario;
    private float irpf;
    private int trienios;

    public EmpFijo(String nss, String nombre,String fechaDeNacimiento, char sexo, int salario, float irpf, int trienios) {
        super(nss, nombre, fechaDeNacimiento, sexo);
        this.salario = salario;
        this.irpf = irpf;
        this.trienios = trienios;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getIrpf() {
        return irpf;
    }

    public void setIrpf(float irpf) {
        this.irpf = irpf;
    }

    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }

    @Override
    public float sueldo() {
        float sueldo = ((float) salario + ((300 * trienios) * (1 - irpf)));
        return sueldo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "EmpFijo{" +
                "salario=" + salario +
                ", irpf=" + irpf +
                ", trienios=" + trienios +
                '}';
    }
}

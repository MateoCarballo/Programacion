public class Auxiliar extends Persona{

    public Auxiliar(String dni, String nombre, String telefono, float sueldoBase, float retencion) {
        super(dni, nombre, telefono, sueldoBase, retencion);
    }

    @Override
    public float calculoSalario() {
        float salario=0;
        salario = this.getSueldoBase() -(this.getSueldoBase() * this.getRetencion());
        return salario;
    }
}

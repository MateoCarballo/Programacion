public abstract class Persona  {

    private String dni;
    private String nombre;
    private String telefono;
    private float sueldoBase;
    private float retencion;

    public Persona(String dni, String nombre, String telefono, float sueldoBase, float retencion) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldoBase = sueldoBase;
        this.retencion = retencion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public float getRetencion() {
        return retencion;
    }

    public void setRetencion(float retencion) {
        this.retencion = retencion;
    }

    public abstract float calculoSalario();
}

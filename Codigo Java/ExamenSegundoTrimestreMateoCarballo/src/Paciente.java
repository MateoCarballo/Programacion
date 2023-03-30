import java.util.ArrayList;

public class Paciente{

    private String dniDueño;
    private String nombreDueño;
    private String nombreAnimal;
    private String razaAnimal;
    private String telefonoPaciente;

    public ArrayList<Consulta> historial=new ArrayList<Consulta>();


    public Paciente(){}

    public Paciente(String dniDueño, String nombreDueño, String nombreAnimal, String razaAnimal, String telefonoPaciente) {
        this.dniDueño = dniDueño;
        this.nombreDueño = nombreDueño;
        this.nombreAnimal = nombreAnimal;
        this.razaAnimal = razaAnimal;
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getDniDueño() {
        return dniDueño;
    }

    public void setDniDueño(String dniDueño) {
        this.dniDueño = dniDueño;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public ArrayList<Consulta> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Consulta> historial) {
        this.historial = historial;
    }



    public void imprimirHistorial (ArrayList<Consulta> misConsultas,String nombreVete){
        System.out.println("El nombre del veterinario es "+nombreVete);
        for(Consulta elemento :misConsultas) {
            System.out.println( "Elprecio de la consulta es " +elemento.getImporte());

        }
    }
}

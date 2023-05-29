
import java.util.ArrayList;

public class Veterinario extends Persona{
    // en trienios guardamos lo que le aumenta al sueldo por los trienios que tenga
    // por ejemplo +500€ por sus trienios
    private int trienios;

    public ArrayList<Paciente> listadoP = new ArrayList();



    public Veterinario(String dni, String nombre, String telefono,
                       float sueldoBase, float retencion, int trienios) {
        super(dni, nombre, telefono, sueldoBase, retencion);
        this.trienios = trienios;

    }

    public ArrayList<Paciente> getListadoP() {
        return listadoP;
    }

    public int getTrienios() {
        return trienios;
    }

    public void setTrienios(int trienios) {
        this.trienios = trienios;
    }

    public void addPaciente(Paciente miPaciente){
        listadoP.add(miPaciente);
    }

    public void printearLsita(ArrayList<Paciente> lista){
        System.out.println("listadoP=");
            for(Paciente elemento :lista) {
                System.out.println(elemento);
            }

    }

    @Override
    public String toString() {
        return  "Veterinario "+getDni()+" "
                +"Nombre "+getNombre()
                +"Telefono "+getTelefono()+
                "listadoP=" +
                '}';
    }

    @Override
    public float calculoSalario() {
        float salario=0;
        salario =(this.getSueldoBase() +this.trienios)-((this.getSueldoBase() +this.trienios)* this.getRetencion());
        return salario;
    }
}

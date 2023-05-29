public class Empleado {
    String nombre="";
    String apellido="";
    int edad=0;
    int salario=0;


    Empleado(String nombre, String apellido, int edad, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public int getSalario() {
        salario=utilidadesMatematicas.numAleatorioEntero(15000,30000);
        this.salario = salario;
        return this.salario;
    }

    public Empleado(){
        this.edad=numAleatorioEntero(18,65);
        this.salario=numAleatorioEntero(16000,22000);
        String[] nombres = {"Mateo","Elias","Luis","Eva","Maria","Javier"};
        this.nombre=nombres[numAleatorioEntero(0,2)];
    }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno {
    int idAlumno= 0;

    String dni ="99999999X";
    int numerodeMaterias=0;
    String fechaNacimiento="DD/MM/AAAA";
    String nombre="****";
    int edad=0;
    String[] materias=new String[numerodeMaterias];
    int [] notas=new int[numerodeMaterias];


    public void setEdad(int edad) {
        if (edad>18) {
            this.edad = edad;
        }else{
            System.out.println("Escribe una valor valido (valor>18)");
        }
    }

    public Alumno(){

    }

    public Alumno(int numerodeMaterias, String fechaNacimiento, String nombre, int edad, String[] materias, int[] notas) {
        this.numerodeMaterias = numerodeMaterias;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
        this.notas = notas;
    }

}

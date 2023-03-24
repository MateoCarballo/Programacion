package Mascotas.Animales;

import java.time.LocalDate;
import java.util.ArrayList;

public class Perro extends Mascota{
    private String raza;
    private boolean tienePulgas;

    private ArrayList <Consulta> historial = new ArrayList<>();

    public Perro(String nombre, int edad, String estado, String fechaNacimiento,
                 String raza,boolean tienePulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.tienePulgas=tienePulgas;
        //La primea vez metemosun dato
        this.historial.add(new Consulta("Lugar de Consulta","Tipo de Consulta", LocalDate.now(),null));
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return tienePulgas;
    }

    public void setPulgas(boolean tienePulgas) {
        this.tienePulgas = tienePulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre ->                   "+this.getNombre());
        System.out.println("Edad ->                     "+this.getEdad());
        System.out.println("Estado ->                   "+this.getEstado());
        System.out.println("Fecha de nacimiento->       "+this.getFechaNacimiento());
        System.out.println("Raza ->                     "+this.getRaza());
        System.out.println("Pulgas->                    "+this.getPulgas());
        System.out.println("\n");
    }

    public void añadirConsultaHisorial(String lugarConsuta, String tipodeConsulta, LocalDate fIngreso, LocalDate fAlta){
        historial.add(new Consulta(lugarConsuta,tipodeConsulta,fIngreso,fAlta));
    }

    public void printearHistorial(){
        for (Consulta c: historial){
            System.out.println(c.toString());
        }
    }


    @Override
    public void hablar() {
        System.out.println("GUAU GUAU");

    }



    @Override
    public String toString() {
        super.toString();
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", tienePulgas=" + tienePulgas +
                '}';
    }
}

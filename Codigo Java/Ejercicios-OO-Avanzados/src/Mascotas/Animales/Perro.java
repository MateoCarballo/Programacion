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
        this.historial.add(new Consulta(0,"Lugar de Consulta","Tipo de Consulta", LocalDate.now()));
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


    public ArrayList<Consulta> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Consulta> historial) {
        this.historial = historial;
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

    public void añadirConsultaHisorial(int idConsulta,String lugarConsuta, String tipodeConsulta,boolean consultaAbierta){
        if (consultaAbierta){
            historial.add(new Consulta(idConsulta,lugarConsuta,tipodeConsulta,LocalDate.now()));
        }else{
            historial.add(new Consulta(idConsulta,lugarConsuta,tipodeConsulta,LocalDate.now()));
            //Si la consulta no requiere ingreso se setea la fechadeAlta con la misma fecha que el ingreso.
            historial.get(historial.size()-1).setFechadeAlta(LocalDate.now());
        }

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

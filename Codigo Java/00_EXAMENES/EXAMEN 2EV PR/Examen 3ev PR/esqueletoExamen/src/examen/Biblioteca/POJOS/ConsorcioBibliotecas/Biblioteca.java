/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.Biblioteca.POJOS.ConsorcioBibliotecas;

import examen.Biblioteca.POJOS.Libros.Libros;
import examen.Biblioteca.POJOS.Libros.LibrosOcio;
import examen.Biblioteca.POJOS.Prestamos;
import examen.Biblioteca.POJOS.Usuarios;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author mrnov
 */
public class Biblioteca implements Serializable {
    String cif;
    String nombre;
    String tf;
    ArrayList <Libros> L;
    public Biblioteca() {
    }

    public Biblioteca(String cif, String nombre, String tf, ArrayList<Libros> L) {
        this.cif = cif;
        this.nombre = nombre;
        this.tf = tf;
        this.L = L;
    }

    
    
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTf() {
        return tf;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    public ArrayList<Libros> getL() {
        return L;
    }

    public void setL(ArrayList<Libros> L) {
        this.L = L;
    }

    public boolean comprobarLibro(String tituloAComprobar){
        boolean existe =false;
        for(Libros libro: L){
            if ((libro.getTitulo()==tituloAComprobar)&&(libro.isEstado())){
                //existe y no está prestado
               existe=true;
            }
        }
        return existe;
    }
    public Prestamos alquilarLibro( LocalDate fechaInicioPrestamo, String dniUsuario, String tituloLibro){
        LocalDate fechaDevolucion = fechaInicioPrestamo.plusDays(15);
        return new Prestamos(fechaInicioPrestamo,fechaDevolucion,dniUsuario);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "cif='" + cif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tf='" + tf + '\'' +
                ", L=" + L +
                '}';
    }
}

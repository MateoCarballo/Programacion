package Mascotas;

import Mascotas.Animales.*;
import java.util.*;

public class Inventario implements MetodosInventario {
    private String nombreTienda;
    private ArrayList<Mascota> inventarioAnimales ;

    public Inventario(String nombreTienda, ArrayList<Mascota> inventarioAnimales) {
        this.nombreTienda = nombreTienda;
        this.inventarioAnimales = inventarioAnimales;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public ArrayList<Mascota> getInventarioAnimales() {
        return inventarioAnimales;
    }

    public void setInventarioAnimales(ArrayList<Mascota> inventarioAnimales) {
        this.inventarioAnimales = inventarioAnimales;
    }


/*
     Metodo para mostrar el tipo de animal (nombre de la clase) y l nombre. Para qeu cada clase solo
     conozca lo que hay dentro de ella utilizo un ArrayList auxiliar que dentro solo tiene los datos
     que necesiamos en cada uno de los elementos
     */

    public void buscarMascota(String nombreMascota){
        for (Mascota datos:inventarioAnimales) {
            if(datos.getNombre().equalsIgnoreCase(nombreMascota)){
                datos.muestra();
                break;
            }
        }
    }

    public Mascota buscarMascota(String nombreMascota,Mascota mascotaEncontrada){

        for (int i = 0; i < inventarioAnimales.size(); i++) {
            if(inventarioAnimales.get(i).getNombre().equalsIgnoreCase(nombreMascota)){
                return inventarioAnimales.get(i);
                break;
            }
        }
    }

    public boolean mostrarDatosTodosLosAnimales() {
        boolean itsEmpty=inventarioAnimales.isEmpty();
        if(!itsEmpty){
            for (Mascota datos:inventarioAnimales) {
                datos.muestra();
            }
        }
      return  itsEmpty;
    }
/*
Metodos para añadir o eliminar elementos al ArrayList y vaciarla
 */
    public void addMascota(Mascota mascotaParaAñadir) {
        this.inventarioAnimales.add(mascotaParaAñadir);
    }

    public void removeMascota(String nombreMascota){
        for (int i = 0; i < inventarioAnimales.size(); i++) {
            if(inventarioAnimales.get(i).getNombre().equalsIgnoreCase(nombreMascota)){
                removeMascota(i);
            }
        }
    }

    public void vaciarInventario(){
        this.inventarioAnimales.clear();
    }

    public void dimeSiVuela(){
        for (Mascota dato:inventarioAnimales) {
            if((dato instanceof Loro)|(dato instanceof Canario)){
                ((Ave) dato).volar();
            }
        }
    }


    public void removeMascota(int indice){
        inventarioAnimales.remove(indice);
    }

    public void ordenarElementos(){
       inventarioAnimales.sort(Comparator.comparing(Mascota::getNombre));


       /*
       Ordenado en inverso

      inventarioAnimales.sort(Comparator.comparing(Mascota::getNombre).reversed());

        */
    }
}
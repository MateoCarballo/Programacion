package Mascotas;

import Mascotas.Animales.*;

import java.lang.reflect.Array;
import java.util.*;

public class Inventario implements MetodosInventario {
    private String nombreTienda;
    private List<Mascota> inventarioAnimales ;

    public Inventario(String nombreTienda, List<Mascota> inventarioAnimales) {
        this.nombreTienda = nombreTienda;
        this.inventarioAnimales = inventarioAnimales;
    }

    public ArrayList<String> mostrarListaAnimales() {
        ArrayList <String> salida= new ArrayList<>();
        for (Mascota datos:inventarioAnimales) {
           salida.add(datos.getClass().getSimpleName()+" "+ datos.getNombre());
        }

    return salida;
    }

    public void buscarMascota(String nombreMascota){
        for (Mascota datos:inventarioAnimales) {
            if(datos.getNombre().equalsIgnoreCase(nombreMascota)){
                datos.muestra();
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

    public void addMascota(Mascota mascotaParaAñadir) {
        this.inventarioAnimales.add(mascotaParaAñadir);
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

    public void removeMascota(String nombreMascota){
        for (int i = 0; i < inventarioAnimales.size(); i++) {
            if(inventarioAnimales.get(i).getNombre().equalsIgnoreCase(nombreMascota)){
             removeMascota(i);
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
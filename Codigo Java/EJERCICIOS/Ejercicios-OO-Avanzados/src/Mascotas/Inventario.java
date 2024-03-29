package Mascotas;

import Mascotas.Animales.*;

import java.time.LocalDate;
import java.util.*;

public class Inventario implements MetodosInventario {
    private String nombreTienda;
    private ArrayList<Animal> inventarioAnimales ;

    public Inventario(String nombreTienda, ArrayList<Animal> inventarioAnimales) {
        this.nombreTienda = nombreTienda;
        this.inventarioAnimales = inventarioAnimales;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public ArrayList<Animal> getInventarioAnimales() {
        return inventarioAnimales;
    }

    public void setInventarioAnimales(ArrayList<Animal> inventarioAnimales) {
        this.inventarioAnimales = inventarioAnimales;
    }


/*
     Metodo para mostrar el tipo de animal (nombre de la clase) y l nombre. Para qeu cada clase solo
     conozca lo que hay dentro de ella utilizo un ArrayList auxiliar que dentro solo tiene los datos
     que necesiamos en cada uno de los elementos
     */

    public void buscarMascota(String nombreMascota){
        for (Animal datos:inventarioAnimales) {
            if (datos.getNombre().equalsIgnoreCase(nombreMascota)) {
                datos.muestra();
                break;
            }
        }
    }

    public int buscarMascotaPerro(String nombreMascota){
    int indiceMascotaEncontrada=-1;
        for (int i = 0; i < inventarioAnimales.size(); i++) {
            if(inventarioAnimales.get(i).getNombre().equalsIgnoreCase(nombreMascota)) {
             indiceMascotaEncontrada=i;
            }
        }
       return indiceMascotaEncontrada;
    }

    public boolean mostrarDatosTodosLosAnimales() {
        boolean itsEmpty=inventarioAnimales.isEmpty();
        if(!itsEmpty){
            for (Animal datos:inventarioAnimales) {
                datos.muestra();
            }
        }
      return  itsEmpty;
    }
/*
Metodos para añadir o eliminar elementos al ArrayList y vaciarla
 */
    public void addMascota(Animal mascotaParaAñadir) {
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
        for (Animal dato:inventarioAnimales) {
            if((dato instanceof Loro)|(dato instanceof Canario)){
                ((Ave) dato).volar();
            }
        }
    }


    public void removeMascota(int indice){
        inventarioAnimales.remove(indice);
    }

    public void ordenarElementos(){
       inventarioAnimales.sort(Comparator.comparing(Animal::getNombre));


       /*
       Ordenado en inverso

      inventarioAnimales.sort(Comparator.comparing(Mascota::getNombre).reversed());

        */
    }
//TODO pendiente dar de alta a perros ingresados
    public void añadirConsultaPerro(int idConsulta,int indicePerro, String lugarConsulta, String motivoConsulta,boolean consultaAbierta){
        if (inventarioAnimales.get(indicePerro) instanceof Perro){
            ((Perro) inventarioAnimales.get(indicePerro)).añadirConsultaHisorial(idConsulta,lugarConsulta,motivoConsulta,consultaAbierta);
        }
    }

    public boolean comprobarFechaAltaVacia(int indicePerro){
        boolean fechaAltaOK=false;
        ArrayList<Consulta> historialAux = ((Perro) inventarioAnimales.get(indicePerro)).getHistorial();

        for (int i = 0; i <historialAux.size() ; i++) {
            if(historialAux.get(i).getFechadeAlta()==null){
                fechaAltaOK=altaPerro(i,((Perro) inventarioAnimales.get(indicePerro)).getHistorial());
            }
        }
return fechaAltaOK;
    }

    public boolean altaPerro(int indiceConsulta,ArrayList<Consulta> historialPerro){
        historialPerro.get(indiceConsulta).setFechadeAlta(LocalDate.now());
        return true;

    }
}


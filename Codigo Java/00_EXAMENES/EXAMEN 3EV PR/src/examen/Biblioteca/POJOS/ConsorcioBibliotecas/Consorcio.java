package examen.Biblioteca.POJOS.ConsorcioBibliotecas;

import java.io.Serializable;
import java.util.ArrayList;

public class Consorcio implements Serializable {

    private String nombreConsorcio;

    ArrayList <Biblioteca> bibliotecasDelConsorcio ;

    public Consorcio(String nombreConsorcio) {

        this.nombreConsorcio = nombreConsorcio;
        this.bibliotecasDelConsorcio=new ArrayList<>();
    }

    public ArrayList<Biblioteca> getBibliotecasDelConsorcio() {
        return bibliotecasDelConsorcio;
    }

    public void setBibliotecasDelConsorcio(ArrayList<Biblioteca> bibliotecasDelConsorcio) {
        this.bibliotecasDelConsorcio = bibliotecasDelConsorcio;
    }
    public void addBiblioteca(Biblioteca biblioteca){
        bibliotecasDelConsorcio.add(biblioteca);
    }
    public Biblioteca getBiblioteca(String cifBibliotecaABuscar){
        for(Biblioteca b:bibliotecasDelConsorcio){
            if (b.getCif()==cifBibliotecaABuscar){
                return b;
            }
        }
        return null;
    }
    public Biblioteca comprobarBiblioteca(String cif){
        boolean existe=false;
        for(Biblioteca b:bibliotecasDelConsorcio){
            if (b.getCif()==cif){
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Consorcio{" +
                "nombreConsorcio='" + nombreConsorcio + '\'' +
                ", bibliotecasDelConsorcio=" + bibliotecasDelConsorcio +
                '}';
    }
}

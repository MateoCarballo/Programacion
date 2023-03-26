package Autores_Libros;

import java.util.ArrayList;
import java.util.List;

public class Autor {

    private final String nif;
    private final String nombreAutor;
    private final String ciudadAutor;
    private final List<Libro> libros;

    public Autor(String nif, String nombreAutor, String ciudadAutor, ArrayList<Libro> libros) {
        this.nif = nif;
        this.nombreAutor = nombreAutor;
        this.ciudadAutor = ciudadAutor;
        this.libros = libros;
    }
}

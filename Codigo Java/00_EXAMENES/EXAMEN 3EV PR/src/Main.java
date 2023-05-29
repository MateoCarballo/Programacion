import examen.Biblioteca.POJOS.ConexionesFicheros;
import examen.Biblioteca.POJOS.ConsorcioBibliotecas.Biblioteca;
import examen.Biblioteca.POJOS.ConsorcioBibliotecas.Consorcio;
import examen.Biblioteca.POJOS.Libros.Libros;
import examen.Biblioteca.POJOS.Libros.LibrosOcio;
import examen.Biblioteca.POJOS.Prestamos;

import java.io.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
    static final String DIRECTORY_PATH ="C:\\Users\\a22mateoca\\Desktop\\Examen 3v PR\\esqueletoExamen\\Datos\\Fbibliotecas.dat";
    static Consorcio miConsorcio = new Consorcio("Mi consorcio");
    static ArrayList<Libros> libros = new ArrayList<>();
    static Biblioteca biblioteca1 = new Biblioteca("CIF","nombre","tfno",libros);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        escribrirFlog();
        miConsorcio.addBiblioteca(biblioteca1);
        ConexionesFicheros misConexiones = new ConexionesFicheros();
        File ficheroConsorcio =misConexiones.crearFicheroDat(DIRECTORY_PATH);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean esUnNumero=false;
        boolean continuarMenuPpal = true;
        String seleccionMenu="";

        do {
            while (!esUnNumero) {
                System.out.println("""
                    ####  PROGRAMA DE GESTION BIBLIOTECAS  #####
                    ############################################
                    SELECCIONA UNA DE LAS OPCIONES.
                    ############################################
                    1.Crear préstamo.
                    2.Guardar datos generados.
                    3.Restaurar datos guardados.
                    4.
                    5.
                    6.
                    7.
                    8.
                    9.
                    0.Salir               
                    """);

                seleccionMenu= br.readLine();

                if (seleccionMenu.matches("^[0-9]$")) {
                    System.out.println("El numero introducido es valido."+"\n");
                    esUnNumero = true;
                } else {
                    System.out.println("""
                        Has introducido un valor que no cumple las especificaciones
                        Introduce un digito entre 0-9""");
                    esUnNumero = false;
                }

            }
//
            switch (Integer.parseInt(seleccionMenu)) {
                case 1 -> {
                    Biblioteca bibliotecaPrestataria;
                    String fechaInicioPrestamo;
                    LocalDate fechaIPrestamo = null;
                    String dniUsuario;
                    String cifBiblioteca;
                    //*Comprobaciones de que todos los datos introducidos existen y cumplen los formatos.


                        System.out.println("Indique el cif de la biblioteca");
                        cifBiblioteca=br.readLine();
                        bibliotecaPrestataria=miConsorcio.comprobarBiblioteca(cifBiblioteca);
                    do {
                        System.out.println("Introduce la fecha del prestamo.");
                        System.out.println("Formato admitido dd/MM/aaaa");
                        fechaInicioPrestamo= br.readLine();
                        if(validaNumeroFecha_Exp(fechaInicioPrestamo)){
                            fechaIPrestamo = LocalDate.of(  Integer.parseInt(fechaInicioPrestamo.substring(6)),
                                                            Integer.parseInt(fechaInicioPrestamo.substring(3,5)),
                                                            Integer.parseInt(fechaInicioPrestamo.substring(0,2)));

                        }
                    }while(!validaNumeroFecha_Exp(fechaInicioPrestamo));
                    do {
                        System.out.println("Dni del usuario que alquila el libro.");
                        dniUsuario= br.readLine();
                    }while(!validaDNI_Exp(dniUsuario));

                    String tituloLibroAlquilado;
                    do {
                        System.out.println("Titulo del libro");
                        tituloLibroAlquilado=br.readLine();
                    }while(!bibliotecaPrestataria.comprobarLibro(tituloLibroAlquilado));

                    Prestamos prestamo= bibliotecaPrestataria.alquilarLibro(fechaIPrestamo,dniUsuario,tituloLibroAlquilado);
                }
                case 2 -> {
                    System.out.println("Los datos del consorcio han sido guardados.");
                    misConexiones.writeConsorcio(miConsorcio,DIRECTORY_PATH);
                }
                case 3 -> {
                    System.out.println("Datos del fichero cargados en consorcio.");
                    miConsorcio=misConexiones.readConsorcio(DIRECTORY_PATH);
                    System.out.println(miConsorcio);
                }
                case 0 -> {
                    continuarMenuPpal = false;
                }
            }
            esUnNumero = false;

        } while (continuarMenuPpal);
    }

    private static void escribrirFlog() throws IOException {
        /* Si hubiese que guardar el listado de libros por orden reciente FIFO
         * Queue<LibrosOcio> listadoPrestamos = new LinkedList<>();
        LibrosOcio libroParaProbar = new LibrosOcio();
        listadoPrestamos.add(libroParaProbar);
        listadoPrestamos.add(libroParaProbar);
        listadoPrestamos.add(libroParaProbar);
        *
         */
        String [] codigoLista={"Queue<LibrosOcio> listadoPrestamos = new LinkedList<>();",
        "LibrosOcio libroParaProbar = new LibrosOcio();",
       "listadoPrestamos.add(libroParaProbar);",
                "listadoPrestamos.add(libroParaProbar);"};
        /* HashMap
         * HashMap<Integer, LibrosOcio> hashLibrosReferencia = new HashMap();
        hashLibrosReferencia.put(Integer.parseInt(libroParaProbar.getRef()), libroParaProbar);
         */
        String []codigoHashMap= {"HashMap<Integer, LibrosOcio> hashLibrosReferencia = new HashMap();",
                "hashLibrosReferencia.put(Integer.parseInt(libroParaProbar.getRef()), libroParaProbar);"};

        File txtFlog = new File("C:\\Users\\a22mateoca\\Desktop\\Examen " +
                "3v PR\\esqueletoExamen\\Datos\\Flog.txt");
        BufferedWriter out = null;

        if(!txtFlog.exists()){
            try {
                txtFlog.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
            out = new BufferedWriter(new FileWriter("C:\\Users\\a22mateoca\\Desktop\\Examen " +
                    "3v PR\\esqueletoExamen\\Datos\\Flog.txt"));
            try {
                String line;
                for (int i = 0; i < codigoLista.length; i++) {
                    out.write(codigoLista[i]);
                    out.newLine();
                }
                out.flush();
                for (int i = 0; i < codigoHashMap.length; i++) {
                    out.write(codigoHashMap[i]);
                    out.newLine();
                }
                out.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }finally{
                if(!(out ==null)){
                    out.close();
                }

            }
    }


    private static void leerFlog() throws IOException {

        File txtFlog = new File("C:\\Users\\a22mateoca\\Desktop\\Examen " +
                "3v PR\\esqueletoExamen\\Datos\\Flog.txt");
        BufferedReader in = null;

        in = new BufferedReader(new FileReader("C:\\Users\\a22mateoca\\Desktop\\Examen " +
                "3v PR\\esqueletoExamen\\Datos\\Flog.txt"));
        try {
            String line;
            do{
                line=in.readLine();
                System.out.println(line);
            }while(line!=null);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }finally{
            if(!(in ==null)){
                in.close();
            }

        }
    }
    public static boolean validaDNI_Exp(String DNI){

        return DNI.matches("^[1-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}$");

    }
    //VALIDAR UNA FECHA
    public static boolean validaNumeroFecha_Exp(String texto) {

        return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
    }
    /**
     *
     * public static void imprimirElementosArrayList (ArrayList<Persona> lista){
     *         for(Persona elemento :lista) {
     *             System.out.println(elemento);
     *         }
     *     }
     */

}

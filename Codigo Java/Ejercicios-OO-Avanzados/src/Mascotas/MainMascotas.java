package Mascotas;

import Mascotas.Animales.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainMascotas {
    static int idconsulta=0;

    public static void main(String[] args) throws IOException {
        boolean continuar = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Inventario miInventario = new Inventario("Nombre Tienda", new ArrayList<>());
        rellenarDatosParaProbar(miInventario);

        do {
            System.out.println("""
                    Inventario:
                    0.Dime si vuela.
                    1.Mostrar lista mascotas.
                    2.Mostrar datos de una mascota.
                    3.Mostrar los datos de todas las mascotas.
                    4.Añadir mascota.
                    5.Eliminar mascota(por nombre).
                    6.Vaciar inventario.
                    7.Añadir revision a perro.
                    8.Ver historiales de todos los perros.
                    11.Alta Perro(Añadir Fecha Salida)
                    9.Salir.""");

            switch (Integer.parseInt(br.readLine())) {
                case 0 -> miInventario.dimeSiVuela();
                case 1 -> printearClasesNombres(miInventario.getInventarioAnimales());
                case 2 -> {
                    System.out.println("Nombre de la mascota?");
                    String nombreMascota = br.readLine();
                    miInventario.buscarMascota(nombreMascota);
                }
                case 3 -> {
                    //Este metodo devuelve un booleano que si da true significa qe el arraylist esta vacio
                    if (miInventario.mostrarDatosTodosLosAnimales()) {
                        System.out.println("No hay ningun registro en el inventario");
                    }
                }
                case 4 -> {
                    System.out.println("""
                            Inventario:
                            1.Perro.
                            2.Gato.
                            3.Loro.
                            4.Canario.
                            """);
                    String entradaTeclado = br.readLine();
                    switch (Integer.parseInt(entradaTeclado)) {
                        case 1 -> preguntasComunesAnimales(1,miInventario);
                        case 2 -> preguntasComunesAnimales(2,miInventario);
                        case 3 -> preguntasComunesAnimales(3,miInventario);
                        case 4 -> preguntasComunesAnimales(4,miInventario);
                    }
                }
                case 5 -> {
                    System.out.println("Nombre de la mascota a eliminar?");
                    String nombreMascota = br.readLine();
                    miInventario.removeMascota(nombreMascota);
                }
                case 6 -> {
                    System.out.println("Seguro que deseas vaciar el inventario? (Y/N)");
                    if (br.readLine().equalsIgnoreCase("Y")) {
                        miInventario.vaciarInventario();
                        System.out.println("El inventario se ha vaciado con exito");
                    } else {System.out.println("Se ha cancelado el vaciado del inventario");
                    }
                }

                case 7-> {
                    añadirConsultaHistorial(miInventario);
                }

                case 8 -> {
                    //TODO pendente de introducir  validaciones
                    //Escribe el historial de consultas del todos los perros
                   for(Animal a:miInventario.getInventarioAnimales()){
                       if (a instanceof Perro){
                           ((Perro) a).printearHistorial();
                       }
                   }
                }
                case 11->{
                    System.out.println("Que perro va a dar de alta?");
                    int indiceMascota=miInventario.buscarMascotaPerro(br.readLine());
                    if(miInventario.comprobarFechaAltaVacia(indiceMascota)){
                        System.out.println("Perro dado de alta");
                    }else{
                        System.out.println("No se ha podido dar de alta revisa los datos introducidos");
                    }
                }

                case 9 -> continuar = false;
            }
            // A cada ciclo de programa ordeno los elementos por su nombre mediante este metodo
            miInventario.ordenarElementos();
        } while (continuar);


    }

    public static void rellenarDatosParaProbar(Inventario inventory) {

        Animal perro = new Perro("nombre Perro", 10, "estado", "fechaNacimiento",
                "raza", false);
        Animal gato = new Gato("nombre Gato", 11, "estado", "fechaNacimiento",
                "color", false);
        Animal loro0 = new Loro("nombre Loro0", 12, "estado", "fechaNacimiento",
                "origen", false);
        Animal loro1 = new Loro("nombre Loro1", 13, "estado", "fechaNacimiento",
                "origen", false);
        Animal loro2 = new Loro("nombre Loro2", 14, "estado", "fechaNacimiento",
                "origen", false);
        Animal loro3 = new Loro("nombre Loro3", 15, "estado", "fechaNacimiento",
                "origen", false);
        Animal loro4 = new Loro("nombre Loro4", 15, "estado", "fechaNacimiento",
                "origen", false);
        Animal canario = new Canario("nombre Canario", 13, "estado", "fechaNacimiento",
                "color canario", false);

        inventory.addMascota(perro);
        /*Casteamos a perro para que coincida el tipo de dato.
        rellenarHistorialPerro((Perro)perro);
         */
        inventory.addMascota(gato);
        inventory.addMascota(loro0);
        inventory.addMascota(loro1);
        inventory.addMascota(loro2);
        inventory.addMascota(loro3);
        inventory.addMascota(loro4);
        inventory.addMascota(canario);
    }

    public static void añadirConsultaHistorial(Inventario miInventario) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre del perro?");
        String nombrePerro= br.readLine();
        int indiceMascotaBuscada=miInventario.buscarMascotaPerro(nombrePerro);
        if (indiceMascotaBuscada>=0){
            System.out.println("Mascota encontrada");
            miInventario.buscarMascota(nombrePerro);
            System.out.println("Lugar de consulta?");
            String lugarConsulta=br.readLine();
            System.out.println("Motivo de la consulta");
            String motivoConsulta=br.readLine();
            System.out.println("Dejar consulta abierta?(La mascota requiere ingreso)(Y/N)");
            if (br.readLine().equalsIgnoreCase("Y")){
                miInventario.añadirConsultaPerro(idconsulta,indiceMascotaBuscada,lugarConsulta,
                        motivoConsulta,true);
            }else{
                miInventario.añadirConsultaPerro(idconsulta,indiceMascotaBuscada,lugarConsulta,
                        motivoConsulta,false);
            }
            idconsulta+=1;
        }else{
            System.out.println("Mascota no encontrada revise nombre introducido");
        }

    }
    public static void printearClasesNombres(ArrayList <Animal> misAnimales){
        int contador0 = 0;
        for (Animal datos : misAnimales) {
            contador0 += 1;
            System.out.println((contador0 + "->" + "Tipo de animal  " + datos.getClass().getSimpleName() + "||" +
                    " Nombre del animal-> " + datos.getNombre() + "\n"));
        }
    }
    // mi idea con este metdo es no repeir tantas veces lo mismo en cada uno de los case del menu principal


    public static void preguntasComunesAnimales(int tipodeInsercion,Inventario inventory) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre?");
        String nombre = br.readLine();
        System.out.println("Edad?");
        int edad = Integer.parseInt(br.readLine());
        System.out.println("Estado?");
        String estado = br.readLine();
        //TODO cambar String a formato DATE
        System.out.println("Fecha de nacimiento?");
        String fechaNacimiento = br.readLine();

        switch (tipodeInsercion){
            case 1-> {
                System.out.println("Raza?");
                String razaPerro = br.readLine();
                System.out.println("Tiene pulgas?(Y/N)");
                boolean pulgas = br.readLine().equalsIgnoreCase("Y");
                inventory.addMascota(new Perro(nombre, edad, estado,
                        fechaNacimiento, razaPerro, pulgas));

            }
            case 2-> {
                    System.out.println("Color");
                    String colorGato = br.readLine();
                    System.out.println("Pelo largo?(Y/N)");
                    boolean peloLargoGato = br.readLine().equalsIgnoreCase("Y");
                    inventory.addMascota(new Gato(nombre, edad, estado, fechaNacimiento, colorGato, peloLargoGato));
            }

            case 3-> {
                System.out.println("Origen?");
                String origenLoro = br.readLine();
                System.out.println("El loro habla ? (Y/N)");
                boolean habla = br.readLine().equalsIgnoreCase("Y");
                inventory.addMascota(new Loro(nombre, edad, estado, fechaNacimiento, origenLoro, habla));
            }
            case 4->{
                System.out.println("Color?");
                String colorCanario = br.readLine();
                System.out.println("El canario canta ? (Y/N)");
                boolean canta = br.readLine().equalsIgnoreCase("Y");
                inventory.addMascota(new Canario(nombre, edad, estado, fechaNacimiento, colorCanario, canta));
            }
            }
        }
    }



package Mascotas;

import Mascotas.Animales.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainMascotas {
    public static void main(String[] args) throws IOException {


        boolean continuar = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        ArrayList<Mascota> misMascotasAux = new ArrayList();
        Inventario miInventario = new Inventario("Nombre Tienda", new ArrayList<Mascota>());


        rellenarDatosParaProbar(Inventario miInventario);

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
                    9.Salir.                
                    """);
            a = Integer.parseInt(br.readLine());

            switch (a) {
                case 0 -> {
                    miInventario.dimeSiVuela();
                }
                case 1 -> {
                    misMascotasAux = miInventario.getInventarioAnimales();
                    int contador0 = 0;
                    for (Mascota datos : misMascotasAux) {
                        contador0 += 1;
                        System.out.println((contador0 + "->" + "Tipo de animal  " + datos.getClass().getSimpleName() + "||" +
                                " Nombre del animal-> " + datos.getNombre() + "\n"));
                    }
                }
                case 2 -> {
                    System.out.println("Nombre de la mascota?");
                    String nombreMascota = br.readLine();
                    miInventario.buscarMascota(nombreMascota);
                }
                case 3 -> {

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
                        case 1 -> {
                            System.out.println("Nombre?");
                            String nombrePerro = br.readLine();
                            System.out.println("Edad?");
                            int edadPerro = Integer.parseInt(br.readLine());
                            System.out.println("Estado del perro?");
                            String estadoPerro = br.readLine();
                            //TODO cambar String a formato DATE
                            System.out.println("Fecha de nacimiento?");
                            String fechaNacPerro = br.readLine();
                            System.out.println("Raza?");
                            String razaPerro = br.readLine();
                            System.out.println("Tiene pulgas?(Y/N)");
                            boolean pulgas = false;
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                pulgas = true;
                            }

                            //TODO no se como no usar el perroAux quiza pasarle todos los datos al metodo

                            /*
                            Mi idea aqui debajo es que se copie lo que ya existe dentro del ArrayList
                            en la auxiliar se añadan elementos a esa auxiliar y que esa auxiiar setee la
                            arralist del inventario.
                            La secuencia de pasos seía:
                            1.Copiar el arrayList
                            2.Vaciar el arraylist original
                            3.Añadir elemento en la arraylist auxiliar
                            4.Setear la original, que vaciamos antes, con el valor de la auxialiar.

                             */

                            misMascotasAux = miInventario.getInventarioAnimales();
                            //miInventario.vaciarInventario();
                            misMascotasAux.add(new Perro(nombrePerro, edadPerro, estadoPerro,
                                    fechaNacPerro, razaPerro, pulgas));
                            miInventario.setInventarioAnimales(misMascotasAux);
                            //Este de abajo es solo para probar que funcione sin introducir ningun valor por teclado
                            //miInventario.addMascota(perro);
                        }
                        case 2 -> {

                            System.out.println("Nombre?");
                            String nombreGato = br.readLine();
                            System.out.println("Edad?");
                            int edadGato = Integer.parseInt(br.readLine());
                            System.out.println("Estado del animal?");
                            String estadGato = br.readLine();
                            //TODO cambar String a formato DATE
                            System.out.println("Fecha de nacimiento?");
                            String fechaNacGato = br.readLine();
                            System.out.println("Color");
                            String colorGato = br.readLine();
                            System.out.println("Pelo largo?(Y/N)");
                            boolean peloLargoGato = false;
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                peloLargoGato = true;
                            }

                            misMascotasAux = miInventario.getInventarioAnimales();
                            //miInventario.vaciarInventario();
                            misMascotasAux.add(new Gato(nombreGato, edadGato, estadGato, fechaNacGato, colorGato, peloLargoGato));
                            miInventario.setInventarioAnimales(misMascotasAux);

                            //Este gato de abajo era solo para probar que funcionen las busquedas y ordenadciones
                            //miInventario.addMascota(gato);
                        }
                        case 3 -> {

                            System.out.println("Nombre?");
                            String nombreLoro = br.readLine();
                            System.out.println("Edad?");
                            int edadLoro = Integer.parseInt(br.readLine());
                            System.out.println("Estado del animal?");
                            String estadoLoro = br.readLine();
                            //TODO cambar String a formato DATE
                            System.out.println("Fecha de nacimiento?");
                            String fechaNacLoro = br.readLine();
                            System.out.println("Origen?");
                            String origenLoro = br.readLine();
                            System.out.println("El loro habla ? (Y/N)");
                            boolean habla = false;
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                habla = true;
                            }

                            misMascotasAux = miInventario.getInventarioAnimales();
                            misMascotasAux.add(new Loro(nombreLoro, edadLoro, estadoLoro, fechaNacLoro, origenLoro, habla));
                            miInventario.setInventarioAnimales(misMascotasAux);
                        }
                        case 4 -> {


                            System.out.println("Nombre?");
                            String nombreCanario = br.readLine();
                            System.out.println("Edad?");
                            int edadCanario = Integer.parseInt(br.readLine());
                            System.out.println("Estado del animal?");
                            String estadoCanario = br.readLine();
                            //TODO cambar String a formato DATE
                            System.out.println("Fecha de nacimiento?");
                            String fechaNacCanario = br.readLine();
                            System.out.println("Color?");
                            String colorCanario = br.readLine();
                            System.out.println("El canario canta ? (Y/N)");
                            boolean canta = false;
                            if (br.readLine().equalsIgnoreCase("Y")) {
                                canta = true;
                            }

                            misMascotasAux = miInventario.getInventarioAnimales();
                            miInventario.vaciarInventario();
                            misMascotasAux.add(new Canario(nombreCanario, edadCanario, estadoCanario, fechaNacCanario, colorCanario, canta));
                            miInventario.setInventarioAnimales(misMascotasAux);
                        }
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
                    } else {
                        System.out.println("Se ha cancelado el vaciado del inventario");
                        ;
                    }

                }
                case 9 -> {
                    continuar = false;
                }
            }
            // A cada ciclo de programa ordeno los elementos por su nombre mediante este metodo
            miInventario.ordenarElementos();
        } while (continuar);


    }

    public static void rellenarDatosParaProbar(Inventario inventory) {

        Mascota perro = new Perro("nombre Perro", 10, "estado", "fechaNacimiento",
                "raza", false);
        Mascota gato = new Gato("nombre Gato", 11, "estado", "fechaNacimiento",
                "color", false);
        Mascota loro0 = new Loro("nombre Loro0", 12, "estado", "fechaNacimiento",
                "origen", false);
        Mascota loro1 = new Loro("nombre Loro1", 13, "estado", "fechaNacimiento",
                "origen", false);
        Mascota loro2 = new Loro("nombre Loro2", 14, "estado", "fechaNacimiento",
                "origen", false);
        Mascota loro3 = new Loro("nombre Loro3", 15, "estado", "fechaNacimiento",
                "origen", false);
        Mascota loro4 = new Loro("nombre Loro4", 15, "estado", "fechaNacimiento",
                "origen", false);
        Mascota canario = new Canario("nombre Canario", 13, "estado", "fechaNacimiento",
                "color canario", false);

        inventory.addMascota(perro);
        inventory.addMascota(gato);
        inventory.addMascota(loro0);
        inventory.addMascota(loro1);
        inventory.addMascota(loro2);
        inventory.addMascota(loro3);
        inventory.addMascota(loro4);
        inventory.addMascota(canario);
    }

}

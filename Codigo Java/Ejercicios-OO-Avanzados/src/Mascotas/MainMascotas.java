package Mascotas;

import Mascotas.Animales.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainMascotas {
    public static void main(String[] args)throws IOException {

        boolean continuar=true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;


        Inventario miInventario = new Inventario("Nombre Tienda", new ArrayList<Mascota>());

        Mascota perro = new Perro("nombre perro", 10, "estado", "fechaNacimiento",
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

        miInventario.addMascota(perro);
        miInventario.addMascota(gato);
        miInventario.addMascota(loro0);
        miInventario.addMascota(loro1);
        miInventario.addMascota(loro2);
        miInventario.addMascota(loro3);
        miInventario.addMascota(loro4);
        miInventario.addMascota(canario);

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
                    System.out.println((miInventario.mostrarListaAnimales()));
                }
                case 2 -> {
                    System.out.println("Nombre de la mascota?");
                    String nombreMascota = br.readLine();
                    miInventario.buscarMascota(nombreMascota);
                }
                case 3 ->{

                    if(miInventario.mostrarDatosTodosLosAnimales()) {
                        System.out.println("La lista está vacia me devuelve false");
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
                            miInventario.addMascota(perro);
                        }
                        case 2 -> {
                            miInventario.addMascota(gato);
                        }
                        case 3 -> {
                            miInventario.addMascota(loro0);
                            miInventario.addMascota(loro1);
                            miInventario.addMascota(loro2);
                            miInventario.addMascota(loro3);
                            miInventario.addMascota(loro4);
                        }
                        case 4 -> {
                            miInventario.addMascota(canario);
                        }
                    }
                }
                case 5->{
                    System.out.println("Nombre de la mascota a eliminar?");
                    String nombreMascota=br.readLine();
                    miInventario.removeMascota(nombreMascota);
                }
                case 6->{
                    miInventario.vaciarInventario();
                }
                case 9 ->{
                    continuar=false;
                }
            }
            miInventario.ordenarElementos();
        }while(continuar);
    }
}

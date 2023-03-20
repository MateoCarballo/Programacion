import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean atributoEncontrado = false;
        boolean continuar=true;
        String modeloABuscar;
        int idCoche = 0;
        int entradaTeclado = 0;

        Coche[] miConcesionario = new Coche[10];

        for (int i = 0; i < miConcesionario.length; i++) {
            miConcesionario[i] = new Coche(
                    Coche.marcas[Coche.numAleatorioI(0, Coche.marcas.length - 1)],
                    Coche.motorizacion[Coche.numAleatorioI(0, Coche.motorizacion.length - 1)],
                    Coche.numAleatorioI(15000, 35000),
                    Coche.booleanoAleatorio(),
                    Coche.booleanoAleatorio(),
                    Coche.booleanoAleatorio());
            miConcesionario[i].setIdCoche(idCoche);
            if(miConcesionario[i].marca.compareToIgnoreCase("Audi")==0){
                miConcesionario[i].setModelo(Coche.tiposDeModeloAudi[Coche.numAleatorioI(0,4)]);
            }
            if(miConcesionario[i].marca.compareToIgnoreCase("BMW")==0){
                miConcesionario[i].setModelo(Coche.tiposDeModeloBMW[Coche.numAleatorioI(0,4)]);
            }
            if(miConcesionario[i].marca.compareToIgnoreCase("Peugeot")==0){
                miConcesionario[i].setModelo(Coche.tiposDeModeloAudi[Coche.numAleatorioI(0,4)]);
            }
            if(miConcesionario[i].marca.compareToIgnoreCase("Renault")==0){
                miConcesionario[i].setModelo(Coche.tiposDeModeloAudi[Coche.numAleatorioI(0,4)]);
            }
            idCoche++;
        }
        do {
            System.out.println("""
                    Concesionario
                    1 (rellenar campos manual)
                    2 Ordenar por el nombre de la marca
                    3 Ordenar por precio base
                    4 Buscar por modelo
                    9 Salir""");

            entradaTeclado = Integer.parseInt(br.readLine());

            switch (entradaTeclado) {
                case 1:
                    /**
                     * Carga.carga(coche);
                     */
                case 2:
                    /**Ordenador por marcas
                     * Ordenar.MayorMenorBurbuja(coche);//uso método burbuja para ordenar por Marca
                     * Ver.verArray(coche);
                     */
                    Operaciones.ordenarMarcasBurbuja(miConcesionario);
                    for (int i = 0; i < miConcesionario.length; i++) {
                        System.out.println(miConcesionario[i]);
                    }

                    break;
                case 3:
                    /**Ordenado por precio de menor a mayor
                     * Ordenar.MayorPrecio(coche);//ordenación secuencial por precio_base
                     */
                    Operaciones.ordenarPrecioBurbuja(miConcesionario);
                    for (int i = 0; i < miConcesionario.length; i++) {
                        System.out.println(miConcesionario[i]);
                    }
                    break;
                case 4:
                    /**
                     * Buscar.buscaDicotomica(coche);
                     *
                     *
                     * /2
                     */
                    Operaciones.ordenarModeloBurbuja(miConcesionario);
                    for (int i = 0; i < miConcesionario.length; i++) {
                        System.out.println(miConcesionario[i]);
                    }
                    System.out.println(miConcesionario);
                    System.out.println("Dime el modelo a buscar");
                    modeloABuscar = br.readLine();
                    do {
                        /**
                         * Llamo a la busqueda si me da true es que lo encuentra y me printea la posicion
                         * si no lo encuentra me da false entonces vuelvo a preguntar
                         */

                        if (modeloABuscar.compareToIgnoreCase(Coche.tiposDeModelo[0]) == 0) {
                            atributoEncontrado = Operaciones.busquedaBinariaModelo(miConcesionario, modeloABuscar);
                        }
                        if (modeloABuscar.compareToIgnoreCase(Coche.tiposDeModelo[1]) == 0) {
                            atributoEncontrado = Operaciones.busquedaBinariaModelo(miConcesionario, modeloABuscar);
                        }
                        if (modeloABuscar.compareToIgnoreCase(Coche.tiposDeModelo[2]) == 0) {
                            atributoEncontrado = Operaciones.busquedaBinariaModelo(miConcesionario, modeloABuscar);
                        }
                        if (modeloABuscar.compareToIgnoreCase(Coche.tiposDeModelo[3]) == 0) {
                            atributoEncontrado = Operaciones.busquedaBinariaModelo(miConcesionario, modeloABuscar);
                        }
                        if (!atributoEncontrado) {
                            System.out.println("No se ha encontrado ningun modelo como el que busca");
                        }
                    } while (!atributoEncontrado);
                    atributoEncontrado = false;
                    break;
                case 5:
                    /**
                     * Ver.verArray(coche);
                     */
                    //Salir
                    break;
                case 9:
                    continuar = false;
                    break;
                case 0:
                    //Error
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }while (continuar) ;
    }
}



/**
 * if (miConcesionario[0].marca.compareToIgnoreCase(atributoABuscar) == 0) {
 *                         System.out.println("Quieres buscar por marca? (Y/N)");
 *                         confirmacionBusqueda = br.readLine();
 *
 *                         if (confirmacionBusqueda.compareToIgnoreCase("Y") == 0) {
 *                             atributoEncontrado = true;
 *                         }
 *                     }
 *                     if (miConcesionario[0].modelo.compareToIgnoreCase(atributoABuscar) == 0) {
 *                         System.out.println("Quieres buscar por modelo?(Y/N)");
 *                         confirmacionBusqueda = br.readLine();
 *                         if (confirmacionBusqueda.compareToIgnoreCase("Y") == 0) {
 *                             atributoEncontrado = true;
 *                         }
 *                     }
 *                         if (miConcesionario[0].tipoMotor.compareToIgnoreCase(atributoABuscar) == 0) {
 *                             System.out.println("Quieres buscar por tipo de motor?(Y/N)");
 *                             confirmacionBusqueda = br.readLine();
 *                             if (confirmacionBusqueda.compareToIgnoreCase("Y") == 0) {
 *                                 atributoEncontrado = true;
 *                             }
 *
 *                         }
 */

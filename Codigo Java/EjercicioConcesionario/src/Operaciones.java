public class Operaciones {
    Operaciones(){

    }

    public static void ordenarPrecioBurbuja(Coche miConcesionario[]){
        Coche aux = new Coche();
        int cuentaintercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        for (boolean ordenado=false;!ordenado;){
            for (int i=0;i<miConcesionario.length-1;i++){
                if (miConcesionario[i].precioBase>miConcesionario[i+1].precioBase){
                    //Intercambiamos valores
                    aux=miConcesionario[i];
                    miConcesionario[i]=miConcesionario[i+1];
                    miConcesionario[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaintercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaintercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaintercambios=0;
        }
    }

    public static void ordenarMarcasBurbuja(Coche miConcesionario[]){
        Coche aux = new Coche();
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while(!ordenado){
            for(int i=0;i<miConcesionario.length-1;i++){
                if (miConcesionario[i].marca.compareToIgnoreCase(miConcesionario[i+1].marca)>0){
                    //Intercambiamos valores
                    aux=miConcesionario[i];
                    miConcesionario[i]=miConcesionario[i+1];
                    miConcesionario[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }

    }
    public static void ordenarModeloBurbuja(Coche miConcesionario[]){
        Coche aux = new Coche();
        boolean ordenado=false;
        int cuentaIntercambios=0;
        //Usamos un bucle anidado, saldra cuando este ordenado el array
        while(!ordenado){
            for(int i=0;i<miConcesionario.length-1;i++){
                if (miConcesionario[i].modelo.compareToIgnoreCase(miConcesionario[i+1].modelo)>0){
                    //Intercambiamos valores
                    aux=miConcesionario[i];
                    miConcesionario[i]=miConcesionario[i+1];
                    miConcesionario[i+1]=aux;
                    //indicamos que hay un cambio
                    cuentaIntercambios++;
                }
            }
            //Si no hay intercambios, es que esta ordenado.
            if (cuentaIntercambios==0){
                ordenado=true;
            }
            //Inicializamos la variable de nuevo para que empiece a contar de nuevo
            cuentaIntercambios=0;
        }

    }



        public static boolean busquedaBinariaModelo(Coche[] miConcesionario,String atributobuscado) {
            boolean encontrado=false;
            int index = Integer.MAX_VALUE;
            int low =0;
            int high= miConcesionario.length-1;
            int mid= Integer.MAX_VALUE;
            while (low <= high) {

                 mid = (low + (miConcesionario.length-1)) / 2;

                if (miConcesionario[mid].modelo.compareToIgnoreCase(atributobuscado)<0) {
                    low = mid + 1;
                } else if (miConcesionario[mid].modelo.compareToIgnoreCase(atributobuscado)>0) {
                    high = mid - 1;
                } else if (miConcesionario[mid].modelo.compareToIgnoreCase(atributobuscado)==0) {
                    index = mid;
                    System.out.println("El modelo "+atributobuscado+
                            " lo encontramos en la posicion -> "+ index);
                    encontrado=true;
                    break;
                }
            }
            return encontrado;
        }

        public static int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {

            int middle = (low + high) / 2;
            if (high < low) {
                return -1;
            }

            if (key == sortedArray[middle]) {
                return middle;
            } else if (key < sortedArray[middle]) {
                return runBinarySearchRecursively(sortedArray, key, low, middle - 1);
            } else {
                return runBinarySearchRecursively(sortedArray, key, middle + 1, high);
            }
        }






    }



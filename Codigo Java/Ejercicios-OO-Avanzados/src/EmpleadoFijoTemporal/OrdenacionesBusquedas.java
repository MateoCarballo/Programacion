package EmpleadoFijoTemporal;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacionesBusquedas {

    public static void ordenarPorAtributo(ArrayList<Empleado> lista, String atributo) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                Empleado p1 = lista.get(i);
                Empleado p2 = lista.get(j);

                if (atributo.equalsIgnoreCase("nss")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
                if (atributo.equalsIgnoreCase("nombre")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
                if (atributo.equalsIgnoreCase("fechaDeNacimiento")) {
                    if (p1.getNombre().compareTo(p2.getNombre()) > 0) {
                        Collections.swap(lista, i, j);
                    }
                }
            }
        }
    }
}

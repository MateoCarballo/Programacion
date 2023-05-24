package Has_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class jasmap {
    public static void main(String[] args) {
        HashMap<Integer, Probando_hasmap> Mi_hasmap = new HashMap();
        Probando_hasmap a = new Probando_hasmap("Pedro", 25), b = new Probando_hasmap("Helena", 35), c = new Probando_hasmap("Anxo", 45), d = new Probando_hasmap("Aine", 55);
        Mi_hasmap.put(a.getEdad(), a);
        Mi_hasmap.put(b.getEdad(), b);
        Mi_hasmap.put(c.getEdad(), c);
        Mi_hasmap.put(d.getEdad(), d);
        ArrayList<Probando_hasmap> Listado = new ArrayList<>();
        for (int edad = 0; edad < 100; edad++)
            if (Mi_hasmap.containsKey(edad)) {
                Probando_hasmap h = Mi_hasmap.get(edad);
                Listado.add(h);
            }
        Collections.sort(Listado, (Probando_hasmap z, Probando_hasmap p) -> z.getNombre().compareToIgnoreCase(p.getNombre()));
        for (Probando_hasmap w : Listado) System.out.println(w);
    }
}

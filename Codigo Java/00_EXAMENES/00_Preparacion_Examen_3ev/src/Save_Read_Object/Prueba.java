package Save_Read_Object;

import java.io.Serializable;

public class Prueba implements Serializable {
    public Prueba(String clasedePrueba) {
        this.clasedePrueba = clasedePrueba;
    }

    @Override
    public String toString() {
        return "Prueba{" +
                "clasedePrueba='" + clasedePrueba + '\'' +
                '}';
    }

    public String getClasedePrueba() {
        return clasedePrueba;
    }

    public void setClasedePrueba(String clasedePrueba) {
        this.clasedePrueba = clasedePrueba;
    }

    String clasedePrueba = "Prueba";



}

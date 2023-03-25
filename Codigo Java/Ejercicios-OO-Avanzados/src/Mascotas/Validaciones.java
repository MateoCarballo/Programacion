package Mascotas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validaciones implements ValidacionesInterface {

    @Override
    public boolean validarFecha(String fecha) throws Exception {
        if (fecha == null || fecha.isEmpty()) {
            return false;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatoFecha);
        /*
        Configura el formato de la fecha en modo estricto,
        no pasa una si le damos true permite 31 de Febrero y lo interpreta como 3 de marzo
         */
        dateFormat.setLenient(false);
        try {
            Date date = dateFormat.parse(fecha);
            return true;
        } catch (Exception e) {
            throw new Exception("Dato incorrecto");
        }
    }

    @Override
    public String validarLetras(String entradaTeclado) throws Exception {
        try {
            if (entradaTeclado.matches("^[a-zA-Z]+$")) {
                return entradaTeclado;
            } else {
                throw new IllegalArgumentException("Compruebe sus entradas por teclado, " +
                        "no cumple las especificaciones.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public boolean validarNumeros(String numeros) throws Exception {
        if (numeros == null || numeros.isEmpty()) {
            return false;
        }
        try {
            return numeros.matches("^[0-9]+$");
        } catch (Exception e) {
            throw new Exception("Dato incorrecto");
        }
    }

    @Override
    public boolean validarOKorNOK(String entrada) throws Exception {
        if (entrada == null || entrada.isEmpty()) {
            return false;
        }
        try {
            if (entrada.equalsIgnoreCase("OK") || entrada.equalsIgnoreCase("NOK")){
                return true;
            }
        } catch (Exception e) {
            throw new Exception("Dato incorrecto");
        }
        return false;
    }

}


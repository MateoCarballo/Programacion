package Mascotas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validaciones implements ValidacionesInterface {

    @Override
    public boolean validarFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            return false;
        }

        // Creamos un objeto SimpleDateFormat para validar la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            // Intentamos parsear la fecha
            Date date = dateFormat.parse(fecha);
            return true;
        } catch (ParseException e) {
            // Si se produce una excepción, la fecha es inválida
            return false;
        }
    }

    @Override
    public boolean validarLetras(String texto) {
        // Verificamos si la cadena es nula o vacía
        if (texto == null || texto.isEmpty()) {
            return false;
        }
        try {
            return texto.matches("^[a-zA-Z]+$");
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean validarNumeros(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            return false;
        }
        try {
            return numeros.matches("^[0-9]+$");
        } catch (Exception e) {
            return false;
        }
    }
}


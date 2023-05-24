package Validaciones_Formatear;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Validaciones {


    public static boolean validarDNI(String dni) {
        String patronRegex = "^\\d{8}[A-HJ-NP-TV-Z]$";
        return Pattern.matches(patronRegex, dni);
    }

    public static boolean validarEnteroPositivo(int numero) {
        return numero > 0;
    }

    public static boolean validardoublePositivo(double numero) {
        return numero > 0;
    }

    public static boolean validarFloatPositivo(float numero) {
        return numero > 0;
    }

    public boolean inputNoNull(String input) {
        if (input == null || input.isEmpty()) {
            return false; // El nombre no puede ser nulo o vacío
        }else return true;

    }


    public static String formatearDouble(double numero) {
        DecimalFormat formato = new DecimalFormat("#.00");
        return formato.format(numero);
    }
}
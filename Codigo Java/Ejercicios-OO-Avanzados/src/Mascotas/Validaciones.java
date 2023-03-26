package Mascotas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Validaciones implements ValidacionesInterface {


    /*
    Al usar este mio la interfaz de la que hereda tiene como parametro fijado el formato de la fecha
     */

    public boolean validarCaracteres(String entradaTeclado, String regex) {
        /*
        En la String metemos que queremos comprobar,asi es lo mas generico posible
        "^[a-zA-Z]+$"
         */
        return entradaTeclado.matches(regex);
    }

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
        /*
        Pedir fecha forma aula virtual
         */
    public static Date pedirFecha() throws ParseException {
        Date fecha = null;
        boolean error;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        BufferedReader LEE = new BufferedReader(new InputStreamReader(System.in));

        do {
            error=false;

            System.out.print("Fecha(dd/MM/yyyy): ");
            try {
                fecha = dateFormat.parse(LEE.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Calculos_DiasEntreFechas.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while(error);
        return fecha;
    }

    @Override
    public boolean validarLetras(String entradaTeclado) throws Exception {
        try {
            if (entradaTeclado.matches("^[a-zA-Z]+$")) {
                return true;
            } else {
                throw new IllegalArgumentException("Compruebe sus entradas por teclado, " +
                        "no cumple las especificaciones.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
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


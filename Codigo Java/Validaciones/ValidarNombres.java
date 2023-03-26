package ValidarNombresyNumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidarNombres {


//6. Valida si una cadena tiene el formato de nombre de persona, incluyendo nombres compuestos

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String DNI="12345678Y";
        boolean esCorrecto=false;
        esCorrecto=validaDNI_Exp(DNI);
        if(!esCorrecto){
            System.err.println("No flipes, no es asi");
        }else{
            System.out.println("Esta bien");
        }
    }
    public static boolean validaNumeroEntero_Exp(String texto){
        //    1. Valida si una cadena es un numero entero (positivo/negativo);

        return texto.matches("^-?[0-9]+$");
    }
    public static boolean validaNumeroEnteroPositivo_Exp(String texto){

        return texto.matches("^[0-9]+$");
    }
    public static boolean validaNumeroEnteroNegativo_Exp(String texto){

        return texto.matches("^-[0-9]+$");
    }
    //2. Valida si una cadena  es un numero real (positivo o negativo) con un numero de decimales.
    public static boolean validarNumeroReal(String numero){
        return numero.matches("^-?[0-9]+([\\.,][0.9]+)?$");
    }


    //            3. Valida si una cadena es un DNI: 8 numeros y una letra al final.
    public static boolean validaDNI_Exp(String DNI){

        return DNI.matches("^[1-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]{1}$");

    }
    //VALIDAR UNA FECHA
    public static boolean validaNumeroFecha_Exp(String texto) {

        return texto.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\/](19|20)\\d{2}$");
    }
    //5. Valida si una cadena tiene formato de telefono (9 numeros)
    public static boolean validarNumeroTelefono(String telefono){
        return telefono.matches("[0-9]{9}");
    }




    public static boolean validarNombre(String nombre){
        boolean respuesta= nombre.matches("^([A-Z][a-z]+[ ]?){1,2}$") && nombre.length() < 25;
        return respuesta;
    }


}

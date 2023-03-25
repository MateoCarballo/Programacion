package Mascotas;

public interface ValidacionesInterface {
    static final String formatoFecha = "dd/MM/yyyy";
    boolean validarFecha(String fecha);
    boolean validarLetras(String texto);
    boolean validarNumeros(String numeros);

    boolean validarOKorNOK(String entrada);
}


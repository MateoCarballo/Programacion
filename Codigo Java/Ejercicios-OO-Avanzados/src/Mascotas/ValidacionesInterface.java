package Mascotas;

public interface ValidacionesInterface {
    String formatoFecha = "dd/MM/yyyy";
    boolean validarFecha(String fecha) throws Exception;
    boolean validarLetras(String texto) throws Exception;
    boolean validarNumeros(String numeros) throws Exception;

    boolean validarOKorNOK(String entrada) throws Exception;
}


package Enumeracion;

public class MainEstado {
    public static void main(String[] args) {
            imprimirMensaje(Estado.POR_INICIAR);
            imprimirMensaje(Estado.EN_PROGRESO);
            imprimirMensaje(Estado.FINALIZADO);
            imprimirMensaje(Estado.ERROR);
    }

    public static void imprimirMensaje(Estado estado) {
        System.out.printf(estado.getMensaje(), estado.name());
        System.out.println();
    }
}
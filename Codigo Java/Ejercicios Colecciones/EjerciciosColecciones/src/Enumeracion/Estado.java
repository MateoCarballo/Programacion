package Enumeracion;

public enum Estado {
    POR_INICIAR("El progreso aún no ha iniciado. Enumeracion.Estado: [ %s ]."),
    EN_PROGRESO("El programa está trabajando el la tarea. Enumeracion.Estado: [ %s ]."),
    FINALIZADO("El trabajo ha terminado. Enumeracion.Estado: [ %s ]."),
    ERROR("Revise los datos. Enumeracion.Estado: [ %s ].");

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    Estado(String mensaje) {
        this.mensaje=mensaje;
    }
}

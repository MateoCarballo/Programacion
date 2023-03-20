import java.util.Random;

public class Coche {
    final static String[] marcas={"Audi","BMW","Peugeot","Renault"};
    final static String[] tiposDeModeloAudi={"A1","A3","A4","RS6"};
    final static String[] tiposDeModeloBMW={"Serie1","Serie2","Serie3","Serie4"};
    final static String[] tiposDeModeloPeugeot={"208","308","508","3008"};
    final static String[] TiposDeModeloRenault={"Megane","Clio","Captur","Kadjar"};
    final static String[] motorizacion= {"Gasolina","Diesel","Hibrido","Híbrido Enchufable","Eléctrico"};
    int idCoche;
    String marca;
    String modelo;
    String tipoMotor;
    double precioBase;
    boolean tieneAireAcondicionado;
    boolean tieneCierreCentralizado;
    boolean tienePinturaMetalizada;

    Coche(){

    }

    public Coche(String marca, String tipoMotor, double precioBase, boolean tieneAireAcondicionado,
                 boolean tieneCierreCentralizado, boolean tienePinturaMetalizada) {
        this.marca = marca ;
        this.tipoMotor = tipoMotor;
        this.precioBase = precioBase;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCierreCentralizado = tieneCierreCentralizado;
        this.tienePinturaMetalizada = tienePinturaMetalizada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setIdCoche(int idMiCoche) {
        this.idCoche = idMiCoche;
    }


    public static int numAleatorioI(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static double numAleatorio(double limInferior, double limSuperior){
        double aleatorio = (double)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static boolean booleanoAleatorio(){
        Random generador = new Random();
        boolean miBooleano = generador.nextBoolean();
        return miBooleano;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "idCoche=" + idCoche +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                ", precioBase=" + precioBase +
                ", tieneAireAcondicionado=" + tieneAireAcondicionado +
                ", tieneCierreCentralizado=" + tieneCierreCentralizado +
                ", tienePinturaMetalizada=" + tienePinturaMetalizada +
                '}';
    }
}


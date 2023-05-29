package Pilas_Colas;

public class Plato {


    String color;
    boolean limpio;

    public Plato(String color, boolean limpio) {
        this.color = color;
        this.limpio = limpio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "color='" + color + '\'' +
                ", limpio=" + limpio +
                '}';
    }
}
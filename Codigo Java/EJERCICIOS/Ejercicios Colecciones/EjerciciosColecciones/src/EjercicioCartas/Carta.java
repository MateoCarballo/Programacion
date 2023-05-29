package EjercicioCartas;

public class Carta {

     public enum Palo {
         ORO(" OR "),

         COPAS(" CO "),

         ESPADAS(" ES "),

         BASTOS(" BA ");

         String palo;

         public String getPalo() {
             return palo;
         }

         Palo(String paloMazo) {
             this.palo = paloMazo;
         }
     };

    private Palo paloCarta;
    private int numero;

    public Carta(Palo paloCarta, int numero) {
        this.paloCarta= paloCarta;
        this.numero = numero;
    }

    public Palo getPaloCarta() {
        return paloCarta;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "paloCarta=" + paloCarta +
                ", numero=" + numero +
                '}';
    }
}

public class Utilidades {
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }

    public static void escribirMatriz(char[]miMatriz){
        for (int i = 0; i < miMatriz.length ; i++) {
            System.out.print(miMatriz[i]);
        }
        System.out.println("\n");
    }

    public static void llenarMatriz(char[]miMatriz){
        for (int i = 0; i < miMatriz.length; i++) {
            miMatriz[i]='*';
        }
    }
}

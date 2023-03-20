import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        String entradaTeclado ="";
        int antierrores=0;
        int continuar=0;

        boolean finDelJuego = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Creo un nuevo objeto de la clase Ahorcado
        Ahorcado miAhorcado = new Ahorcado();

        miAhorcado.palabraSecreta=miAhorcado.palabrasSecretas[Utilidades.numAleatorioEntero(0,9)].toUpperCase();
        miAhorcado.longitudPalabraElegida=miAhorcado.palabraSecreta.length();

        char[] palabraSecretaCaracteres =new char[miAhorcado.longitudPalabraElegida];
        char[] palabraVisibleAJugador =new char[miAhorcado.longitudPalabraElegida];

        for (int i = 0; i <miAhorcado.longitudPalabraElegida ; i++) {
            palabraSecretaCaracteres[i]=miAhorcado.palabraSecreta.charAt(i);
            palabraVisibleAJugador[i]='*';
        }
        //Dimensionamos el tamaño de los intentos para permitir 5 errores
        int intentos=miAhorcado.longitudPalabraElegida+5;
        System.out.println("########### EL JUEGO DEL AHORCADO ###########");

        //Facilitamos el juego escribiendo 2 letras al azar
        descubrir2LetrasAleatorias(miAhorcado,palabraVisibleAJugador,palabraSecretaCaracteres);
        Utilidades.escribirMatriz(palabraVisibleAJugador);
       
            do {
                antierrores = 0;
                do {
                    if (antierrores > 0) {
                        System.out.println("Escribe solo una letra!");
                    }
                    entradaTeclado = br.readLine().toUpperCase();
                    antierrores++;

                } while (entradaTeclado.length() != 1);
                //Comprobamos si la letra introducida por teclado está dentro de la matriz de caracteres
                comprobarEntradaTeclado(miAhorcado, palabraSecretaCaracteres, palabraVisibleAJugador, entradaTeclado);
                finDelJuego = comprobarFinJuego(miAhorcado, palabraVisibleAJugador, palabraSecretaCaracteres);
                //Escribimos la nueva forma de la matriz, cambiando los asteriscos por las letras que hemos adivinado
                Utilidades.escribirMatriz(palabraVisibleAJugador);
                intentos--;
                //comprobamos si ha adivinado la palabra o se han acabado los intentos
            } while ((intentos > 0) & (!finDelJuego));

            if (intentos == 0) {
                System.out.println("Lo siento se han acabado los intentos.");
            } else if (finDelJuego) {
                Utilidades.escribirMatriz(palabraVisibleAJugador);
                System.out.println("Enhorabuena has acertado la palabra secreta!!!");
            }

    }

    //
    public static void comprobarEntradaTeclado (Ahorcado miAhorcado,char[] palabraSecretaCaracteres,char[]palabraVisibleaJugador,String entradaTeclado){
        for (int i = 0; i < miAhorcado.longitudPalabraElegida; i++) {
            if (palabraSecretaCaracteres[i] == entradaTeclado.charAt(0)) {
                palabraVisibleaJugador[i]=palabraSecretaCaracteres[i];
            }
        }
    }

    public static boolean comprobarFinJuego(Ahorcado miAhorcado,char[]palabraVisibleaJugador,char[]palabraSecretaCaracteres){
        boolean finDelJuego=false;
        for (int i = 0; i < miAhorcado.longitudPalabraElegida; i++) {
            finDelJuego=false;
            if (palabraVisibleaJugador[i]==palabraSecretaCaracteres[i]){
                finDelJuego=true;
            }
        }
        return finDelJuego;
    }

    public static void descubrir2LetrasAleatorias(Ahorcado miAhorcado,char[]palabraVisibleaJugador,char[]palabraSecretaCaracteres){
        int posicionesIniciales=0;
        for (int i = 0; i <2; i++) {
            posicionesIniciales=Utilidades.numAleatorioEntero(0,(miAhorcado.longitudPalabraElegida));
            palabraVisibleaJugador[posicionesIniciales]=palabraSecretaCaracteres[posicionesIniciales];
        }
    }

}
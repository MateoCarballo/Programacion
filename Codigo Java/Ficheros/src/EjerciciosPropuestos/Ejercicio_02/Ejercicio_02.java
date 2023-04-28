package EjerciciosPropuestos.Ejercicio_02;
import java.io.*;

public class Ejercicio_02 {
    public static void main(String[] args) throws IOException {
        System.out.println("######### EJERCICIO 02 ##########");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ruta fichero origen 1 (con el nombre del archivo)");
        String rutaOrigen1 = br.readLine();

        System.out.println("Ruta fichero origen 2 (con el nombre del archivo)");
        String rutaOrigen2 = br.readLine();

        System.out.println("Ruta fichero destino con el nombre del archivo");
        String rutaDestino = br.readLine();

        copiarDosFicherosAUno(rutaOrigen1,rutaOrigen2,rutaDestino);
    }






    public static void copiarDosFicherosAUno(String rutaOrigen1,String rutaOrigen2,String rutaDestino) throws IOException {
        FileReader readerFile1=null ;
        FileReader readerFile2=null ;
        FileWriter writterFileDest = null;

        try {
            File originFile1 = new File(rutaOrigen1);
            File originFile2 = new File(rutaOrigen2);

            //arriba tengo la ruta de destino sin el nombre
            // asi que compongo el nombre del fichero destino
            int posicionInicio = rutaOrigen1.lastIndexOf('\\');
            int posicionFin = rutaOrigen1.lastIndexOf('.');
            String nombreArchivoDestino = rutaOrigen1.substring(posicionInicio+1,posicionFin);

            posicionInicio = rutaOrigen2.lastIndexOf('\\');
            posicionFin = rutaOrigen2.lastIndexOf('.');
            nombreArchivoDestino +="_"+rutaOrigen2.substring(posicionInicio+1,posicionFin);


            String rutaDestinoConNombreArchivo= rutaDestino+nombreArchivoDestino+".txt";
            File destFile = new File(rutaDestinoConNombreArchivo);

            // Importante abrir y cerar las escrituras
            // y lecturas no se pueden hacer las dos a la vez

            if (!destFile.exists()) {
                System.out.println("El fichero no existe");
                destFile.createNewFile();
            }

            // Abrimos o reader e o writer
            readerFile1 = new FileReader(rutaOrigen1);
            readerFile2 = new FileReader(rutaOrigen2);
            writterFileDest = new FileWriter(rutaDestinoConNombreArchivo,true);

            // Usamos os métodos read e write para ler e escribir caracter a caracter
            int oneChar;
            //Copio el primer archivo
            while ((oneChar = readerFile1.read()) != -1) {
                writterFileDest.write(oneChar);
            }
            while ((oneChar = readerFile2.read()) != -1) {
                writterFileDest.write(oneChar);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // reader e o writer se están abertos
            if (readerFile1 != null) {
                readerFile1.close();
            }
            if (readerFile2 != null) {
                readerFile1.close();
            }
            if (writterFileDest != null) {
                writterFileDest.close();
            }


        }


    }
}

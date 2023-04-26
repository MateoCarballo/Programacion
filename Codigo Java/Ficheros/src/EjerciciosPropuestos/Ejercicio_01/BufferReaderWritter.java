package EjerciciosPropuestos.Ejercicio_01;

import java.io.*;

public class BufferReaderWritter {

    public void copyFile(String sourceFilePath, String destFilePath)
            throws IOException {
        // Declaramos o reader e o writer con buffer
        BufferedReader in = null;
        BufferedWriter out = null;
        try {


            File originF = new File(sourceFilePath);
            File destF = new File(destFilePath);


            // Importante abrir y cerar las escrituras y lecturas no se pueden hacer las dos a la vez
            if (!originF.exists()) {
                System.out.println("El fichero no existe");
                originF.createNewFile();
                out = new BufferedWriter(new FileWriter(sourceFilePath));
                out.write("Esto es una prueba");
                out.close();


            }

            // Abrimos o reader e o writer
            in = new BufferedReader(new FileReader(sourceFilePath));
            out = new BufferedWriter(new FileWriter(destFilePath));
            // Usamos os métodos readLine, write e writeLine para ler e escribir
            // liña a liña
            String line;
            while ((line = in.readLine()) != null) {
                line =line.trim();
                out.write(line);
                out.newLine();
            }
            // Non sería necesario, pero forzamos o volcado do buffer ao rematar
            out.flush();
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // reader e o writer se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

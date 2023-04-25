import java.io.*;

public class CopyFileBufferRW{

        public void copyFileBuffer(String sourceFilePath, String destFilePath) throws IOException {
        // Declaramos o reader e o writer con buffer
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            // Abrimos o reader e o writer
            in = new BufferedReader(new FileReader(sourceFilePath));
            out = new BufferedWriter(new FileWriter(destFilePath));
            // Usamos os métodos readLine, write e writeLine para ler e escribir
            // liña a liña
            String line;
            while ((line = in.readLine()) != null) {
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

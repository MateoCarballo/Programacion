import java.io.*;

public class CopyFileInputOutputStream {

    public void copyFileIOStream(String sourceFilePath, String destFilePath)
            throws IOException {
        // Declaramos os streams de entrada e saída
        InputStream in = null;
        OutputStream out = null;
        try {
            // Abrimos os streams
            in = new FileInputStream(sourceFilePath);
            out = new FileOutputStream(destFilePath);
            // Usamos os métodos read e write para ler e escribir byte a byte
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write(oneByte);
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos os
            // streams se están abertos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

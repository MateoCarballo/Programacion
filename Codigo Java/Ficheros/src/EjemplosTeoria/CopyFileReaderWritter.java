package EjemplosTeoria;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderWritter {

    public void copyFile(String sourceFilePath, String destFilePath)
            throws IOException {

        // Declaramos o reader e o writer
        FileReader fr = null;
        FileWriter fw = null;
        try {

            File originF = new File(sourceFilePath);
            File destF = new File(destFilePath);

            if (!originF.exists()) {
                System.out.println("El fichero no existe");
                originF.createNewFile();
            }

            if (!destF.exists()) {
                destF.createNewFile();
            }
            // Abrimos o reader e o writer
            fr = new FileReader(sourceFilePath);
            fw = new FileWriter(destFilePath);
            // Usamos os métodos read e write para ler e escribir caracter a caracter
            int oneChar;
            //Significa mientras no lleguemos al final del fichero
            while ((oneChar = fr.read()) != -1) {
                fw.write(oneChar);
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // reader e o writer se están abertos
            if (fr != null) {
                fr.close();
            }
            if (fw != null) {
                fw.close();
            }
        }
    }
}
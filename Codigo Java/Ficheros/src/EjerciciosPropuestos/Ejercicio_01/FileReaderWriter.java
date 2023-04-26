package EjerciciosPropuestos.Ejercicio_01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public void copyFileNSpaces(String sourceFilePath, String destFilePath)
            throws IOException {

        // Declaramos o reader e o writer
        FileReader fr = null;
        FileWriter fwDestiny = null;
        FileWriter fwOrigin= null;
        try {

            File originF = new File(sourceFilePath);
            File destF = new File(destFilePath);


        // Importante abrir y cerar las escrituras y lecturas no se pueden hacer las dos a la vez
            if (!originF.exists()) {
                System.out.println("El fichero no existe");
                originF.createNewFile();
                fwOrigin = new FileWriter(sourceFilePath);
                fwOrigin.write("Esto es una prueba");
                fwOrigin.close();


            }
            fr = new FileReader(sourceFilePath);
            fwDestiny = new FileWriter(destFilePath);

            if (!destF.exists()) {
                destF.createNewFile();
            }
            // Abrimos o reader e o writer

            // Usamos os métodos read e write para ler e escribir caracter a caracter
            int oneChar;
            //Significa mientras no lleguemos al final del fichero
            while ((oneChar = fr.read()) != -1) {
                if(!(oneChar==32)){
                    fwDestiny.write(oneChar);
                }
            }
        } finally {
            // En calquera caso, producirase ou non unha excepción, pechamos o
            // reader e o writer se están abertos
            if (fr != null) {
                fr.close();
            }
            if (fwDestiny != null) {
                fwDestiny.close();
            }
            if (fwOrigin != null) {
                fwOrigin.close();
            }
        }
    }
}

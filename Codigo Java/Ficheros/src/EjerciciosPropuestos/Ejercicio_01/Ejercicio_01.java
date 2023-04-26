package EjerciciosPropuestos.Ejercicio_01;

import java.io.*;

public class Ejercicio_01 {

    public static void main(String[] args) throws IOException {

        /**
         *      FileReaderWriter withFileReader = new FileReaderWriter();
         *      withFileReader.copyFileNSpaces("ConEspaciosUsandoFilerw.txt",
         *      "SinEspaciosUsandoFReaderWritter.txt");
         */

/**
 *          //Copiar un archivo a otro sin espacios y creandolo si no existe
 *         BufferReaderWritter withBufferReaderWritter = new BufferReaderWritter();
 *         withBufferReaderWritter.copyFile("OriginBrw.txt","Destiny.txt");
 */

        BufferReaderWritter withBufferReaderWritter = new BufferReaderWritter();
        withBufferReaderWritter.copyFile("OriginalMayusMinus.txt",
                "SoloMayusculas.txt");

    }


}

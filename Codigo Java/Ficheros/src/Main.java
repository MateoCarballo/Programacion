import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CopyFileReaderWritter cf = new CopyFileReaderWritter();
        //cf.copyFile("FicheroOrigen.txt","FicheroDestino.txt");
        CopyFileInputOutputStream cf1 = new CopyFileInputOutputStream();
        cf1.copyFileIOStream("FicheroOrigen.txt","FicheroDestino.txt");
    }
}
package Creacion_Ficheros;

import Excepcions.EmptyImput;
import Interfaces.Bufferreader;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class CreateFiles implements Bufferreader { /* public static void main(String[] args) throws IOException { newFile newFile = new newFile(); newFile.createXMLfile("Automatico"); newFile.createDatFile("Automatico"); newFile.createJsontFile("Automatico"); newFile.createTxtFile("Automatico"); newFile.createTxtFile(); newFile.createXMLfile(); newFile.createDatFile(); newFile.createJsonFile(); }*/
    public static final String DIRECTORY_PATH = "Ficheros/", END_DATA = ".dat", END_JSON = ".json", END_XML = ".xml", END_TXT = ".txt", date = String.valueOf(LocalDate.now());

    public File createXMLfile(String fileName) throws IOException {

        File fileXML = new File(DIRECTORY_PATH + fileName + END_XML);
        if (!fileXML.exists()) fileXML.createNewFile();
        return fileXML;
    }

    public File createXMLfile() {
        boolean flag = false;
        File fileXML = null;
        do try {
            System.out.println("Introducir el nombre del archivo");
            String fileName = br.readLine();
            fileXML = new File(DIRECTORY_PATH + fileName + END_XML);
            if (!fileXML.exists()) fileXML.createNewFile();
            flag = true;
            if (fileName.equals("")) throw new EmptyImput();
        } catch (EmptyImput e) {
            System.err.println("Debes introducir un nombre");
            flag = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } while (!flag);
        return fileXML;
    }

    public File createDatFile(String fileName) throws IOException {
        File fileDat = new File(DIRECTORY_PATH + fileName + END_DATA);
        if (!fileDat.exists()) fileDat.createNewFile();
        return fileDat;
    }

    public File createDatFile() {
        boolean flag = false;
        File fileDat = null;
        do try {
            System.out.println("Introducir el nombre del archivo");
            String fileName = br.readLine();
            fileDat = new File(DIRECTORY_PATH + fileName + END_DATA);
            if (!fileDat.exists()) fileDat.createNewFile();
            flag = true;
            if (fileName.equals("")) throw new EmptyImput();
        } catch (EmptyImput e) {
            System.err.println("Debes introducir un nombre");
            flag = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } while (!flag);
        return fileDat;
    }

    public File createJsontFile(String fileName) throws IOException {
        File fileJson = new File(DIRECTORY_PATH + fileName + END_JSON);
        if (!fileJson.exists()) fileJson.createNewFile();
        return fileJson;
    }

    public File createJsonFile() {
        boolean flag = false;
        File jsonFile = null;
        do try {
            System.out.println("Introducir el nombre del archivo");
            String fileName = br.readLine();
            jsonFile = new File(DIRECTORY_PATH + fileName + END_JSON);
            if (!jsonFile.exists()) jsonFile.createNewFile();
            flag = true;
            if (fileName.equals("")) throw new EmptyImput();
        } catch (EmptyImput e) {
            System.err.println("Debes introducir un nombre");
            flag = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } while (!flag);
        return jsonFile;
    }

    public File createTxtFile(String fileName) throws IOException {
        File fileTxt = new File(DIRECTORY_PATH + fileName + END_TXT);
        if (!fileTxt.exists()) fileTxt.createNewFile();
        return fileTxt;
    }

    public File createTxtFile() {
        boolean flag = false;
        File txtFile = null;
        do try {
            System.out.println("Introducir el nombre del archivo");
            String fileName = br.readLine();
            txtFile = new File(DIRECTORY_PATH + fileName + END_TXT);
            if (!txtFile.exists()) txtFile.createNewFile();
            flag = true;
            if (fileName.equals("")) throw new EmptyImput();
        } catch (EmptyImput e) {
            System.err.println("Debes introducir un nombre");
            flag = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } while (!flag);
        return txtFile;
    }
}

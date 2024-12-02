package es.santander.ascender.proyecto11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileProcesor implements IFileProcesor {
    public String leerFile(String filePath) {
        try {
            String content = Files.readString(Paths.get(filePath));
            return content;
        } catch (IOException e) {
            System.out.println("File not found");
            return "";
        }

    }
    
    public String eliminarVocales(String input) {
        /*
        char[] vocales ={'a','e','i','o','u','y'};
        for (char symbol : input.toCharArray()) {
            if symbol = char
        };*/
        return "vocaler";
    }
    public void escribirAFile(String filePath, String content) {
        try {
            Files.writeString(Paths.get(filePath), content);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    


}

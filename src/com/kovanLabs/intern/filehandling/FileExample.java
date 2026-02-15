package com.kovanLabs.intern.filehandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class FileExample {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\Asus\\IdeaProjects\\Recurtion\\src\\com\\kovanLabs\\intern\\filehandling\\example.txt");
        try {
            List<String> lines = new ArrayList<>();
            lines.add("Welcome");
            lines.add("to");
            lines.add("GeeksForGeeks");
            lines.add("KovanLabs");
            Files.write(filePath, lines);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

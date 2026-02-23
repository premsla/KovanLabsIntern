package com.kovanLabs.intern.filehandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class DirectoryWalker {
    public static void main(String[] args) {
        Path startPath = Paths.get("C:\\Users\\Asus\\IdeaProjects\\KovanLabsIntern\\src\\com\\kovanLabs\\intern");
        try (Stream<Path> paths = Files.walk(startPath)) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(path -> {
                        try {
                            long size = Files.size(path);
                            System.out.println(path + " -> " + size + " bytes");
                        } catch (IOException e) {
                            System.out.println("Error reading file: " + path);
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

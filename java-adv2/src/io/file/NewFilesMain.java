package io.file;

import java.io.IOException;
import java.nio.file.*;

public class NewFilesMain {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("temp/example.txt");
        Path directory = Paths.get("temp/exampleDir");

        System.out.println("File exists : " + Files.exists(file));

        try {
            Files.createFile(file);
            System.out.println("File created" );
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists");
        }

        try {
            Files.createDirectories(directory);
        } catch (FileAlreadyExistsException e) {
            System.out.println(directory + "direcotry already exists");
        }

        // Files.delete(file);
        // System.out.println("File deleted" );

        System.out.println("Is regular file : " + Files.isRegularFile(file));
        System.out.println("Is directory : " + Files.isDirectory(directory));
        System.out.println("File name : " + file.getFileName());
        System.out.println("File size : " + Files.size(file));

        Path newFile = Path.of("temp/newExample.txt");
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved/rename");

        System.out.println("Last modified time : " + Files.getLastModifiedTime(newFile));
    }
}

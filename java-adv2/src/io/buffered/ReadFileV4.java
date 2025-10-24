package io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        byte[] bytes = fis.readAllBytes();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("File created : " + FILE_NAME);
        System.out.println("FILE size : " + bytes.length / 1024 / 1024 + "MB");
        System.out.println("Time taken : " + (end - start) + "ms");
    }
}

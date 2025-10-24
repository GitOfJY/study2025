package io.buffered;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1);
            // 10mb 파일 생성
        }
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println("File created : " + FILE_NAME);
        System.out.println("FILE size : " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("Time taken : " + (end - start) + "ms");
    }
}

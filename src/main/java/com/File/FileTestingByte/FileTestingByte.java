package com.File.FileTestingByte;

import java.io.*;

public class FileTestingByte {
    public static void main(String[] args) throws IOException {


        InputStream inputStream = new FileInputStream("temp.txt");

        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.read(bytes) != -1) {
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(bytes[i]);

            }
        }

    }
}


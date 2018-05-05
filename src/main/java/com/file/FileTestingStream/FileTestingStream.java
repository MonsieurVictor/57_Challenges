package com.file.FileTestingStream;

import java.io.*;

public class FileTestingStream {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("temp.txt");
        int i = 0;
        while ((i = inputStream.read()) != -1 ) {
            System.out.println(i);
        }
    }
}


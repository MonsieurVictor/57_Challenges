package com.file.FileTestingStreamBuffered;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class main {

    public static void main(String[] args) throws IOException {

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("temp.txt"));
        try(OutputStream outputStream = new FileOutputStream("temp.txt")) {
            byte[] bytes = new byte[]{49, 10, 50};
            outputStream.write(bytes);

        }
    }
}


package com.File.FileTesting;


import java.io.*;

public class FileTesting {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("tempDir");
        File tempTXT = new File("tempDir/temp.txt");
        if (!fileDir.exists()) {
            System.out.println("Creating dir");
            fileDir.mkdir();
        }
        if (!tempTXT.exists()) {
            System.out.println("Creating file");
            tempTXT.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(tempTXT);
        fileWriter.write("Hello\n");
        fileWriter.write("World!\n");
        //fileWriter.flush();
        //fileWriter.close();

        FileReader fileReader = new FileReader(tempTXT);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("More!");
        bufferedWriter.newLine();
        bufferedWriter.write("And More!");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}

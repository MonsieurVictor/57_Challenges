package com.file.FileTestingBuffered;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException{



        //        int i = 0;
//        while ((i = reader.read()) != -1) {
//            System.out.println((char) i);
//        }
//        char[] chars = new char[50];
//        while (reader.read(chars) != -1){
//           for (int i = 0; i < chars.length; i++){
//               if (Character.isAlphabetic(chars[i]) || Character.isWhitespace(chars[i]));
//               System.out.println(chars[i]);
//           }

            //System.out.println(chars);
//        while (reader.ready()){
//            System.out.println(reader.readLine());
//        }


        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt")))  {
            writer.write("str1");
            writer.newLine();
            writer.write("str2");
            writer.close();
        }
    }

}

package com.stringTests.countSentencesAndWords;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ErrorLogger implements IErrorLogger {
    public void errorOpen(IOException e){
        System.out.println("OpenError:" + e.toString());
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("ErrorLog.txt")))  {
            writer.write("OpenError:" + e.toString());
            writer.newLine();
            writer.close();
        }
        catch (IOException fileE) {
            System.out.println("can't write a text opening error to the log");
        }
    }


    public void errorReadFlags (Exception e){
        System.out.println("Error reading flags:" + e.toString());
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter("ErrorLog.txt")))  {
            writer.write("Error reading flags:" + e.toString());
            writer.newLine();
            writer.close();
        }
        catch (IOException flagsE) {
            System.out.println("can't write flag error to the log");
        }
    }

}

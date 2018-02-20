package com.chapter4.PasswordValidationFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * is responsible for writing new credentials to DB.txt
 *
 * */

public class DBWriter {
    DBDriver driver = new DBDriver();
    File DBDir = new File("DBDir");
    File DBtxt = new File("DBDir/DB.txt");
    String filePath = "DBDir/DB.txt";

    public void makeDBDirectory() {

        if (!DBDir.exists()) {
            DBDir.mkdir();
            System.out.println("DBDir created");
        }
    }

    public void makeDBtxt() throws IOException {
        if (!DBtxt.exists()) {
            DBtxt.createNewFile();
            System.out.println("DBtxt.txt created");
        }
    }

    public void writeNewCredentials(String newName,String newLogin,String newPassword) throws IOException {
        driver.getBufferArrayList();
        int nextRowNumber  = driver.getTotalRows() + 1;

        String credentialsRow = nextRowNumber + ", " + newName + ", "+ newLogin + ", " + newPassword + "\r\n";

        try {
            Files.write(Paths.get(filePath), credentialsRow.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(newName + ", the login \"" + newLogin + "\" created successfully!");
    }
}



package com.chapter4.passwordValidationFile;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * is responsible for reading the login/password from DB.txt
 * this is imitation of DB.txt so we want to keep is isolated from everything
 * but a kind of DBDriver
 *
 * */


public class DBReader {

    private ArrayList  arrayList = new ArrayList();

    private ArrayList <String []> readDB() throws IOException {

        try (Scanner scanner = new Scanner(new FileReader("DBDir/DB.txt"))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String strArray [] = str.trim().split("[,;:.!?\\s]+");
                arrayList.add(strArray);
            }
            scanner.close();
        }
        return arrayList;
    }

    public ArrayList <String []> getArrayList() throws IOException {
        readDB();
        return arrayList;
    }
}


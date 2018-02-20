package com.chapter4.LegalDrivingAge;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * is responsible for reading the country/ages from a text file
 *
 **/


public class AgesDBReader {

    public ArrayList<String []> readAgesDB() throws IOException {
        ArrayList arrayList = new ArrayList();
        try (Scanner scanner = new Scanner(new FileReader("DBDir/ages.txt"))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String strArray [] = str.trim().split("[,;:.!?\\s]+");
                arrayList.add(strArray);
            }
            scanner.close();
        }
        return arrayList;
    }
}



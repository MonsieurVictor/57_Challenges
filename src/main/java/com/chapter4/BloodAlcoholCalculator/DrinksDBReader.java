package com.chapter4.BloodAlcoholCalculator;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * is responsible for reading the alcoholic drinks' fortress from a text file
 *
 **/

public class DrinksDBReader {

    public ArrayList<String []> readDrinksDB() throws IOException {
        ArrayList arrayList = new ArrayList();

        try (Scanner scanner = new Scanner(new FileReader("arrayRotation90Degrees:/Users/User/IdeaProjects/57_Challenges/DBDir/drinks.txt"))) {
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








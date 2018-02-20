package com.chapter4.BloodAlcoholCalculator;

import java.io.IOException;
import java.util.ArrayList;

/**
 *  is responsible for getting values from DB
 *
 * */

public class DrinksDBDriver {

    private DrinksDBReader database = new DrinksDBReader();

    private String[][] bufferArray;

    ArrayList<String[]> bufferArrayList = new ArrayList();

    public String[][] getBufferArray() throws IOException {
        this.bufferArrayList = database.readDrinksDB();
        bufferArray = new String[bufferArrayList.size()][3];
        String[] bufferStr;
        for (int i = 0; i < bufferArrayList.size(); i++) {
            bufferStr = bufferArrayList.get(i);
            for (int j = 0; j < bufferStr.length; j++) {
                bufferArray[i][j] = bufferStr[j];
            }
        }
        return bufferArray;
    }

    public void printDrinks() throws IOException {
        getBufferArray();
        for(int i = 0; i<bufferArray.length; i++){
            System.out.print(bufferArray[i][0] + ". ");
            System.out.println(bufferArray[i][1]);
        }
    }


}



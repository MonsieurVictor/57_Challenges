package com.chapter4.legalDrivingAge;

import java.io.IOException;
import java.util.ArrayList;

/**
 *  is responsible for converting rows from ages.txt
 *  to an array "Number, Country, Age"
 *  for the further working with it
 *
 **/

public class AgesDBDriver {

    private AgesDBReader database = new AgesDBReader();

    private String[][] bufferArray;

    ArrayList<String[]> bufferArrayList = new ArrayList();

    public String[][] getBufferArray() throws IOException {
        this.bufferArrayList = database.readAgesDB();
        bufferArray = new String[bufferArrayList.size()][4];
        String[] bufferStr;
        for (int i = 0; i < bufferArrayList.size(); i++) {
            bufferStr = bufferArrayList.get(i);
            for (int j = 0; j < bufferStr.length; j++) {
                bufferArray[i][j] = bufferStr[j];
            }
        }
        return bufferArray;
    }
}

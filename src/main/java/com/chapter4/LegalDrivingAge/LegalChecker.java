package com.chapter4.LegalDrivingAge;

import java.io.IOException;

/**
 *  is responsible for comparing your age
 *  with legal driving ages in different countries
 *
 **/

public class LegalChecker {

    private String legalCountriesMessage = "The countries in which you can drive legally:";
    private String tooYoungMessage = "You are too young to drive in any country!";

    private AgesDBDriver driver = new AgesDBDriver();

    public void checkAge (int inputAge) throws IOException {
        String [][] bufferArray = driver.getBufferArray();
        int legalCountriesCounter = 0;

        for (int i = 0; i < bufferArray.length; i++) {
            int DBAge = Integer.parseInt(bufferArray[i][2]);

            if (inputAge >= DBAge){
                if (legalCountriesCounter==0) {
                    System.out.println(legalCountriesMessage);
                }
                System.out.println(bufferArray[i][1]);
                legalCountriesCounter++;
            }
        }

        if (legalCountriesCounter==0){
            System.out.println(tooYoungMessage);
        }
    }
}

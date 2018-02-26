package com.chapter4.arrayRotation90Degrees;

import java.math.BigDecimal;

public class ArrayInitializer {

    private PropertiesReceiver receiver = new PropertiesReceiver();

    public ArrayProperties initializeArray(ArrayProperties initialArray){

        initialArray = receiver.receiveArrayProperties(initialArray);
        initialArray.array = new int[initialArray.rows][initialArray.collumns];

        for (int i = 0; i<initialArray.rows; i++) {
            for (int j = 0; j < initialArray.collumns; j++) {
                initialArray.array[i][j] =(int) (Math.random()*1000);

                System.out.print(initialArray.array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return initialArray;
    }
}

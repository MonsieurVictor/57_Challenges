package com.chapter4.arrayRotation90Degrees;

public class ArrayRotator {

    private ArrayProperties finalArray = new ArrayProperties();

    public ArrayProperties rotateArray (ArrayProperties initialArray) {

        finalArray.rows = initialArray.array[0].length;
        finalArray.collumns = initialArray.array.length;
        finalArray.array = new int[finalArray.rows][finalArray.collumns];

        for (int i = 0; i<finalArray.rows; i++) {
            for (int j = 0; j < finalArray.collumns; j++) {
                finalArray.array[i][j] = initialArray.array[finalArray.collumns - j - 1][i];
                System.out.print(finalArray.array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return finalArray;
    }
}

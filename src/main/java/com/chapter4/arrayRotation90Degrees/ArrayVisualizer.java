package com.chapter4.arrayRotation90Degrees;

/**
 *  is responsible for visualizing array
 **/

public class ArrayVisualizer {
    public void visualizeArrays(ArrayProperties array){

        for (int i = 0; i<array.rows; i++) {
            for (int j = 0; j < array.collumns; j++) {
                System.out.print(array.array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public void visualizeArrays(int[][] array){

        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}

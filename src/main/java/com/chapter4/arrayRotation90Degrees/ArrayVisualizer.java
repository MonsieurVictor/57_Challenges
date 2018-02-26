package com.chapter4.arrayRotation90Degrees;

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
}

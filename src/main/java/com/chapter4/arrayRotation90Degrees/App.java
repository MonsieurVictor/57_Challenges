package com.chapter4.arrayRotation90Degrees;

/**
 *  A simple program which rotates array by 90 degrees
 **/

public class App {
    private ArrayProperties initialArray = new ArrayProperties();
    private ArrayProperties finalArray = new ArrayProperties();
    private ArrayRotator rotator = new ArrayRotator();
    private ArrayVisualizer visualizer = new ArrayVisualizer();
    private ArrayInitializer initializer = new ArrayInitializer();

    private void start(){
        initialArray = initializer.initializeArray(initialArray);
        finalArray = rotator.rotateArray(initialArray);
//        visualizer.visualizeArrays(initialArray);
//        visualizer.visualizeArrays(finalArray);

    }


    public static void main(String[] args) {
        //App app = new App();
        //app.start();
    }

    /**
     * supposing the passed array isn't empty
     * @param arr
     * @return
     */
    public static int[][] rotateArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int [][] result = new int[cols][rows];

        for (int i = 0; i < rows * cols; i++) {
            result[i % cols][i / cols] = arr[(rows - 1) - i / cols][i % cols];
        }
        return result;
    }

}

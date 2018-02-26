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
        App app = new App();
        app.start();
    }


}

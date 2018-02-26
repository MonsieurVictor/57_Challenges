package com.chapter4.arrayRotation90Degrees;

import com.utils.ConsoleInputsReceiver;

public class PropertiesReceiver {

    ConsoleInputsReceiver console = new ConsoleInputsReceiver();

    public ArrayProperties receiveArrayProperties(ArrayProperties initialArray){

        System.out.println("Please enter the number of rows:");
        initialArray.rows = console.insistOnIntegerPositiveInput();
        System.out.println("Please enter the number of collumns:");
        initialArray.collumns = console.insistOnIntegerPositiveInput();
        return initialArray;
    }
}

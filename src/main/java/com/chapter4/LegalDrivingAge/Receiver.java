package com.chapter4.LegalDrivingAge;

import com.utils.ConsoleInputsReceiver;

/**
 * is responsible for receiving values from keyboard
 *
 **/

public class Receiver {

    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private String promptAgeMsg = "What is your age?";

    public int promptAge() {
        System.out.println(promptAgeMsg);
        return console.insistOnIntegerPositiveInput();
    }
}




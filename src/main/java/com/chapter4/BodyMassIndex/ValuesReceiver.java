package com.chapter4.BodyMassIndex;

/**
 *  is responsible for receiving values from a console
 **/

import com.utils.ConsoleInputsReceiver;

public class ValuesReceiver {

    private String promptHeight = "What is your height (in cm)?";
    private String promptWeight = "What is your weight (in kg)?";
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();

    public HumanProperties promptValues(HumanProperties human) {

        System.out.println(promptHeight);
        human.height = console.insistOnDoublePositiveInput() / 100;
        System.out.println(promptWeight);
        human.weight = console.insistOnDoublePositiveInput();
        return human;
    }
}

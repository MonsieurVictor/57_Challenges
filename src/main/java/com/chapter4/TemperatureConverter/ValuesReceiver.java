package com.chapter4.TemperatureConverter;

import com.utils.ConsoleInputsReceiver;

/**
 *  is responsible for receiving values from a console
 **/

public class ValuesReceiver {

    private String promptInitialChoice = "Press C to convert from Celsius\n" +
            "Press F to convert from Fahrenheit\n" +
            "Press K to convert from Kelvin\n" +
            "Your choice: " ;
    private String promptFinalChoice = "Press C to convert to Celsius\n" +
            "Press F to convert to Fahrenheit\n" +
            "Press K to convert to Kelvin\n" +
            "Your choice: " ;

    private String promptTemperature = "Please enter initial temperature";

    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private Converter converter = new Converter();
    private Values values = new Values();
    private ChoiceChecker checker = new ChoiceChecker();

    public void promptValues(){

        while (true) {
            System.out.println(promptInitialChoice);
            values.initialTempChoice = console.insistOnEnglish().toLowerCase();
            if (checker.checkChoice(values.initialTempChoice)){
                break;
            }
        }

        while (true) {
            System.out.println(promptFinalChoice);
            values.finalTempChoice = console.insistOnEnglish().toLowerCase();
            if (checker.checkChoice(values.finalTempChoice)){
                break;
            }
        }
        System.out.println(promptTemperature);
        values.initialTemp = console.insistOnDoubleInput();
        converter.initialTempDigest(values);
    }
}

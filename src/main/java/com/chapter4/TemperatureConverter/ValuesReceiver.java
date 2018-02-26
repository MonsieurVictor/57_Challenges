package com.chapter4.TemperatureConverter;

import com.utils.ConsoleInputsReceiver;

/**
 *  is responsible for receiving temperatureValues from a console
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
    private TemperatureValues temperatureValues = new TemperatureValues();
    private ChoiceChecker checker = new ChoiceChecker();

    public void promptValues(){

        while (true) {
            System.out.println(promptInitialChoice);
            temperatureValues.initialTempChoice = console.insistOnEnglish().toLowerCase();
            if (checker.checkChoice(temperatureValues.initialTempChoice)){
                break;
            }
        }

        while (true) {
            System.out.println(promptFinalChoice);
            temperatureValues.finalTempChoice = console.insistOnEnglish().toLowerCase();
            if (checker.checkChoice(temperatureValues.finalTempChoice)){
                break;
            }
        }
        System.out.println(promptTemperature);
        temperatureValues.initialTemp = console.insistOnDoubleInput();
        converter.initialTempDigest(temperatureValues);
    }
}

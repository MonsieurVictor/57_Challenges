package com.chapter4.TemperatureConverter;

import com.utils.ConsoleInputsReceiver;

/**
 *  is responsible for receiving values from a console
 **/

public class ValuesReceiver {

    private String promptChoise = "Press C to convert from Fahrenheit to Celsius\n" +
            "Press F to convert from Celsius to Fahrenheit\n" +
            "Your choice: " ;
    private String promptTemperature = "Please enter the temperature in ";

    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private Converter converter = new Converter();
    private Values values = new Values();

    public void promptValues(){
        System.out.println(promptChoise);
        values.choice = console.insistOnEnglish().toLowerCase();

        if(values.choice.equals("c")){

            values.typeOfInitialTemp = "Celsius";
            System.out.println(promptTemperature + values.typeOfInitialTemp);
            values.initialTemp = console.insistOnDoubleInput();
            converter.convertFromCelsius(values);

        } else if (values.choice.equals("f")){

            values.typeOfInitialTemp = "Fahrenheit";
            System.out.println(promptTemperature + values.typeOfInitialTemp);
            values.initialTemp = console.insistOnDoubleInput();
            converter.convertFromFahrenheit(values);

        } else {
            System.out.println("incorrect!");
            promptValues();
        }
    }
}

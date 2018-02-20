package com.chapter4.TemperatureConverter;

/**
 *  is responsible for calculating temperature
 **/

import java.math.BigDecimal;

public class Converter {

    public void finalAnswer(Values values){
        values.convertedTemp = BigDecimal.valueOf(values.convertedTemp)
                .setScale(1, BigDecimal.ROUND_CEILING)
                .doubleValue();
        System.out.println("The temperature in " +
                values.typeOfConvertedTemp + " is " + values.convertedTemp);
    }

    public double convertFromFahrenheit(Values values){
        values.typeOfConvertedTemp = "Celsius";
        values.convertedTemp = (values.initialTemp - 32) * 5 / 9;
        finalAnswer(values);
        return values.convertedTemp;
    }

    public double convertFromCelsius(Values values){
        values.typeOfConvertedTemp = "Fahrenheit";
        values.convertedTemp = values.initialTemp * 9 / 5 + 32;
        finalAnswer(values);
        return values.convertedTemp;
    }
}

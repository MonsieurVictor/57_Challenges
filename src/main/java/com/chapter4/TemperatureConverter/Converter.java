package com.chapter4.TemperatureConverter;

/**
 *  is responsible for calculating temperature
 **/

import java.math.BigDecimal;

public class Converter {

    public void initialTempDigest (Values values) {

        if (values.initialTempChoice.equals("c")) {
            values.typeOfInitialTemp = "Celsius";
            values.inKelvinTemp = convertCtoK(values);

        } else if (values.initialTempChoice.equals("f")) {
            values.typeOfInitialTemp = "Fahrenheit";
            values.inKelvinTemp = convertFtoK(values);

        } else if (values.initialTempChoice.equals("k")) {
            values.typeOfInitialTemp = "Kelvin";
            values.inKelvinTemp = convertKtoK(values);

        } else {
            System.out.println("incorrect!");
        }
        finalTempDigest(values);
    }

    public void finalTempDigest (Values values) {

        if (values.finalTempChoice.equals("c")) {
            values.typeOfConvertedTemp = "Celsius";
            values.finalTemp = convertToC(values);

        } else if (values.finalTempChoice.equals("f")) {
            values.typeOfConvertedTemp = "Fahrenheit";
            values.finalTemp = convertToF(values);

        } else if (values.finalTempChoice.equals("k")) {
            values.typeOfConvertedTemp = "Kelvin";
            values.finalTemp = convertToK(values);

        } else {
            System.out.println("incorrect!");
        }
        finalAnswer(values);
    }

    public double convertCtoK(Values values){
        return values.initialTemp + 273.15;
    }

    public double convertFtoK(Values values){
        return (values.initialTemp + 459.67) / 1.8;
    }

    public double convertKtoK(Values values){
        return values.initialTemp;
    }


    public double convertToC(Values values){
        return values.inKelvinTemp - 273.15;
    }

    public double convertToF(Values values){
        return values.inKelvinTemp * 1.8 - 459.67;
    }

    public double convertToK(Values values){
        return values.inKelvinTemp;
    }

    public void finalAnswer(Values values){
        values.finalTemp = BigDecimal.valueOf(values.finalTemp)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();

        values.inKelvinTemp = BigDecimal.valueOf(values.inKelvinTemp)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();

        System.out.println("The temperature in " +
                values.typeOfInitialTemp + " is " + values.initialTemp);
        System.out.println("The temperature equivalent in Kelvin is " + values.inKelvinTemp);
        System.out.println("The temperature in " +
                values.typeOfConvertedTemp + " is " + values.finalTemp);
    }
}

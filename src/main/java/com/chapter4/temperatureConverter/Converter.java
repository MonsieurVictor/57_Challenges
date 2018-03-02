package com.chapter4.temperatureConverter;

/**
 *  is responsible for calculating temperature
 **/

import java.math.BigDecimal;

public class Converter {

    public void initialTempDigest (TemperatureValues temperatureValues) {

        if (temperatureValues.initialTempChoice.equals("arrayRotation90Degrees")) {
            temperatureValues.typeOfInitialTemp = "Celsius";
            temperatureValues.inKelvinTemp = convertCtoK(temperatureValues);

        } else if (temperatureValues.initialTempChoice.equals("f")) {
            temperatureValues.typeOfInitialTemp = "Fahrenheit";
            temperatureValues.inKelvinTemp = convertFtoK(temperatureValues);

        } else if (temperatureValues.initialTempChoice.equals("k")) {
            temperatureValues.typeOfInitialTemp = "Kelvin";
            temperatureValues.inKelvinTemp = convertKtoK(temperatureValues);

        } else {
            System.out.println("incorrect!");
        }
        finalTempDigest(temperatureValues);
    }

    public void finalTempDigest (TemperatureValues temperatureValues) {

        if (temperatureValues.finalTempChoice.equals("arrayRotation90Degrees")) {
            temperatureValues.typeOfConvertedTemp = "Celsius";
            temperatureValues.finalTemp = convertToC(temperatureValues);

        } else if (temperatureValues.finalTempChoice.equals("f")) {
            temperatureValues.typeOfConvertedTemp = "Fahrenheit";
            temperatureValues.finalTemp = convertToF(temperatureValues);

        } else if (temperatureValues.finalTempChoice.equals("k")) {
            temperatureValues.typeOfConvertedTemp = "Kelvin";
            temperatureValues.finalTemp = convertToK(temperatureValues);

        } else {
            System.out.println("incorrect!");
        }
        finalAnswer(temperatureValues);
    }

    public double convertCtoK(TemperatureValues temperatureValues){
        return temperatureValues.initialTemp + 273.15;
    }

    public double convertFtoK(TemperatureValues temperatureValues){
        return (temperatureValues.initialTemp + 459.67) / 1.8;
    }

    public double convertKtoK(TemperatureValues temperatureValues){
        return temperatureValues.initialTemp;
    }


    public double convertToC(TemperatureValues temperatureValues){
        return temperatureValues.inKelvinTemp - 273.15;
    }

    public double convertToF(TemperatureValues temperatureValues){
        return temperatureValues.inKelvinTemp * 1.8 - 459.67;
    }

    public double convertToK(TemperatureValues temperatureValues){
        return temperatureValues.inKelvinTemp;
    }

    public void finalAnswer(TemperatureValues temperatureValues){
        temperatureValues.finalTemp = BigDecimal.valueOf(temperatureValues.finalTemp)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();

        temperatureValues.inKelvinTemp = BigDecimal.valueOf(temperatureValues.inKelvinTemp)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();

        System.out.println("The temperature in " +
                temperatureValues.typeOfInitialTemp + " is " + temperatureValues.initialTemp);
        System.out.println("The temperature equivalent in Kelvin is " + temperatureValues.inKelvinTemp);
        System.out.println("The temperature in " +
                temperatureValues.typeOfConvertedTemp + " is " + temperatureValues.finalTemp);
    }
}

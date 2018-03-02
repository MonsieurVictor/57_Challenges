package com.chapter4.tempConverterInterface;

import com.chapter4.tempConverterInterface.converterImplementation.CelsiusToFahrenheit;
import com.chapter4.tempConverterInterface.converterImplementation.FahrenheitToCelsius;

public class ConverterFactory {

    public static ConverterInterface getInstance(TemperatureMeasurementModel model) {
        ConverterInterface converter = null;
        if (model.converterName.equals("CF")) {
            converter = new CelsiusToFahrenheit(model.initValue);
        } else if(model.converterName.equals("FC")) {
            converter = new FahrenheitToCelsius(model.initValue);
        }
        return converter;
    }

}

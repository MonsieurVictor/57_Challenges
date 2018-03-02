package com.chapter4.tempConverterInterface;

import com.chapter4.tempConverterInterface.converterImplementation.CelsiusToFahrenheit;
import com.chapter4.tempConverterInterface.converterImplementation.FahrenheitToCelsius;

public class ConverterFactory {

    public static enum ConverterTypes {
        CF, FC
    }

    public static ConverterInterface getInstance(ConverterModel model) {
        if (model.converterName == "CF") {
            return new CelsiusToFahrenheit(model.initValue);
        } else if(model.converterName == "FC") {
            return new FahrenheitToCelsius(model.initValue);
        }
        return null;
    }

}

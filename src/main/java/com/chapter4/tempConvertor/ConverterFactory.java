package com.chapter4.tempConvertor;

import com.chapter4.tempConvertor.converterImplementation.CelsiusToFahrenheit;
import com.chapter4.tempConvertor.converterImplementation.FahrenheitToCelsius;

public class ConverterFactory {

    public static enum ConverterTypes {
        CF, FC
    }

    public static Converter getInstance(ConverterModel model) {
        if (model.converterName == "CF") {
            return new CelsiusToFahrenheit(model.initValue);
        } else if(model.converterName == "FC") {
            return new FahrenheitToCelsius(model.initValue);
        }
        return null;
    }

}

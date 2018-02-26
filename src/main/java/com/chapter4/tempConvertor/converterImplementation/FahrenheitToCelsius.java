package com.chapter4.tempConvertor.converterImplementation;

import com.chapter4.tempConvertor.Converter;

public class FahrenheitToCelsius implements Converter {

    private double sourceTemperatureValue;
    private double targetTemperatureValue;

    public FahrenheitToCelsius(double initValue) {
        this.sourceTemperatureValue = initValue;
    }

    public void calculate() {
        this.targetTemperatureValue = (this.sourceTemperatureValue - 32 ) /1.8;
    }

    public double getTargetTemperature() {
        return this.targetTemperatureValue;
    }
}

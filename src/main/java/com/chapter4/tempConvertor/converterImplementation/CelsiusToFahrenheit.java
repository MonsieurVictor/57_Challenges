package com.chapter4.tempConvertor.converterImplementation;

import com.chapter4.tempConvertor.Converter;

public class CelsiusToFahrenheit implements Converter {

    private double sourceTemperatureValue;
    private double targetTemperatureValue;

    public CelsiusToFahrenheit(double initValue) {
        this.sourceTemperatureValue = initValue;
    }

    public void calculate() {
        this.targetTemperatureValue = this.sourceTemperatureValue * 1.8 + 32;
    }

    public double getTargetTemperature() {
        return this.targetTemperatureValue;
    }
}

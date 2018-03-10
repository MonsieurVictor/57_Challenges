package com.chapter4.tempConverterInterface.converterImplementation;

public class CelsiusToFahrenheit implements ConverterInterface {

    public double sourceTemperatureValue;
    public double targetTemperatureValue;

    public CelsiusToFahrenheit(double initValue) {
        this.sourceTemperatureValue = initValue;
    }

    public void calculate(double sourceTemperatureValue) {
        this.targetTemperatureValue = sourceTemperatureValue * 1.8 + 32;
    }

    public double getTargetTemperature() {
        return this.targetTemperatureValue;
    }
}

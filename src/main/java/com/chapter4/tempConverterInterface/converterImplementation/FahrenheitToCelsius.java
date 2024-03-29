package com.chapter4.tempConverterInterface.converterImplementation;

public class FahrenheitToCelsius implements ConverterInterface {

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

    public void calculate(double temp) {

    }
}

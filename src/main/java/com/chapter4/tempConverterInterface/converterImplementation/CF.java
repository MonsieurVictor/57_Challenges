package com.chapter4.tempConverterInterface.converterImplementation;

public class CF implements ConverterInterface {
    public double sourceTemperatureValue;
    public double targetTemperatureValue;

    public CF(double initValue) {
        this.sourceTemperatureValue = initValue;
    }

    public void calculate(double sourceTemperatureValue) {
        this.targetTemperatureValue = sourceTemperatureValue * 1.8 + 32;
        System.out.println(this.targetTemperatureValue);
    }

    public double getTargetTemperature() {
        return this.targetTemperatureValue;
    }
}



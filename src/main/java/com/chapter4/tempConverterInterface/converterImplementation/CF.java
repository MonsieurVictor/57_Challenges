package com.chapter4.tempConverterInterface.converterImplementation;

import com.chapter4.tempConverterInterface.ConverterInterface;

public class CF {
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



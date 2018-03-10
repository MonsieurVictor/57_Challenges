package com.chapter4.tempConverterInterface.converterImplementation;

import com.chapter4.tempConverterInterface.ConverterInterface;

public class FC {

    private double sourceTemperatureValue;
    private double targetTemperatureValue;

    public FC(double initValue) {
        this.sourceTemperatureValue = initValue;
    }

    public void calculate(double sourceTemperatureValue) {
        this.targetTemperatureValue = (this.sourceTemperatureValue - 32 ) /1.8;
    }

    public double getTargetTemperature() {
        return this.targetTemperatureValue;
    }
}


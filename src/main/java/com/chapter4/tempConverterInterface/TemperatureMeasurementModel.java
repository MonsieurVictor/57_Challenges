package com.chapter4.tempConverterInterface;

public class TemperatureMeasurementModel {
    public void setInitValue(String initValue) {
        this.initValue = Double.parseDouble(initValue);
    }
    public String converterName;
    public double initValue;
}

package com.chapter4.tempConverterInterface;

public class ConverterModel {
    public void setInitValue(String initValue) {
        this.initValue = Double.parseDouble(initValue);
    }
    public String converterName;
    public double initValue;
}

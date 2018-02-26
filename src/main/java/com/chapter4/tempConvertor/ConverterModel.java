package com.chapter4.tempConvertor;

public class ConverterModel {
    public void setInitValue(String initValue) {
        this.initValue = Double.parseDouble(initValue);
    }
    String converterName;
    double initValue;
}

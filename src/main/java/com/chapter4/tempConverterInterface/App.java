package com.chapter4.tempConverterInterface;

public class App {

    public static void main(String[] args) {
        ConverterModel model = new ConverterReceiver().getAppData();
        ConverterInterface temperatureConverter = ConverterFactory.getInstance(model);
        if (temperatureConverter != null) {
            temperatureConverter.calculate();
        }
        if (temperatureConverter != null) {
            System.out.println("target temperature = " + temperatureConverter.getTargetTemperature());
        }
    }
}

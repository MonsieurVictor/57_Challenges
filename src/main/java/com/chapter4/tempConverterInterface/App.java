package com.chapter4.tempConverterInterface;

public class App {

    public static void main(String[] args) {
        TemperatureMeasurementModel model = new ConverterReceiver().getAppData();
        ConverterInterface temperatureConverter = ConverterFactory.getInstance(model);
        temperatureConverter.calculate();
        System.out.println("target temperature = " + temperatureConverter.getTargetTemperature());
    }
}

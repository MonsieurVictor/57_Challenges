package com.chapter4.tempConvertor;

public class App {

    public static void main(String[] args) {
        ConverterModel model = new ConverterReceiver().getAppData();
        Converter temperatureConverter = ConverterFactory.getInstance(model);
        temperatureConverter.calculate();
        System.out.println("target temperature = " + temperatureConverter.getTargetTemperature());
    }
}

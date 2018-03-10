package com.chapter4.tempConverterInterface;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TemperatureMeasurementModel model = new ConverterReceiver().getAppData();
//        ConverterInterface converterInterface =
        ConverterFactory.getInstance(model);
//        converterInterface.calculate();
//        System.out.println("target temperature = " + converterInterface.getTargetTemperature());
    }
}

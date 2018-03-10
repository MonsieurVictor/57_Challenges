package com.chapter4.tempConverterInterface;

import com.chapter4.tempConverterInterface.converterImplementation.CelsiusToFahrenheit;
import com.chapter4.tempConverterInterface.converterImplementation.FahrenheitToCelsius;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConverterFactory {

    public static ConverterInterface getInstance(TemperatureMeasurementModel model)
            throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        ConverterInterface converter = null;
        String converterPath = "com.chapter4.tempConverterInterface.converterImplementation." + model.converterName;
        try {
            Object object = Class.forName(converterPath).newInstance();
            Method method = object.getClass().getMethod("calculate");
            method.invoke(object);
        } catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Constructor<?> constructor = clazz.getConstructor(String.class, Integer.class);
//        Object object =  constructor.newInstance("stringparam", 42);
        System.out.println("Methods");
//        Method method = object.getClass().getMethod("calculate");
//        method.invoke(object, model.initValue);




        if (model.converterName.equals("CF")) {
            converter = new CelsiusToFahrenheit(model.initValue);
        } else if(model.converterName.equals("FC")) {
            converter = new FahrenheitToCelsius(model.initValue);
        }
        return converter;
    }

}

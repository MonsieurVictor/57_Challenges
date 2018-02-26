package com.chapter4.tempConvertor;

import com.utils.ConsoleInputsReceiver;

import java.util.Arrays;
import java.util.List;

public class ConverterReceiver {

    private List<String> converters = Arrays.asList("CF", "CK", "FC", "FK", "KC", "KF");
    private  String INIT_MESSAGE = "print converter name (" + converters.toString() + "):";
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private ConverterModel model = new ConverterModel();

    public ConverterModel getAppData() {
        getConverterName();
        getInitTemperature();
        return model;
    }

    private void getConverterName() {
        while (true) {
            System.out.println(INIT_MESSAGE);
            String converter = console.getLastInput();
            if (converters.indexOf(converter) != -1) {
                model.converterName = converter;
                break;
            } else {
                System.out.println("please choose one of the " + converters.toString() + " options");
            }
        }
    }

    private void getInitTemperature() {
        System.out.println("enter the initial temperature");
        model.setInitValue(console.getLastInput());
    }
}

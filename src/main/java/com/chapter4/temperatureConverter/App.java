package com.chapter4.temperatureConverter;


/**
 *  a simple program which converts temperature
 **/


public class App {

    private ValuesReceiver receiver = new ValuesReceiver();

    private void start(){
        receiver.promptValues();
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}

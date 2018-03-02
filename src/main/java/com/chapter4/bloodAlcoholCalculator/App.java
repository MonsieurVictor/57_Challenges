package com.chapter4.bloodAlcoholCalculator;


import java.awt.*;
import java.io.IOException;

/**
 *  a simple program which checks blood alcohol content.
 **/
public class App {

    private AlcoholicBar alcoholicBar = new AlcoholicBar();
    private ParametersReceiver receiver = new ParametersReceiver();
    private AlcoTester alcoTester = new AlcoTester();

    private void start() throws IOException, InterruptedException, AWTException {
        HumanParameters human = alcoholicBar.enterAlcoholicBar();
        human = receiver.promptHumanParameters(human);
        alcoTester.testAlcoholInBlood(human);
        System.out.println(human.alcoDigesting.bloodAlcoholContent);
    }

    public static void main (String[] args) throws IOException, AWTException, InterruptedException {
        new ProcessBuilder("cmd", "/arrayRotation90Degrees", "cls").inheritIO().start().waitFor();

        App app = new App();
        app.start();
    }
}
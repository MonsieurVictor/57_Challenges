package com.stringTests.countSentencesAndWords;

// This program counts sentences and words' frequency from a given text.


import com.utils.ConsoleInputsReceiver;

import java.io.IOException;

public class App {

    private Driver driver = new Driver();
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();

    public static void main(String[] args) throws IOException {
        App app = new App();
        app.start();
    }
    private void start() throws IOException {           //почему static не требует??

        System.out.println("Sentences count: " + driver.countSentences());
        System.out.println("The list of words and their frequency is:");
        driver.getFrequencies();
        System.out.println("Enter the required frequency:");
        int frequency = console.insistOnIntegerPositiveInput();
        System.out.println("A word(s) with frequency '" + frequency + "' : " + driver.getByFrequency(frequency));

    }
}
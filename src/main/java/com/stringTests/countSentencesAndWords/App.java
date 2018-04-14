package com.stringTests.countSentencesAndWords;

// This program counts sentences and words' frequency from a given text.


import com.utils.ConsoleInputsReceiver;

public class App {

    String text = "";

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
    private void start() {           //почему static не требует??

        Storage storage = new Storage(text);
        Driver driver = new Driver(storage.getText());
        ConsoleInputsReceiver console = new ConsoleInputsReceiver();
        System.out.println("Sentences count:" + driver.countSentences());
        System.out.println("The list of words and their frequency is:\n" + driver.getFrequencies() );
        System.out.println("Enter the required frequency:");
        int frequency = console.insistOnIntegerPositiveInput();
        System.out.println("A word(s) with frequency: " + getByFrequency(frequency));


    }
}
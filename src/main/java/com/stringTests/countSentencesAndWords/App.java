package com.stringTests.countSentencesAndWords;

// This program counts sentences and words' frequency from a given text.


import com.utils.ConsoleInputsReceiver;

import java.io.IOException;

public class App {

    // make the app to be console app
    // info:
    //   statistics:
    //      - sentences count
    //      - total words count
    //      - unique words count
    //   frequency:
    //      - words frequency in th following format:
    //          - hobbit: <total count>, <in how many sentences encountered>
    // examples of launch:
    //      - <app>.java <path>                                  | default launch, all info (stat and frequency) is outputted
    //      - <app>.java <path> -s                               | only statistic outputted
    //      - <app>.java <path> -f                               | only frequency outputted
    //      - <app>.java <path> -w:<ignore_words_list.txt>       | ignores words from the appropriated file



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
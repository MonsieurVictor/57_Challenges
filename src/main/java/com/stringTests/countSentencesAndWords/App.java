package com.stringTests.countSentencesAndWords;

// This program counts sentences and words' frequency from a given text.


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

    public static void main(String[] args) throws IOException {
        ITextReader reader = new TextReader();
        ITextAnalyzer analyzer = new TextAnalyzer();
        IAppOptions options = new AppOptions();
        IResultViewer viewer = new ResultViewer();
        FactoryApp factory = new FactoryApp(reader, analyzer, options, viewer);
        factory.execute(args);
    }

    private void start() throws IOException {           //почему static не требует??

        System.out.println("Sentences count: " );
        System.out.println("The list of words and their frequency is:");
        System.out.println("Enter the required frequency:");
        System.out.println("A word(s) with frequency '" );

    }

}
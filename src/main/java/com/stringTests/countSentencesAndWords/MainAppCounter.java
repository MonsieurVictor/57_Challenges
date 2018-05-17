package com.stringTests.countSentencesAndWords;

import java.io.IOException;
import java.lang.Exception;
import java.util.List;

/**
 * This program counts sentences and words frequency from a given text.
 * It is a CLI application with the following specification:
 *
 *      - <app>.java <path>                                  | default launch, all info (stat and frequency) is outputted
 *      - <app>.java <path> -s                               | only statistic outputted
 *      - <app>.java <path> -f                               | only frequency outputted
 *      - <app>.java <path> -w:<ignore_words_list.txt>       | ignores words from the appropriated file
 * Where:
 *  info:
 *   statistics:
 *      - sentences count
 *      - total words count
 *      - unique words count
 *   frequency:
 *      - words frequency in the following format:
 *          - hobbit: <total count>, <in how many sentences encountered>
 * 
 */

public class MainAppCounter { // -a или ' ' , в чем разница?

    private ITextReader reader;
    private ITextAnalyzer analyzer;
    private IAppOptions options;
    private IResultViewer viewer;
    private IErrorLogger logger;
    
    public MainAppCounter(    // какой смысл в этом конструкторе?
            ITextReader reader,
            ITextAnalyzer analyzer,
            IAppOptions options,
            IResultViewer viewer,
            IErrorLogger logger) {

        this.reader = reader;
        this.analyzer = analyzer;
        this.options = options;
        this.viewer = viewer;
        this.logger = logger;

    }



    public void execute(String[] args) {
        try {
            options.parseOptions(args);

            if (options.isIgnoreListEnabled()) {                                                  //принципы ООП
                analyzer.setIgnoreList(reader.getTextBuffer(options.getIgnoreListFilePath()));    //одобряют такой код в MainApp ?
            }

            analyzer.setBuffer(reader.getTextBuffer(options.getFilePath()));
            analyzer.doAnalyze(options);
            viewer.report(analyzer);

        } catch (IOException e) {
            logger.errorOpen(e);
            // nice report on can't open the file
        } catch (Exception e) {
            logger.errorReadFlags(e);
            // nice report here
        }
    }
    

    public static void main(String[] args) throws Exception {
        ITextReader reader = new TextReader();
        IErrorLogger logger = new ErrorLogger();
        ITextAnalyzer analyzer = new TextAnalyzer();
        IAppOptions options = new AppOptions();
        IResultViewer viewer = new ConsoleResultViewer();
        MainAppCounter app = new MainAppCounter(reader, analyzer, options, viewer, logger); //почему нельзя просто создать объект с пустыми аргументами?
        app.execute(args);
    }

}
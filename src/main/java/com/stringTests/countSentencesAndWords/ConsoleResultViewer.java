package com.stringTests.countSentencesAndWords;

/**
 * reports the results to a console
 */

public class ConsoleResultViewer implements IResultViewer {

    private IAppOptions options;
    private ITextAnalyzer analyzer;

    public void setOptions(IAppOptions options) {
        this.options = options;
    }

    public void report(ITextAnalyzer analyzer) {
        this.analyzer = analyzer;
        setOptions(this.analyzer.getOptions());
        if (options.isIgnoreListEnabled()){
            System.out.println("Ignored words :" + analyzer.getIgnoreList());
        }

        if (options.isStatsEnabled()) {
            System.out.println("Sentences count: " + analyzer.getSentencesCount());
            System.out.println("Total words count : " + analyzer.getTotalWordsCount());
            System.out.println("Unique words count: " + analyzer.getUniqueWordsCount());
        }

        if (options.isFreqEnabled()) {
            System.out.println("Words frequencies and in how many sentences encountered: ");
            for (int i = 0;i < this.analyzer.getTrioSize(); i++)
            System.out.println (this.analyzer.getTrioWord(i) + " : "
                    + this.analyzer.getTrioFreq(i) + " , " + this.analyzer.getTrioAppear(i));
        }
    }
}

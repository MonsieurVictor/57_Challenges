package com.stringTests.countSentencesAndWords;

public interface IResultViewer {

    /**
     * implements the logic of reporting the results
     */

    void setOptions();
    void report(ITextAnalyzer analyzer);

}

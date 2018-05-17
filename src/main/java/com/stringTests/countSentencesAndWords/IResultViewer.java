package com.stringTests.countSentencesAndWords;

public interface IResultViewer {

    /**
     * implements the logic of reporting the results
     */

    void setOptions();
    //void setOptions(IAppOptions options);
    void report(ITextAnalyzer analyzer);

}

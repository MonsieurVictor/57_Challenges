package com.stringTests.countSentencesAndWords;

import java.util.List;

/**
 * implements the logic of analyzing text
 */

public interface ITextAnalyzer {

    void setBuffer(StringBuilder buffer);

    void setIgnoreList(StringBuilder ignoreBuffer);

    List<String> getIgnoreList();

    void doAnalyze(IAppOptions options);

    IAppOptions getOptions();

    int getTotalWordsCount();

    int getSentencesCount();

    int getUniqueWordsCount();

    int getTrioSize();

    String getTrioWord(int i);

    int getTrioFreq(int i);

    int getTrioAppear(int i);

    List<String> getTotalWordsWithoutIgnored();
}

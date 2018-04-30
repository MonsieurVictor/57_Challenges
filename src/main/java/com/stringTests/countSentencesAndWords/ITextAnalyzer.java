package com.stringTests.countSentencesAndWords;

import java.util.List;

public interface ITextAnalyzer {



    void setBuffer(StringBuffer buffer);

    void setIgnoreList(StringBuffer ignoreBuffer);

    List<String> getIgnoreList();

    void doAnalyze(IAppOptions options);

    List<String> getTotalWords();

    IAppOptions getOptions();

    int getTotalWordsCount();

    int getSentencesCount();

    int getUniqueWordsCount();

    int getTrioSize();

    String getTrioWord(int i);

    int getTrioFreq(int i);

    int getTrioAppear(int i);

    public List<String> getTotalWordsWithoutIgnored();
}

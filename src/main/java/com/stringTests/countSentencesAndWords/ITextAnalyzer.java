package com.stringTests.countSentencesAndWords;

import java.util.List;

public interface ITextAnalyzer {

    void setBuffer(StringBuffer buffer);

    void setIgnoreList(List<String> list);

    void doAnalyze(IAppOptions options);

    /*

    List<String> getSentencesWith(String word);

    int getSentencesCount();

    int getTotalWordsCount();

    int getUniqueWordsCount();

    int getSentencesCountWith(String word);

    List<String> getWordsWithFrequency(int start);

    List<String> getWordsWithFrequency(int start, int end);
    */
}

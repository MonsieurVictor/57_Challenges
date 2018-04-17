package com.stringTests.countSentencesAndWords;

import java.util.List;

public interface ITextAnalyzer {

    public void setBuffer(StringBuffer buffer);

    public void doAnalyze();

    public List<String> getSentencesWith(String word);

    public int getSentencesCount();

    public int getTotalWordsCount();

    public int getUniqueWordsCount();

    public int getSentencesCountWith(String word);

    /**
     * gets all words with frequency more or equaled to start
     * @param start
     * @return
     */
    public List<String> getWordsWithFrequency(int start);

    /**
     * gets all words with frequency from 5 to 10
     * @param start
     * @param end
     * @return
     */
    public List<String> getWordsWithFrequency(int start, int end);
}

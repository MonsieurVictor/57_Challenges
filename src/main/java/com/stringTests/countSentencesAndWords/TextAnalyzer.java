package com.stringTests.countSentencesAndWords;

import java.util.List;

public class TextAnalyzer {

    private List<String> sentences;

    public TextAnalyzer getText(StringBuffer text) {
        // count sentences
        // count words
        // etc
        // etc
        // etc
    }
}

    public List<String> getSentencesWith(String word) {
        return null;
    }

    public int getSentencesCount() {
        return 9;
    }

    public int getTotalWordsCount() {
        return 8;
    }

    public int getUniqueWordsCount() {
        return 10;
    }

    public int getSentencesCountWith(String word) {
        return this.getSentencesWith(word).size();
    }

    /**
     * get all words with frequency more or equaled to start
     * @param start
     * @return
     */
    public List<String> getWordsWithFrequency(int start) {
        return null;
    }

    /**
     * makes possible to get all words with frequency from 5 to 10
     * @param start
     * @param end
     * @return
     */
    public List<String> getWordsWithFrequency(int start, int end) {
        return null;
    }

}

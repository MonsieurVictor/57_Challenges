package com.stringTests.countSentencesAndWords;

import java.util.List;

public class TextAnalyzer implements ITextAnalyzer {

    private List<String> sentences;

    private List<String> ignoreList;

    public void setIgnoreList(List<String> list) {
        this.ignoreList = list;
    }

    public TextAnalyzer getAllSentences(StringBuffer buffer) {
        int endOfSentense;
        int beginOfSentense;

        for(int i = 0 ; i < buffer.length(); i++){

            if ((buffer.charAt(i)).equals("[!?.:]+")){
                endOfSentense = i;
            }
            sentences.add(buffer.substring(beginOfSentense, endOfSentense))
            beginOfSentense = i+1;
        }
        // count sentences
        // count words
        // etc
        // etc
        // etc
        return null;
    }

    public void setBuffer(StringBuffer buffer){

    }


    //public void doAnalyze(ITextReader reader, ITextAnalyzer analyzer, IAppOptions options, IResultViewer viewer) throws IOException {
       //getAllSentences(reader.getTextBuffer());


    //}

    public void doAnalyze(IAppOptions options) {

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

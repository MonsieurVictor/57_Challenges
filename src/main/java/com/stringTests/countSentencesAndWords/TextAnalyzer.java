package com.stringTests.countSentencesAndWords;

import java.util.ArrayList;
import java.util.List;

public class TextAnalyzer implements ITextAnalyzer {

    private StringBuffer buffer;

    private List<String> sentences = new ArrayList<>();

    private List<String> ignoreList;

    public void setIgnoreList(List<String> list) {
        this.ignoreList = list;
    }

    public TextAnalyzer getAllSentences() {
        int endOfSentense;
        int beginOfSentense = 0;

        for(int i = 0 ; i < this.buffer.toString().length(); i++){
            Character currentChar = new Character(this.buffer.charAt(i));


            if (isPunctuation(currentChar)){
                StringBuffer tempBuffer = new StringBuffer(buffer.toString());
                endOfSentense = i;
                sentences.add(tempBuffer.substring(beginOfSentense, endOfSentense));
                beginOfSentense = i+1;
            }
        }
        for ( int i = 0; i < sentences.size(); i++ ){
            System.out.println(sentences.get(i).toString());
        }
        // count sentences
        // count words
        // etc
        // etc
        // etc
        return null;
    }

    public void setBuffer(StringBuffer buffer){
        this.buffer = buffer;


    }


    //public void doAnalyze(ITextReader reader, ITextAnalyzer analyzer, IAppOptions options, IResultViewer viewer) throws IOException {
       //getAllSentences(reader.getTextBuffer());


    //}

    public void doAnalyze(IAppOptions options) {
        getAllSentences();

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

    private boolean isPunctuation(Character currentChar){
        if (currentChar.equals('.')||currentChar.equals('!')
                ||currentChar.equals('?')){
            return true;
        }
        return false;
    }
}

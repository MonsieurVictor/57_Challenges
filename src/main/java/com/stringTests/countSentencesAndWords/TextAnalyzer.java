package com.stringTests.countSentencesAndWords;

import java.util.ArrayList;
import java.util.List;

public class TextAnalyzer implements ITextAnalyzer {

    private StringBuffer buffer;

    private List<String> sentences = new ArrayList<>();

    private List<String> ignoreList;

    private int endOfSentence;
    private int beginOfSentence;
    private int sentenceCount;
    private int endByQuotesCount;
    private int continuedAfterQuotesCount;

    public void setIgnoreList(List<String> list) {
        this.ignoreList = list;
    }

    public TextAnalyzer getAllSentences() {

        for(int i = 0 ; i < this.buffer.length(); i++){
            Character currentChar = this.buffer.charAt(i);
            endOfSentence = i+1;
            if (isPunctuation(currentChar) && isNotMr(i) && isEndedAfterQuotes(i)) {

                if(beginOfSentence < buffer.length() && this.buffer.charAt(beginOfSentence)=='‘'){

                    endOfSentence++;

                    sentences.add(buffer.substring(beginOfSentence, endOfSentence));
                    beginOfSentence = i+2;
                    endByQuotesCount++;
                }
                else{
                    endOfSentence = i+1;
                    sentences.add(buffer.substring(beginOfSentence, endOfSentence));
                    beginOfSentence = i+1;
                }

                while(beginOfSentence < buffer.length() && this.buffer.charAt(beginOfSentence)==' '){
                    beginOfSentence++;
                }

                sentenceCount++;
            }
        }
        for ( int i = 0; i < sentences.size(); i++ ){
            System.out.println(sentences.get(i));

        }
        System.out.println("sentenceCount " + sentenceCount);
        System.out.println("endByQuotesCount " + endByQuotesCount);
        System.out.println("continuedAfterQuotesCount " + continuedAfterQuotesCount);
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
        if (currentChar.toString().matches("[!?.]+")){
            return true;
        }
        return false;
    }

    private boolean isNotMr(int i) {
        Character firstChar = Character.toLowerCase(this.buffer.charAt(i-2));
        Character secondChar = Character.toLowerCase(this.buffer.charAt(i-1));

        if (i > 1 && firstChar.equals('m') && secondChar.equals('r')){
            return false;
        }
        return true;
    }

    private boolean isEndedAfterQuotes(int i){
        if (i<(this.buffer.length()-10000)) {
            Character firstChar = new Character(this.buffer.charAt(i+1));
//            System.out.println(firstChar);
            Character secondChar = new Character(this.buffer.charAt(i+2));
//            System.out.println(secondChar);
            Character thirdChar = new Character(this.buffer.charAt(i+3));
//            System.out.println(thirdChar);
            if (beginOfSentence < buffer.length() && firstChar.toString().matches("['’‘]+")) {
                continuedAfterQuotesCount++;
                if (secondChar == ' ' && thirdChar.toString().matches("[a-z]+")) {
                    continuedAfterQuotesCount++;
                    return false;
                }
            }

        }
        return true;

    }
}

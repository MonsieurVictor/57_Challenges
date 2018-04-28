package com.stringTests.countSentencesAndWords;

import java.util.*;
import java.util.stream.Stream;

public class TextAnalyzer implements ITextAnalyzer {

    private class WordCountPair {
        String word;
        int count;

        WordCountPair(String key, Integer value) {
            this.word = key;
            this.count = value;
        }
    }

    private class KeyRatingPair {
        char word;
        int rating;

        KeyRatingPair(Character key, Integer value) {
            this.word = key;
            this.rating = value;
        }
    }

    private StringBuffer buffer;

    private List<String> totalWords = new ArrayList<String>();

    private List<String> sentences = new ArrayList<String>();

    private List<String> sentencesWithWord = new ArrayList<String>();

    private List<String> ignoreList = new ArrayList<String>();

    private List<String> uniqueWordsList = new ArrayList<String>();

    private List<WordCountPair> wordFreqPairs = new ArrayList<WordCountPair> ();

    private int endOfSentence;
    private int beginOfSentence;
    private int sentenceCount;
    private int endByQuotesCount;
    private int continuedAfterQuotesCount;

    public void setIgnoreList(List<String> list) {

        this.ignoreList = list;
    }

    public TextAnalyzer getAllSentencesToList() {

        for(int i = 0 ; i < this.buffer.length(); i++){
            Character currentChar = this.buffer.charAt(i);
            endOfSentence = i+1;
            if (isPunctuation(currentChar) && isNotMr(i) && isEndedAfterQuotes(i)) {
                parseStartWithQuotes(i);
                removeTrashSpaces();
                removeTrashQuotes();
                sentenceCount++;
            }
        }
//        for ( int i = 0; i < sentences.size(); i++ ){
//            System.out.println(sentences.get(i));
//
//        }
//        System.out.println("sentenceCount " + sentenceCount);
//        System.out.println("endByQuotesCount " + endByQuotesCount);
//        System.out.println("continuedAfterQuotesCount " + continuedAfterQuotesCount);

        return null;
    }

    public void setBuffer(StringBuffer buffer){
        this.buffer = buffer;


    }

    public void doAnalyze(IAppOptions options) {
        getAllSentencesToList();
        getSentencesCount();
        if(ignoreList.isEmpty()) {
            getTotalWords().size();
        } else {
            getTotalWords();
            getTotalWordsWithoutIgnored().size();
        }
        getFrequencies();
        getUniqueWordsCount();
        getTheWordCount("hobbit");
        getSentencesWithWordCount("hobbit");
        getWordsWithSpecifiedFrequency(5);
        getWordsWithSpecifiedFrequency(5, 10);
    }


    public List<String> getSentencesWith(String word) {
        for (int i = 0; i < sentences.size(); i++) {
            String currentSentence = sentences.get(i).toLowerCase();
            if (currentSentence.contains(word)) {
                sentencesWithWord.add(currentSentence);
            }
        }
        return sentencesWithWord;
    }


    public int getSentencesWithWordCount(String word) {
        List<String> sentencesWithWord =  getSentencesWith(word);

        for (int i = 0; i < sentencesWithWord.size(); i++) {
            System.out.println(sentencesWithWord.get(i));
        }
        System.out.println("Sentences with word " + word + " " + sentencesWithWord.size());
        return this.sentencesWithWord.size();
    }

    public int getTheWordCount(String word) {
        int wordFreq = 0;
        for (int i = 0; i < wordFreqPairs.size(); i++) {
            if (wordFreqPairs.get(i).word.matches(word)){
                wordFreq = wordFreqPairs.get(i).count;
                break;
            }
        }
        System.out.println("Hobbit appears " + wordFreq);
        return wordFreq;


    };

    public int getSentencesCount() {
        return sentences.size();
    }

    public List<String> getTotalWords() {

            Stream.of(buffer.toString().split("[^A-Za-zА-Яа-я]+"))
                    .map(String::toLowerCase)
                    .forEach(totalWords::add);

//        System.out.println("Total words count = " + totalWords.size());

        return totalWords;
    }

    public List<String> getTotalWordsWithoutIgnored(){
        int i = 0;
        while (i < totalWords.size()){
            if (totalWords.get(i).matches(ignoreList.toString())){
                totalWords.remove(i);
            } else {
                i++;
            }
        }
        return totalWords;
    }

    public int getUniqueWordsCount() {

        uniqueWordsList = getWordsWithSpecifiedFrequency(1, 1);
//        System.out.println("uniqueWordsList.size() " + uniqueWordsList.size());
        return uniqueWordsList.size();
    }



    /**
     * get all words with frequency more or equaled to start
     * @param start
     * @return
     */
    public List<String> getWordsWithSpecifiedFrequency(int start) {
        List <String> wordsWithSpecifiedFrequency = new ArrayList<>();

        for (int i = 0; i< wordFreqPairs.size(); i++){
            if (wordFreqPairs.get(i).count >= start){
                wordsWithSpecifiedFrequency.add(wordFreqPairs.get(i).word);
//                System.out.println(wordFreqPairs.get(i).word);
            }

        }
//        System.out.println("getWordsWithSpecifiedFrequency(int start) " + wordsWithSpecifiedFrequency.size());
        return wordsWithSpecifiedFrequency;

    }

    /**
     * makes possible to get all words with frequency from 5 to 10
     * @param start
     * @param end
     * @return
     */
    public List<String> getWordsWithSpecifiedFrequency(int start, int end) {

        List <String> wordsWithSpecifiedFrequency = new ArrayList<>();

        for (int i = 0; i< wordFreqPairs.size(); i++){
            if (wordFreqPairs.get(i).count >= start && wordFreqPairs.get(i).count <= end){
                wordsWithSpecifiedFrequency.add(wordFreqPairs.get(i).word);
//                System.out.println(wordFreqPairs.get(i).word);
            }
        }
//        System.out.println("getWordsWithSpecifiedFrequency(int start, int end) " + wordsWithSpecifiedFrequency.size());
        return wordsWithSpecifiedFrequency;
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
        if (i<(this.buffer.length()-3)) {
            Character firstChar = new Character(this.buffer.charAt(i+2));
            Character secondChar = new Character(this.buffer.charAt(i+3));

                if (firstChar == ' ' && secondChar.toString().matches("[a-z]")) {
                    continuedAfterQuotesCount++;
                    return false;
                }
            }
        return true;
    }

    private void removeTrashSpaces(){
        while(beginOfSentence < buffer.length() && this.buffer.charAt(beginOfSentence)==' '){
            beginOfSentence++;
        }
    }

    private void removeTrashQuotes(){
        if(beginOfSentence < buffer.length() && buffer.charAt(beginOfSentence) == '’'){
            beginOfSentence++;
            endOfSentence++;
        }
    }

    private void parseStartWithQuotes(int i){
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
    }

    public List<WordCountPair> getFrequencies() {

        Map<String, Integer> frequencyRegisterMap = new HashMap<String, Integer>();

        for (int i = 0; i < totalWords.size(); i++) {
            String currentWord = totalWords.get(i);
            if (currentWord.equals("")) {
            }                        //иначе находит 281 совпадение ""
            else if (frequencyRegisterMap.containsKey(currentWord)) {
                Integer value = frequencyRegisterMap.get(currentWord);
                frequencyRegisterMap.replace(currentWord, value = value + 1);
            } else {
                frequencyRegisterMap.put(currentWord, 1);
            }
        }

        for (String key : frequencyRegisterMap.keySet()) {
            wordFreqPairs.add(new WordCountPair(key, frequencyRegisterMap.get(key)));
        }

        Collections.sort(wordFreqPairs, new Comparator<WordCountPair>() {
            @Override
            public int compare(WordCountPair o1, WordCountPair o2) {
                return o2.count - o1.count;
            }
        });

//        for (int i = 0; i < wordFreqPairs.size(); i++) {
//            System.out.println(wordFreqPairs.get(i).word + " : " + wordFreqPairs.get(i).count);
//        }
        return wordFreqPairs;

    }

}

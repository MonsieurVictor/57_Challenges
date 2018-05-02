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

    public class WordFreqAppearTrio {
        String word;
        int frequency;
        int appearance;

        WordFreqAppearTrio(String key, Integer frequency, Integer appearance) {
            this.frequency = frequency;
            this.word = key;
            this.appearance = appearance;

        }
    }

    private StringBuffer buffer;

    private List<String> totalWords = new ArrayList<String>();

    private List<String> sentences = new ArrayList<String>();

    private List<String> ignoreList = new ArrayList<String>();

    private List<String> uniqueWordsList = new ArrayList<String>();

    private List<WordCountPair> wordFreqPairs = new ArrayList<WordCountPair>();

    private List<WordFreqAppearTrio> wordFreqAppearTrios = new ArrayList<WordFreqAppearTrio>();

    private int endOfSentence;
    private int beginOfSentence;

    public IAppOptions options;

    public void doAnalyze(IAppOptions options) {
        this.options = options;
        getAllSentencesToList(buffer);

        if (options.isIgnoreListEnabled()) {
            parseTotalWords(buffer);
            getTotalWordsWithoutIgnored().size();
        } else {
            parseTotalWords(buffer);

        }
        if (options.isStatsEnabled()) {
            getUniqueWordsCount();
            getSentencesCount();
        }

        if (options.isFreqEnabled()) {
            getFrequencies();
            analyzeWordAppearance();
            getWordsSpecifiedFrequency(5);
            getWordsSpecifiedFrequency(5, 10);
        }
    }

    public List<String> getAllSentencesToList(StringBuffer buffer) {
        this.buffer = buffer;

        for (int i = 0; i < this.buffer.length(); i++) {
            Character currentChar = this.buffer.charAt(i);
            endOfSentence = i + 1;
            if (isPunctuation(currentChar) && isNotMr(i) && isEndedAfterQuotes(i)) {
                parseStartWithQuotes(i);
                removeTrashSpaces();
                removeTrashQuotes();
            }
        }
        return sentences;
    }

    public void setBuffer(StringBuffer buffer) {
        this.buffer = buffer;
    }

    public int getSentencesCount() {
        return sentences.size();
    }

    public void parseTotalWords(StringBuffer buffer) {

        Stream.of(buffer
                .toString()
                .split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .forEach(totalWords::add);
    }

    public void setIgnoreList(StringBuffer ignoreBuffer) {
        this.ignoreList = parseIgnoreWords(ignoreBuffer);
    }

    public List<String> getIgnoreList(){
        return ignoreList;
    }

    public List<String> parseIgnoreWords(StringBuffer ignoreBuffer){
        Stream.of(ignoreBuffer
                .toString()
                .split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .forEach(ignoreList::add);
        return ignoreList;
    }

    public List<String> getTotalWordsWithoutIgnored() {
        int i = 0;
        while (i < totalWords.size()) {
            for (int j = 0; j < ignoreList.size(); j++){
                if (totalWords.get(i).matches(ignoreList.get(j))){
                    totalWords.remove(i);
                }
            }
            i++;
        }

        return totalWords;
    }

    public int getTotalWordsCount() {
        return totalWords.size();
    }

    public List <String> getTotalWords(){
        return totalWords;
    }



    public int getUniqueWordsCount() {

        uniqueWordsList = getWordsSpecifiedFrequency(1, 1);
//        System.out.println("uniqueWordsList.size() " + uniqueWordsList.size());
        return uniqueWordsList.size();
    }


    /**
     * get all words with frequency more or equaled to start
     *
     * @param start
     * @return
     */
    public List<String> getWordsSpecifiedFrequency(int start) {
        List<String> wordsSpecifiedFreqFrom = new ArrayList<>();

        for (int i = 0; i < wordFreqPairs.size(); i++) {
            if (wordFreqPairs.get(i).count >= start) {
                wordsSpecifiedFreqFrom.add(wordFreqPairs.get(i).word);
            }

        }
//        System.out.println("getWordsSpecifiedFrequency(int start) " + wordsSpecifiedFreqFrom.size());
        return wordsSpecifiedFreqFrom;

    }

    /**
     * makes possible to get all words with frequency from 5 to 10
     *
     * @param start
     * @param end
     * @return
     */
    public List<String> getWordsSpecifiedFrequency(int start, int end) {

        List<String> wordsSpecifiedFreqFromTo = new ArrayList<>();

        for (int i = 0; i < wordFreqPairs.size(); i++) {
            if (wordFreqPairs.get(i).count >= start && wordFreqPairs.get(i).count <= end) {
                wordsSpecifiedFreqFromTo.add(wordFreqPairs.get(i).word);
            }
        }
//        System.out.println("getWordsSpecifiedFrequency(int start, int end) " + wordsSpecifiedFreqFromTo.size());
        return wordsSpecifiedFreqFromTo;
    }

    private boolean isPunctuation(Character currentChar) {
        if (currentChar.toString().matches("[!?.]+")) {
            return true;
        }
        return false;
    }

    private boolean isNotMr(int i) {
        Character firstChar = Character.toLowerCase(this.buffer.charAt(i - 2));
        Character secondChar = Character.toLowerCase(this.buffer.charAt(i - 1));

        if (i > 1 && firstChar.equals('m') && secondChar.equals('r')) {
            return false;
        }
        return true;
    }

    private boolean isEndedAfterQuotes(int i) {
        if (i < (this.buffer.length() - 3)) {
            Character firstChar = new Character(this.buffer.charAt(i + 2));
            Character secondChar = new Character(this.buffer.charAt(i + 3));

            if (firstChar == ' ' && secondChar.toString().matches("[a-z]")) {
                return false;
            }
        }
        return true;
    }

    private void removeTrashSpaces() {
        while (beginOfSentence < buffer.length() && this.buffer.charAt(beginOfSentence) == ' ') {
            beginOfSentence++;
        }
    }

    private void removeTrashQuotes() {
        if (beginOfSentence < buffer.length() && buffer.charAt(beginOfSentence) == '’') {
            beginOfSentence++;
            endOfSentence++;
        }
    }

    private void parseStartWithQuotes(int i) {
        if (beginOfSentence < buffer.length() && this.buffer.charAt(beginOfSentence) == '‘') {

            endOfSentence++;
            sentences.add(buffer.substring(beginOfSentence, endOfSentence));
            beginOfSentence = i + 2;
        } else {
            endOfSentence = i + 1;
            sentences.add(buffer.substring(beginOfSentence, endOfSentence));
            beginOfSentence = i + 1;
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

    public void analyzeWordAppearance() {

        for (int i = 0; i < wordFreqPairs.size(); i++) {
            String word = wordFreqPairs.get(i).word;
            int frequency = wordFreqPairs.get(i).count;
            int appearance = countSentencesWithWord(wordFreqPairs.get(i).word);
            wordFreqAppearTrios.add(new WordFreqAppearTrio(word, frequency, appearance));
        }

//        for (int i = 0; i < wordFreqAppearTrios.size(); i++) {
////            System.out.println(wordFreqAppearList.get(i).word + " : " + wordFreqAppearList.get(i).frequency + " , " + wordFreqAppearList.get(i).appearance);
//        }
    }

    public int countSentencesWithWord(String word) {
        int sentenceWithWordCount = 0;

        for (int i = 0; i < sentences.size(); i++) {

            List<String> wordsInTheSentence = new ArrayList<>();

            Stream.of(sentences
                    .get(i)
                    .split("[^A-Za-zА-Яа-я]+"))
                    .map(String::toLowerCase)
                    .forEach(wordsInTheSentence::add);

            for (int j = 0; j < wordsInTheSentence.size(); j++) {

                if (wordsInTheSentence.get(j).matches(word)) {
                    sentenceWithWordCount++;
                    break;
                }
            }
        }
//        System.out.println(word + " : " + sentenceWithWordCount);
        return sentenceWithWordCount;

    }

    public String getTrioWord(int i) {
        return wordFreqAppearTrios.get(i).word;
    }

    public int getTrioFreq(int i) {
            return wordFreqAppearTrios.get(i).frequency;
    }
    public int getTrioAppear(int i){
        return wordFreqAppearTrios.get(i).appearance;
    }

    public int getTrioSize() {
        return wordFreqAppearTrios.size();
    }

    public IAppOptions getOptions(){
        return options;
    }
}



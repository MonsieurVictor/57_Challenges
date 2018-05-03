package com.stringTests.countSentencesAndWords;

import java.util.*;
import java.util.stream.Stream;

/**
 * analyzes words (quantity, frequency, etc)
 */

public class TextAnalyzer implements ITextAnalyzer {

    private class WordFreqPair {

        String word;
        int count;

        WordFreqPair(String key, Integer value) {
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

    private StringBuilder buffer;

    private List<String> totalWords = new ArrayList<String>();

    private List<String> sentences = new ArrayList<String>();

    private List<String> ignoreList = new ArrayList<String>();

    private List<String> uniqueWordsList = new ArrayList<String>();

    private List<WordFreqPair> wordFreqPairs = new ArrayList<WordFreqPair>();

    private List<WordFreqAppearTrio> wordFreqAppearTrios = new ArrayList<WordFreqAppearTrio>();

    private int endOfSentence;
    private int beginOfSentence;

    private IAppOptions options;

    public void doAnalyze(IAppOptions options) {

        this.options = options;
        getAllSentencesToList(buffer);

        if (options.isIgnoreListEnabled()) { //for ignoreList
            parseTotalWords(buffer);
            getTotalWordsWithoutIgnored().size();
        } else {
            parseTotalWords(buffer);

        }

        getFrequencies();

        if (options.isStatsEnabled()) { // for Statistics
            getUniqueWordsCount();
            getSentencesCount();
        }

        if (options.isFreqEnabled()) { // for analyzing frequency
            analyzeWordAppearance();
            getWordsSpecifiedFrequency(5);
            getWordsSpecifiedFrequency(5, 10);
        }
    }

    private List<String> getAllSentencesToList(StringBuilder buffer) {
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

    public void setBuffer(StringBuilder buffer) {
        this.buffer = buffer;
    }

    public int getSentencesCount() {
        return sentences.size();
    }

    private void parseTotalWords(StringBuilder buffer) {

        Stream.of(buffer
                .toString()
                .split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .forEach(totalWords::add);
    }

    public void setIgnoreList(StringBuilder ignoreBuffer) {
        this.ignoreList = parseIgnoreWords(ignoreBuffer);
    }

    public List<String> getIgnoreList(){
        return ignoreList;
    }

    private List<String> parseIgnoreWords(StringBuilder ignoreBuffer){
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

    public int getUniqueWordsCount() {

        uniqueWordsList = getWordsSpecifiedFrequency(1, 1);
        return uniqueWordsList.size();
    }


    /**
     * get all words with frequency more or equaled to start
     *
     * @param start
     * @return
     */
    private List<String> getWordsSpecifiedFrequency(int start) {
        List<String> wordsSpecifiedFreqFrom = new ArrayList<>();

        for (int i = 0; i < wordFreqPairs.size(); i++) {
            if (wordFreqPairs.get(i).count >= start) {
                wordsSpecifiedFreqFrom.add(wordFreqPairs.get(i).word);
            }
        }
        return wordsSpecifiedFreqFrom;

    }

    /**
     * makes possible to get all words with frequency from 5 to 10
     *
     * @param start
     * @param end
     * @return
     */

    private List<String> getWordsSpecifiedFrequency(int start, int end) {

        List<String> wordsSpecifiedFreqFromTo = new ArrayList<>();

        for (WordFreqPair pair : wordFreqPairs) {
            if (pair.count >= start && pair.count <= end) {
                wordsSpecifiedFreqFromTo.add(pair.word);
            }
        }
        return wordsSpecifiedFreqFromTo;
    }

    private boolean isPunctuation(Character currentChar) {
        return currentChar.toString().matches("[!?.]+");
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
            Character firstChar = this.buffer.charAt(i + 2);
            Character secondChar = this.buffer.charAt(i + 3);

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

    private List<WordFreqPair> getFrequencies() {

        Map<String, Integer> frequencyRegisterMap = new HashMap<String, Integer>();

        for (String currentWord : totalWords) {
            if (!currentWord.equals("")) {                  //иначе находит 281 совпадение ""
                if (frequencyRegisterMap.containsKey(currentWord)) {
                    Integer value = frequencyRegisterMap.get(currentWord);
                    frequencyRegisterMap.replace(currentWord, value = value + 1);
                } else {
                    frequencyRegisterMap.put(currentWord, 1);
                }
            }
        }

        for (String key : frequencyRegisterMap.keySet()) {
            wordFreqPairs.add(new WordFreqPair(key, frequencyRegisterMap.get(key)));
        }

        Collections.sort(wordFreqPairs, new Comparator<WordFreqPair>() {
            @Override
            public int compare(WordFreqPair o1, WordFreqPair o2) {
                return o2.count - o1.count;
            }
        });

        return wordFreqPairs;

    }

    private void analyzeWordAppearance() {

        for (WordFreqPair pair : wordFreqPairs) {
            String word = pair.word;
            int frequency = pair.count;
            int appearance = countSentencesWithWord(pair.word);
            wordFreqAppearTrios.add(new WordFreqAppearTrio(word, frequency, appearance));
        }
    }

    private int countSentencesWithWord(String word) {
        int sentenceWithWordCount = 0;

        for (String sentence : sentences) {

            List<String> wordsInTheSentence = new ArrayList<>();

            Stream.of(sentence
                    .split("[^A-Za-zА-Яа-я]+"))
                    .map(String::toLowerCase)
                    .forEach(wordsInTheSentence::add);

            for (String currentWord : wordsInTheSentence) {

                if (currentWord.matches(word)) {
                    sentenceWithWordCount++;
                    break;
                }
            }
        }
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



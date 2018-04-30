package com.stringTests.countSentencesAndWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

/**
 * is responsible for analysing the text
 */
public class _oldDriver {

    private String rawText;

    private class WordCountPair {
        String word;
        int count;

        WordCountPair(String key, Integer value) {
            this.word = key;
            this.count = value;
        }
    }

    public int countSentences() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("DBDir/Hobbit.txt"));
        int sentenceCount = 0;

        while (reader.ready()) {
            String str = reader.readLine();
            sentenceCount += str.split("[!?.:]+").length;
        }
        return sentenceCount;
    }

    private List<WordCountPair> wordCountPairs = new ArrayList<WordCountPair> ();

    public void getFrequencies() throws IOException {

        List<String> wordsOnly = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("DBDir/Hobbit.txt"));

        while (reader.ready()) {
            String str = reader.readLine();
            Stream.of(str.split("[^A-Za-zА-Яа-я]+"))
                    .map(String::toLowerCase).forEach(wordsOnly::add);
        }

        Map<String, Integer> frequencyRegisterMap = new HashMap<String, Integer>();

//        for (int i = 0; i < wordsOnly.size(); i++) {
//            String currentWord = wordsOnly.get(i);
//            if (currentWord.equals("")){}                        //иначе находит 281 совпадение ""
//            else if (frequencyRegisterMap.containsKey(currentWord)) {
//                Integer value = frequencyRegisterMap.get(currentWord);
//                frequencyRegisterMap.replace(currentWord, value = value + 1);
//            } else {
//                frequencyRegisterMap.put(currentWord, 1);
//            }
//        }

        for (String key : frequencyRegisterMap.keySet()) {
            wordCountPairs.add(new WordCountPair(key, frequencyRegisterMap.get(key)));
        }

        Collections.sort(wordCountPairs, (o1, o2) -> o2.count - o1.count);

        for (int i = 0; i < wordCountPairs.size(); i++) {
            System.out.println(wordCountPairs.get(i).word +" : " +  wordCountPairs.get(i).count);
        }
    }

    public String getByFrequency(int frequency) {

        List <String> byFreqList = new ArrayList<String>();

        for (int i = 0; i < wordCountPairs.size(); i++) {
            int currentValue = wordCountPairs.get(i).count;
            if (currentValue == frequency){
                byFreqList.add(wordCountPairs.get(i).word);
            }
        }

        String [] byFreqArray = new String[byFreqList.size()];

        for (int i = 0; i < byFreqList.size(); i++) {
            byFreqArray [i] = byFreqList.get(i);
        }

        if (byFreqArray.length == 0){
            return "there is no words with such frequency!";
        }

        return Arrays.toString(byFreqArray);
    }
}


package com.stringTests.maximumOccuringCharacter;

import java.util.*;

public class Storage {

    private class KeyValuePair {
        char letter;
        int count;

        KeyValuePair(Character key, Integer value) {
            this.letter = key;
            this.count = value;
        }
    }

    private class KeyRatingPair {
        char letter;
        int rating;

        KeyRatingPair(Character key, Integer value) {
            this.letter = key;
            this.rating = value;
        }
    }

    /**
     * for string "ssss dddd a b"
     * letter = s;  count = 4,
     * letter = d; count = 4;
     * letter = a, count = 1;
     * letter = b; count = 1;
     */
    private List<KeyValuePair> keyValuePairs = new ArrayList<KeyValuePair>();

    public Storage(String str) {

        Map<Character, Integer> frequencyRegisterMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); // упростил вместо Character currentChar = new Character(str.charAt(i))
            if (currentChar == ' ') {}                            // для пропуска пробелов !!!
            else if (frequencyRegisterMap.containsKey(currentChar)) {
                Integer value = frequencyRegisterMap.get(currentChar);
                frequencyRegisterMap.replace(currentChar, value = value + 1);
            } else {
                frequencyRegisterMap.put(currentChar, 1);
            }
        }

        for(Character key : frequencyRegisterMap.keySet()) {
            keyValuePairs.add(new KeyValuePair(key, frequencyRegisterMap.get(key)));
        }

        Collections.sort(keyValuePairs, new Comparator<KeyValuePair>() {
            @Override
            public int compare(KeyValuePair o1, KeyValuePair o2) {
                return o2.count - o1.count;
            }
        });

    }

    public List<Integer> getFrequencies() {
        List <Integer> freqList = new ArrayList<Integer>();
        for (int i = 0; i < keyValuePairs.size(); i++) {
            int currentValue = keyValuePairs.get(i).count;
            if (!freqList.contains(currentValue)){
                freqList.add(keyValuePairs.get(i).count);
            }
        }
        // iterate through the keyValuePairs and collect all counts
        return freqList; // => {4, 1}
    }

    public char getMaxChar(int index) {
        return keyValuePairs.get(index).letter;
    }

    private int getSize(){
        return keyValuePairs.size();
    }

    public char getMinChar(){
        return keyValuePairs.get(getSize()-1).letter;
    }

    /**
     * abssssdddd
     * getByFrequency(4) => [s, d]
     * getByFrequency(1) => [a, b]
     * getByFrequency(2) => exception
     *
     * @param frequency
     * @return
     */
    public char[] getByFrequency(int frequency) {
        List <Character> byFreqList = new ArrayList<Character>();
        for (int i = 0; i < keyValuePairs.size(); i++) {
            int currentValue = keyValuePairs.get(i).count;
            if (currentValue == frequency){
                byFreqList.add(keyValuePairs.get(i).letter);
            }
        }
        char[] byFreqArray = new char[byFreqList.size()];
        for (int i = 0; i < byFreqList.size(); i++) {
            byFreqArray[i] = byFreqList.get(i);
            }
        return byFreqArray;
    }

    public String toStringByFreqArray(int frequency){
        return Arrays.toString(getByFrequency(frequency));
    }

    public List <KeyRatingPair> getRatings(){
        List <KeyRatingPair> ratingList = new ArrayList<KeyRatingPair>();
        int rating = 0;
        for (int i = 0; i < keyValuePairs.size(); i++) {

            char letter = this.keyValuePairs.get(i).letter;

            if (i == 0){
                ratingList.add(new KeyRatingPair(letter, rating));

            } else if (keyValuePairs.get(i).count == keyValuePairs.get(i-1).count){
                ratingList.add(new KeyRatingPair(letter, rating));

            } else {
                rating = rating + 1;
                ratingList.add(new KeyRatingPair(letter, rating));
            }
        }
        // iterate through the keyValuePairs and collect all counts
        return ratingList; // => {4, 1}
    }

    public void printAllRatings(){ //откуда взялись переводы строк???
        List <KeyRatingPair> ratingList = getRatings();

        for (int i = 0; i < ratingList.size(); i++ ) {

            if (i == 0) {
                System.out.print("Rating: " + ratingList.get(i).rating + " Character: " + ratingList.get(i).letter);

            } else if (ratingList.get(i).rating == ratingList.get(i - 1).rating){
                System.out.print(", " + ratingList.get(i).letter);

            } else
                System.out.print("\n" + "Rating: " + ratingList.get(i).rating + " Character: " + ratingList.get(i).letter);
        }
    }

    public void printByRating(int chosenRating){
        List <KeyRatingPair> ratingList = getRatings();
        System.out.print("\nCharacter with rating '" + chosenRating + "' : [");
        int counter = 0;

        for (int i = 0; i < ratingList.size(); i++) {

            if (chosenRating == ratingList.get(i).rating) {
                if (counter != 0) {
                    System.out.print(", ");
                }
                System.out.print(ratingList.get(i).letter );
                counter++;
            }
        }
        System.out.print("]");
    }
}

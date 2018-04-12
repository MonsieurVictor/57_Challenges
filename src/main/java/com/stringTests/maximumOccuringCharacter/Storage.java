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
            if (!freqList.contains(keyValuePairs.get(i).count)){
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

    public void printFrequencies(){
        System.out.println(Arrays.toString(getFrequencies().toArray()));
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
        return null;
    }
}

package com.stringTests.maximumOccuringCharacter;

// Java program to output the maximum occurring character
// in a string

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;


public class MaximumOccurringCharacter
{
    static final int ASCII_SIZE = 256;

    private static class KeyValuePair {
        char letter;
        int count;

        KeyValuePair(Character key, Integer value) {
            this.letter = key;
            this.count = value;
        }
    }

    static char getMaxOccurringChar(String str)
    {
        // Create array to keep the count of individual characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input string.
        int len = str.length();
        for (int i=0; i<len; i++) {
            count[str.charAt(i)]++; // как работает приведение типа???
            System.out.println(str.charAt(i));
        }
        int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }



    static List<KeyValuePair> getStorage(String str) {

        Map<Character, Integer> frequencyRegister = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character currentChar = new Character(str.charAt(i));
            if (frequencyRegister.containsKey(currentChar)) {
                Integer value = frequencyRegister.get(currentChar);
                frequencyRegister.replace(currentChar, value = value + 1);
            } else {
                frequencyRegister.put(currentChar, 1);
            }
        }

        List<KeyValuePair> storage = new ArrayList<KeyValuePair>();

        for(Character key : frequencyRegister.keySet()) {
            storage.add(new KeyValuePair(key, frequencyRegister.get(key)));
        }

        Collections.sort(storage, new Comparator<KeyValuePair>() {
            @Override
            public int compare(KeyValuePair o1, KeyValuePair o2) {
                return o2.count - o1.count;
            }
        });

        return storage;

    }

    // Driver Method
    public static void main(String[] args)
    {
        String str = "aaaaghhtttpppppssssss";
        List<KeyValuePair> storage = getStorage(str);
        System.out.println("Max occurring character is " + storage.get(0).letter);
        System.out.println("Second Max occurring character is " + storage.get(1).letter);
        System.out.println("Min occurring character is " + storage.get(storage.size() - 1).letter);

    }
}
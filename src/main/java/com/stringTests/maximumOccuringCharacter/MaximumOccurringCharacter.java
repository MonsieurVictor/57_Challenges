package com.stringTests.maximumOccuringCharacter;

// Java program to output the maximum occurring character
// in a string, find by rating and by frequency

public class MaximumOccurringCharacter
{
    public static void main(String[] args)
    {
        String str = "cccc rrrr o dd bb               ssssss";
        Storage storage = new Storage(str);

//        List<KeyValuePair> storage = getStorage(str);
        System.out.println("Max occurring character is " + storage.getMaxChar(0)); // или storage.keyValuePairs.get(0).letter
        System.out.println("Second Max occurring character is " + storage.getMaxChar(1));
        System.out.println("Min occurring character is " + storage.getMinChar());
        System.out.println("Frequencies are: " + storage.getFrequencies());
        System.out.println("Characters with frequency '2' are: " + storage.toStringByFreqArray(2));
        storage.printAllRatings();
        storage.printByRating(2);
    }
}
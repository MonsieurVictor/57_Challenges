package com.stringTests.maximumOccuringCharacter;

// Java program to output the maximum occurring character
// in a string

public class MaximumOccurringCharacter
{
    public static void main(String[] args)
    {
        String str = "cccc o dd ttt ppppp               ssssss";
        Storage storage = new Storage(str);

//        List<KeyValuePair> storage = getStorage(str);
        System.out.println("Max occurring character is " + storage.getMaxChar(0)); // или storage.keyValuePairs.get(0).letter
        System.out.println("Second Max occurring character is " + storage.getMaxChar(1));
        System.out.println("Min occurring character is " + storage.getMinChar());

    }
}
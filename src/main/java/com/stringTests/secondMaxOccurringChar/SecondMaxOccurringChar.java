package com.stringTests.secondMaxOccurringChar;

/** Given a string, find the secondChar most frequent character in it.

        Examples:

        Input: str = "aabababa";
        Output: Second most frequent character is 'b'

        Input: str = "geeksforgeeks";
        Output: Second most frequent character is 'g'

        Input: str = "geeksquiz";
        Output: Second most frequent character is 'g'
        The output can also be any other character with
        count 1 like 'z', 'i'.

        Input: str = "abcd";
        Output: No secondChar most frequent character
**/

public class SecondMaxOccurringChar {

    private static String str = "geeksforgeeks";
    private static final int NUMBER_OF_CHARS = 256;
    private static int[] count = new int[NUMBER_OF_CHARS];
    private static int firstChar = 0;
    private static int secondChar = 0;

    private static void countNumberOfCharOccurrences() {

        // count number of occurrences of every
        // character.

        for (int i=0; i< str.length(); i++) {
            (count[str.charAt(i)])++;
        }
    }

    static char getSecondMostFreq() {


        countNumberOfCharOccurrences();

        // Traverse through the count[] and find
        // second highest element.

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {

            /* If current element is bigger than
            firstChar then update both firstChar and secondChar */

            if (count[i] > count[firstChar]) {
                secondChar = firstChar;
                firstChar = i;
            }

            /* If count[i] is in between firstChar and
            secondChar then update secondChar  */

            else if (count[i] > count[secondChar] &&
                    count[i] != count[firstChar])
                secondChar = i;
        }

        return (char) secondChar;
    }

    public static void main(String args[])
    {
        char result = getSecondMostFreq();
        if (result != '\0')
            System.out.println("Second most frequent char is " + result);
        else
            System.out.println("No second most frequent character");
    }
}


package com.stringTests.smallestWindowInTheString;

// Java program to find smallest window containing
// all characters of a pattern.

/**  Given two strings string1 and string2, find the smallest substring in string1
containing all characters of string2 efficiently.

For Example:

Input :  string = "this is a test string"
pattern = "tist"
Output :  Minimum window is "t stri"
Explanation: "t stri" contains all the characters
of pattern.

Input :  string = "geeksforgeeks"
pattern = "ork"
Output :  Minimum window is "ksfor"
**/

public class SmallestWindowInTheString {

    private static String str = "this is a test string";
    private static String pat = "tist";
    private static final int NO_OF_CHARS = 256;
    private static int hashPat[] = new int[NO_OF_CHARS];
    private static int hashStr[] = new int[NO_OF_CHARS];
    private static int strLength = str.length();
    private static int patLength = pat.length();
    private static int start = 0;
    private static int startIndex = -1;
    private static int minLength = Integer.MAX_VALUE;
    private static int count = 0;  // count of characters

    private static void storeOccurrenceOfCharsOfPattern(){
        for (int i = 0; i < patLength; i++)
            hashPat[pat.charAt(i)]++;
    }

    private static boolean checkIfStringIsIncorrect() {

        // check if string's length is less than pattern's
        // length. If yes then no such window can exist
        if (strLength < patLength) {
            System.out.println("No such window exists");
            return true;
        }
        return false;
    }

    private static String createSubstring () {
        // Return substring starting from startIndex
        // and having minLength
        return str.substring(startIndex, startIndex + minLength);
    }

    private static boolean checkIfNoWindowFound(){
        if (startIndex == -1) {
            System.out.println("No such window exists");
            return true;
        }
        return false;
    }

    private static void traverseTheString () {
        for (int j = 0; j < strLength ; j++) {
            // count occurrence of characters of string
            hashStr[str.charAt(j)]++;

            // If string's char matches with pattern's char
            // then increment count
            if (hashPat[str.charAt(j)] != 0 && hashStr[str.charAt(j)] <= hashPat[str.charAt(j)] )
                count++;

            // if all the characters are matched
            if (count == patLength) {
                // Try to minimize the window i.e., check if
                // any character is occurring more no. of times
                // than its occurrence in pattern, if yes
                // then remove it from starting and also remove
                // the useless characters.
                while ( hashStr[str.charAt(start)] > hashPat[str.charAt(start)] || hashPat[str.charAt(start)] == 0) {

                    if (hashStr[str.charAt(start)] > hashPat[str.charAt(start)]) {
                        hashStr[str.charAt(start)]--;
                    }

                    start++;
                }

                // update window size
                int windowLength = j - start + 1;

                if (minLength > windowLength) {
                    minLength = windowLength;
                    startIndex = start;
                }
            }
        }
    }

    private static String findSmallestWindow() {

        if (checkIfStringIsIncorrect()){
            return "";
        }
        storeOccurrenceOfCharsOfPattern();
        traverseTheString();

        if (checkIfNoWindowFound()){
            return "";
        }
        return createSubstring();
    }

    public static void main(String[] args) {
        System.out.print("Smallest window is : " + findSmallestWindow());
    }
}

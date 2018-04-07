package com.stringTests.nonRepeatingChar;

import java.util.Arrays;

/** Given a string and a number k, find the k’th non-repeating character in the string.
 * Consider a large input string with lacs of characters and a small character set.
 * How to find the character by only doing only one traversal of input string?

    Examples:

    Input : str = geeksforgeeks, k = 3
    Output : r
    First non-repeating character is f,
    second is o and third is r.

    Input : str = geeksforgeeks, k = 2
    Output : o

    Input : str = geeksforgeeks, k = 4
    Output : Less than k non-repeating
    characters in input.
 */

public class NonRepeatingChar {

    private static int MAX_CHAR = 256;
    private static String str = "geeksforgeeks";
    private static int strLength = str.length();
    private static int k = 3;


    // count[x] is going to store count of
    // character 'x' in str. If x is not present,
    // then it is going to store 0.

    private static int[] count = new int[MAX_CHAR];

    // index[x] is going to store index of character
    // 'x' in str.  If x is not present or x is
    // repeating, then it is going to store  a value
    // (for example, length of string) that cannot be
    // a valid index in str[]

    private static int[] index = new int[MAX_CHAR];

    private static int checkForSuccess(){
        // After sorting, if index[k-1] is value, then
        // return it, else return -1.
        return (index[k-1] != strLength)? index[k-1] : -1;
    }

    private static void countAllChars(){

        for (int i = 0; i < MAX_CHAR; i++) {
            count[i] = 0;
            index[i] = strLength;  // A value more than any index in str[]
        }
    }

    private static void traverseTheString() {

        // Traverse the input string
        for (int i = 0; i < strLength; i++) {
            // Find current character and increment its
            // count
            char x = str.charAt(i);
            ++count[x];

            // If this is first occurrence, then set value
            // in index as index of it.
            if (count[x] == 1)
                index[x] = i;

            // If character repeats, then remove it from
            // index[]
            if (count[x] == 2)
                index[x] = strLength;
        }
    }

    private static int countKthNonRepeating(String str, int k) {

        countAllChars();
        traverseTheString();

        // Sort index[] in increasing order.  This step
        // takes O(1) time as size of index is 256 only
        Arrays.sort(index);

        return checkForSuccess();
    }

    public static void main (String[] args) {

        int result = countKthNonRepeating(str, k);

        System.out.println(result == -1 ? "There are less than k non-repeating characters" :
                "k'th non-repeating character is " + str.charAt(result));
    }
}

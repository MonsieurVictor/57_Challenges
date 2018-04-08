package com.stringTests.encryptTheString;

import java.util.ArrayList;
import java.util.Scanner;

/**
     Input:
     The first line contains T, the number of test cases.
     Then T lines follow, each containing a string S ( |S| <= 1000),
     consisting of lower case English alphabets

     Output:
     For each test case in a new line print the required encrypted string.

     Constraints:
     1<=T<=28
     Length of each string <=1000

     Example:
     Input:
     2
     aabc
     aaaaa

     Output:
     1c1b2a
     5a

     Explanation:
     For first test case
     aabc
     Step1: a2b1c1
     Step2: 1c1b2a

 **/

    public class EncryptTheString {

    private static void convertStrings(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println(reverseString(encryptString((String) list.get(i))));
        }
    }

    private static ArrayList collectStringsToList(int numberOfTests) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < numberOfTests; i++) {
            list.add(receiveString());
        }
        return list;
    }

    private static StringBuffer reverseString(String s3) {

        return new StringBuffer(s3).reverse();
    }

    private static String encryptString(String source) {
        String result = "";
        int charCount = 1;

        for (int i = 0; i < source.length(); i++) {
            char currentChar = source.charAt(i);
            if (i == source.length() - 1) {
                result += String.valueOf(currentChar) + charCount;
                break;
            }

            if (currentChar == (source.charAt(i + 1))) {
                charCount++;

            } else {
                result += String.valueOf(currentChar) + charCount;
                charCount = 1;
            }
        }
        return result;
    }

    private static String receiveString() {

        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            if (0 < str.length() && str.length() <= 1000) {
                break;
            }
            System.out.println("1<=length(A)<=1000");
        }
        return str;
    }

    private static int receiveNumberOfTests() {

        Scanner sc = new Scanner(System.in);
        int numberOfTests;
        while (true) {
            numberOfTests = sc.nextInt();
            if (0 < numberOfTests && numberOfTests <= 28) {
                break;
            }
            System.out.println("Enter the number of tests 1<=T<=28");
        }
        return numberOfTests;
    }

    public static void main(String[] args) {

        int numberOfTests = receiveNumberOfTests();
        convertStrings(collectStringsToList(numberOfTests));
    }
}

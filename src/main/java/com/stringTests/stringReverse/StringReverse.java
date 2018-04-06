package com.stringTests.stringReverse;

import java.util.ArrayList;
import java.util.Scanner;

/*Given two strings as input. Your task is to concatenate two strings
and then reverse the string. Finally print the reversed string.

        Input:
        First line of the input file contains an integer T which denotes the number
        of test cases. Then T test cases follow. First line of each test case contains
        a string A and second line contains another string B.

        Output:
        For each test case, print the reversed string.

        Constraints:
        1<=T<=20
        1<=length(A)<=50
        1<=length(B)<=50

        Example:
        Input:
        2
        Geeks
        forGeeks
        Practice
        geeks
        Output:
        skeeGrofskeeG
        skeegecitcarP
        */

public class StringReverse {

    private static StringBuffer reverseStrings(String s3){

        return new StringBuffer(s3).reverse();
    }

    private static String concatenateStrings(String a, String b){

        return a + b;
    }

    private static String receiveString() {

        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            if (0 < str.length() && str.length() <= 50) {
                break;
            }
            System.out.println("1<=length(A)<=50");
        }
        return str;
    }

    private static int receiveNumberOfTests() {

        Scanner sc = new Scanner(System.in);
        int numberOfTests;
        while (true) {
            numberOfTests = sc.nextInt();
            if (0 < numberOfTests && numberOfTests <= 20) {
                break;
            }
            System.out.println("Enter the number of tests 1<=T<=20");

        }
        return numberOfTests;
    }

    private static void convertStrings(ArrayList list, int numberOfTests){

        for (int i = 0; i < numberOfTests * 2; i++) {
            String s3 = concatenateStrings((String)list.get(i), (String)list.get(i + 1));
            System.out.println(reverseStrings(s3));
            i++;
        }
    }

    private static ArrayList collectStringsToList(int numberOfTests) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < numberOfTests; i++) {
            list.add(receiveString());
            list.add(receiveString());
        }
        return list;
    }

    public static void main(String[] args) {

        int numberOfTests = receiveNumberOfTests();
        convertStrings(collectStringsToList(numberOfTests), numberOfTests);
    }
}

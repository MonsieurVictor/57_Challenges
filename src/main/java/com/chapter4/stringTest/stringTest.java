package com.chapter4.stringTest;

import java.io.IOException;

public class stringTest {
    public static int stringSum(String a, String b) {
        return a.length() + b.length();
    }

    private static String capitalizeString (String a){
        if (a.compareTo("") == 0) {
           return a;
        }
        String firstLetter = String.valueOf(a.charAt(0)).toUpperCase();
        a = a.substring(1);
        a = firstLetter + a;
        return a;
    }

    public static void testAggregator(String a, String b) throws IOException {
        System.out.println(stringSum(a, b));
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalizeString(a) + " " + capitalizeString(b));
    }

    public static void main(String[] args) throws IOException {
        String a = "Oh...! the places you'll go";
        String b = "";
        testAggregator(a, b);
    }
}

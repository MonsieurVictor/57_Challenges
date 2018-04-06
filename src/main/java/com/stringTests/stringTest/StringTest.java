package com.stringTests.stringTest;

import java.io.IOException;

public class StringTest {
    public static int stringSum(String a, String b) {
        return a.length() + b.length();
    }

    private static String capitalizeString (String a){
        if (a.compareTo("") == 0) {
           return a;
        }
        String firstLetter = String.valueOf(a.charAt(0)).toUpperCase();
        char[] charArray = a.toCharArray();
        a = new String(charArray, 1, charArray.length - 1);
        //a = a.substring(1);
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

        String s = "Learn Share Learn";
        System.out.println(s.indexOf("S", 1));

        System.out.println("Geeks".equalsIgnoreCase("geeks"));
    }

    public static void main(String[] args) throws IOException {
        String a = "oh...! the places you'll go";
        String b = "congratulations! Today is your day";
        testAggregator(a, b);
    }
}

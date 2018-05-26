package com.stringTests.reverseString;

/**
* represents how to reverse a simple string
*
**/

public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }

        System.out.println(result);
    }
}

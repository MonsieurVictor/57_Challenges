package com.chapter2;

import java.util.Scanner;

public class SimlpeMath {
    public static void main(String[] args) {

        System.out.print("What is the first number? ");
        int First;
        int Second;
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            String FirstStr = sc.nextLine();
            if (checkStringIsNumber(FirstStr)) {
                First = Integer.parseInt(FirstStr);
                if (First >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive number!");
        }
        System.out.print("What is the second number? ");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            String SecondStr = sc.nextLine();
            if (checkStringIsNumber(SecondStr)) {
                Second = Integer.parseInt(SecondStr);
                if (Second >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive number!");
        }
        int result = First + Second;

        System.out.println(First + " + " + Second + " = " + result);
        result = First - Second;
        System.out.println(First + " - " + Second + " = " + result);
        result = First * Second;
        System.out.println(First + " * " + Second + " = " + result);
        double quotient = (double) First / (double) Second;
        System.out.println(First + " / " + Second + " = " + quotient);
    }

    public static boolean checkStringIsNumber(String string) {
        if (string == null || string.length() == 0) return false;
        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }
        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
package com.chapter2;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {
    public static void main(String[] args){
        System.out.println("What is the input string?");
        String Str1 = new String();
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            Str1 = sc.nextLine();
            if (Str1.length() != 0) {
                System.out.println("String length " + Str1 + " = " + Str1.length()); // а если ввести sc.nextLine()?
                break;
            }
            System.out.println("Please, enter something!");
        }
    }
}

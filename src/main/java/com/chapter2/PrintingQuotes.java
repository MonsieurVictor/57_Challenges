package com.chapter2;

import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        String Quote;
        String Author;
        System.out.println("What is the quote?");
        Scanner sc = new Scanner(System.in);
        Quote = sc.nextLine();
        System.out.println("Who said it?");
        Author = sc.nextLine();
        String phrase = Author + " says,- \"" + Quote + "\"";
        System.out.println(phrase);
    }
}

package com.chapter2;

import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        String Noun;
        String Verb;
        String Adjective;
        String Adverb;
        System.out.println("Enter a noun");
        Scanner sc = new Scanner(System.in);
        Noun = sc.nextLine();
        System.out.println("Enter a verb");
        Verb = sc.nextLine();
        System.out.println("Enter a adjective");
        Adjective = sc.nextLine();
        System.out.println("Enter a adverb");
        Adverb = sc.nextLine();
        System.out.println(
                "Do you " + Verb + " your " + Adjective + " " + Noun + " " + Adverb + "? That's hillarious!"
        );
    }
}



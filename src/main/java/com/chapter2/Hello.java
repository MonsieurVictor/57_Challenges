package com.chapter2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, " + sc.nextLine() + "!" );
    }
}

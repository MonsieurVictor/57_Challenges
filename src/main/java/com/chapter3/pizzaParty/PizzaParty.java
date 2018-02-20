package com.chapter3.pizzaParty;

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        int people, pizzas, pieces, slices, leftover;
        String isPlural, are = "are ";

        System.out.print("How many people? ");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                people = sc.nextInt();
                if (people > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }

        System.out.print("How many pizzas do you have? ");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                pizzas = sc.nextInt();
                if (pizzas > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }

        if (pizzas == 1) {
            isPlural = " pizza";
        }
        else {
            isPlural = " pizzas";
        }

        System.out.print("What is the number of slices per pizza? ");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                slices = sc.nextInt();
                if ((slices > 0) && (slices % 2 == 0)) {
                    break;
                }
            }
            System.out.println("Please enter an even number!");
        }

        System.out.println(people + " people with " + pizzas + isPlural + ".");
        pieces = pizzas * slices;
        leftover = pieces % people;
        pieces = (pieces - leftover) / people;
        if (pieces == 1) {
            are = "is ";
            isPlural = " piece";
        }
        else {
            isPlural = " pieces";
        }

        System.out.println("Each person gets " + pieces + isPlural + " of pizza.");
        if (leftover == 0) {
            System.out.println("There is no leftover.");
        }
        else {
            System.out.println("There " + are + leftover + " leftover" + isPlural + ".");
        }
    }
}

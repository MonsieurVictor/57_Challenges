package com.chapter3.pizzaParty;

import java.math.BigDecimal;
import java.util.Scanner;

public class PizzaPartySecond {
    public static void main(String[] args) {
        int people, pieces, slices, leftover;
        double pizzas;
        String isPlural, are = "are ";

        System.out.print("How many people? ");
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                people = sc.nextInt();
                if (people > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }

        System.out.print("How many pieces each person wants? ");
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                pieces = sc.nextInt();
                if (pieces > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }

        if (pieces == 1) {
            isPlural = " piece";
        }
        else {
            isPlural = " pieces";
        }

        System.out.print("What is the number of slices per pizza? ");
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                slices = sc.nextInt();
                if ((slices > 0) && (slices % 2 == 0)) {
                    break;
                }
            }
            System.out.println("Please enter an even number!");
        }
        System.out.println("Every person wants " + pieces + isPlural + ".");
        pizzas = (double) people * (double) pieces / (double) slices;
        BigDecimal roundPizzas = BigDecimal.valueOf(pizzas);
        roundPizzas = roundPizzas.setScale(0, BigDecimal.ROUND_CEILING);

        if (roundPizzas.intValue() == 1) {
            isPlural = " pizza";
        }
        else {
            isPlural = " pizzas";
        }

        System.out.println(people + " people need to purcase " + roundPizzas + " full" + isPlural + ".");
        pieces = roundPizzas.intValue() * slices;
        leftover = pieces % people;

        if (leftover == 0) {
            System.out.println("There is no leftover.");
        }
        else {
            if (leftover == 1) {
                are = "is ";
                isPlural = " piece";
            }
            else {
                isPlural = " pieces";
            }
            System.out.println("There " + are + leftover + " leftover" + isPlural + ".");
        }
    }
}



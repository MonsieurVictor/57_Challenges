package com.chapter1;

import java.util.Scanner;

public class BillAmountCalc {

    public static void main(String[] args) {
        double billAmount = 0;
        double tip;
        int tipRate;
        double total;
        System.out.println("What is the bill amount?");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextDouble()) {
                billAmount = sc.nextDouble();
                if (billAmount >= 0) {
                    System.out.println(billAmount);
                    break;
                }
            }
            System.out.println("Please enter a positive number!");
        }
        System.out.println("What is the tip rate?");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) { // почему нельзя через && ?
                tipRate = sc.nextInt();
                if (tipRate >= 0) { // почему если пишешь 2 раза  sc.nextInt() то приходится дважды вводить число
                System.out.println(tipRate);
                break;
                }
            }
            System.out.println("Please enter a positive integer!");
        }
        tip = billAmount * ((double) tipRate / 100);
        total = billAmount + tip;
        total = total * 100;
        int i = (int) Math.round(total);
        total = (double) i / 100;

        System.out.println("Tip: $" + tip);
        System.out.println("Total: $" + total);

    }
}

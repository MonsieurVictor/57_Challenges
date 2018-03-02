package com.chapter4.taxCalculation;

/**
* is responsible for output the result
* */

public class StateOutput {

    public StateOutput(String string, double amount) {
        System.out.println("The total is " + amount);
        double totalAmount = amount + amount * 0.055;
        System.out.println("The subtotal is " + amount + "\n" +
                    "The tax is $0.55." + "\n" +
                    "The total is " + totalAmount);
    }

    public StateOutput (double amount) {
        System.out.print("The total is " + amount);
    }
}


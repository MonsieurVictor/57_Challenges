package com.chapter3.computingSimpleInterest;

/**
 * Computing simple interest to figure out whether an investment has value.
 */

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        ComputingSimpleInterestCalc output = new ComputingSimpleInterestCalc();
        System.out.print("Enter the principal:");
        double principal = output.principalInput();
        System.out.print("Enter the rate of interest:");
        double rate = output.rateInput();
        System.out.print("Enter the number of years:");
        int years = output.yearsInput();
        double investment = output.calculateSimpleInterest(principal, rate, years);
        System.out.println("After " + years + " years at " + rate + "%  the investment will" +
                " be worth $" + investment + ".");
        for (int i = 1; i < years; i++) {
            investment = output.calculateSimpleInterest(principal, rate, i);
            System.out.println("After " + i + " years the investment will" +
                    " be worth $" + investment + ".");
        }
    }
}

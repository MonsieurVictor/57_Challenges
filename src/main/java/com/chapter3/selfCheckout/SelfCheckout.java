package com.chapter3.selfCheckout;


/**
 * calculating tax and total price of different items
 * */

public class SelfCheckout {

    public static void main(String[] args) {

        System.out.print("What is the number of items? ");
        SelfCheckoutCalc output = new SelfCheckoutCalc();
        double numberOfItems = output.itemsCalculation();

        for (int i = 1; i < (numberOfItems + 1); i++) {
            System.out.print("Enter the price of item " + i + " ! ");
            output.priceCalculation();
            System.out.print("Enter the quantity of item " + i + " ! ");
            output.quantityCalculation();
            output.subTotalCalculation ();
        }

        double subTotal = output.subTotalOutput();
        System.out.println("Subtotal: " + subTotal);
        double taxRate = output.taxRateCalculation();
        System.out.println("Tax rate: " + taxRate);
        double total = output.totalCalculation();
        System.out.println("Total: " + total);
    }
}

package com.chapter3.selfCheckout;

import java.math.BigDecimal;

/**
*
* */

class SelfCheckoutCalc {

    private double price, priceOfAllItems, taxRate, subTotal, tax = 5.5 ;
    SelfCheckoutInput input = new SelfCheckoutInput();

    double itemsCalculation() {
        return input.integerCheck();
    }

    double priceCalculation() {
        return price = input.doubleCheck();
    }

    double quantityCalculation() {
        return priceOfAllItems = price*((double) input.integerCheck());
    }

    double subTotalCalculation() {
        return subTotal = BigDecimal(subTotal + priceOfAllItems);

    }

    double subTotalOutput() {
        return subTotal;
    }

    double taxRateCalculation() {
        return taxRate = BigDecimal(subTotal * tax / 100);
    }

    double totalCalculation() {
        return BigDecimal(taxRate + subTotal);
    }

    public double BigDecimal(double inputNumber) {
        return  BigDecimal
                .valueOf(inputNumber)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}


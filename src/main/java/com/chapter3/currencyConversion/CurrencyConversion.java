package com.chapter3.currencyConversion;

/**
 * A simple conversion from euros to dollars using exchange rate.
 * */

public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionCalc output = new CurrencyConversionCalc();
        System.out.print("How many euros are you exchanging?");
        double euros = output.euroInput();
        System.out.print("What is the exchange rate?");
        double exchangeRate = output.exchangeRateInput();
        double dollars = output.conversionCalc(euros, exchangeRate);
        System.out.print(euros + " euros at an exchange rate of " + exchangeRate
                + " is " + dollars + " U.S. dollars.");
    }
}

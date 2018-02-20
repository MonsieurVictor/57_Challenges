package com.chapter3.currencyConversion;

import java.math.BigDecimal;

public class CurrencyConversionCalc {
    CurrencyConversionInput input = new CurrencyConversionInput();

    double euroInput() {
        return BigDecimal(input.doubleCheck());
    }

    double exchangeRateInput() {
        return input.doubleCheck();
    }

    double conversionCalc(double euro, double exchangeRate) {
        return BigDecimal(euro / 100  * exchangeRate);
    }

    public double BigDecimal(double inputNumber) {
        return  BigDecimal
                .valueOf(inputNumber)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}

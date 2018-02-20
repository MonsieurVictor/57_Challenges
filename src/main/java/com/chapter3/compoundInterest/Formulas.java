package com.chapter3.compoundInterest;

import java.math.BigDecimal;

/**
 * is responsible for keeping formulas
 */
class Formulas {

    public double calcFinalAmount(double principal, double rate, double years, double timesPerYear) {
        return twoDigitsRound(principal * Math.pow(  1 + rate / 100 / timesPerYear , timesPerYear* years));
    }

    public double calcInitialAmount(double goal, double rate, double years, double timesPerYear) {
        return twoDigitsRound(goal /( Math.pow(  1 + rate / 100 / timesPerYear , timesPerYear* years)));
    }

    private double twoDigitsRound(double inputNumber) {
        return  BigDecimal
                .valueOf(inputNumber)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}




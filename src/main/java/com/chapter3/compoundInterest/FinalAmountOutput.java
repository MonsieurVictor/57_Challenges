package com.chapter3.compoundInterest;

/**
 * is responsible for output the final amount.
 */

class FinalAmountOutput extends ValuesReceiver {

    ValuesContainer outputValues = new ValuesContainer();
    Formulas formulas = new Formulas();

    private int years;
    private int timesPerYear;
    private double rate;
    private double finalAmount;
    private double initialAmount;

    void finalAmountOutput() {

        this.inputValues();
        this.inputInitialAmount();

        outputValues = this.getContainer();
        rate = outputValues.rate;
        years = outputValues.years;
        timesPerYear = outputValues.timesPerYear;
        initialAmount = outputValues.initialAmount;
        finalAmount = formulas.calcFinalAmount(initialAmount, rate, years, timesPerYear);

        System.out.println(initialAmount +" invested at " + rate + "% for " + years
                + " years compounded " + timesPerYear + " times per year is "
                + finalAmount + ".");
    }
}


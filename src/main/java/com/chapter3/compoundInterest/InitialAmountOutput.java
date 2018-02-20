package com.chapter3.compoundInterest;

/**
 * is responsible for output the initial amount.
 */

class InitialAmountOutput extends ValuesReceiver {

    ValuesContainer outputValues = new ValuesContainer();
    Formulas formulas = new Formulas();

    private int years;
    private int timesPerYear;
    private double rate;
    private double goal;
    private double initialAmount;

    void initialAmountOutput() {

        this.inputValues();
        this.inputGoal();

        outputValues = this.getContainer();  // если написать просто =getContainer(), то возвращает нули, почему?
        rate = outputValues.rate;
        years = outputValues.years;
        timesPerYear = outputValues.timesPerYear;
        goal = outputValues.goal;
        initialAmount = formulas.calcInitialAmount(goal, rate, years, timesPerYear);

        System.out.println( goal +" invested at " + rate + "% for " + years
                + " years compounded " + timesPerYear + " times per year is "
                + initialAmount + ".");
    }
}

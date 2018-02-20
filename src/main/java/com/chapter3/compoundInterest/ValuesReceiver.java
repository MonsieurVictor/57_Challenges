package com.chapter3.compoundInterest;

import com.utils.ConsoleInputsReceiver;

/**
 * is responsible for receiving values from keyboard to the ValuesContainer;
 */

public class ValuesReceiver {

    private ValuesContainer container = new ValuesContainer();
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();

      public void inputValues() {
        System.out.print("What is the rate?");
        container.rate = console.insistOnDoublePositiveInput();
        System.out.print("What is the number of years?");
        container.timesPerYear = console.insistOnIntegerPositiveInput();
        System.out.print("What is the number of times the interest is compounded per year?");
        container.years = console.insistOnIntegerPositiveInput();
    }

    public double inputGoal() {
        System.out.print("What is the goal amount? ");
        container.goal = console.insistOnDoublePositiveInput();
        return container.goal;
    }

    public double inputInitialAmount() {
        System.out.print("What is the investment amount?");
        container.initialAmount = console.insistOnDoublePositiveInput();
        return container.initialAmount;
    }

    public ValuesContainer getContainer() {
        return this.container;
    }

}

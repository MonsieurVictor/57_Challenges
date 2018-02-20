package com.chapter4.TaxCalculation;

/**
 * is responsible for keeping the values;
 * */

public class App {

    private double amount;

    public void start() {
        Receiver receiver = new Receiver();
        amount = receiver.amountInput();
        String state = receiver.stateInput();
        StateChecker stateChecker = new StateChecker();

        if (stateChecker.isWisconsin(state)) {
            StateOutput wisconsin = new StateOutput(state, amount);
        } else {
            StateOutput nonResident = new StateOutput(amount);
        }

    }
}




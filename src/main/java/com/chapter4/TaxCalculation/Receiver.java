package com.chapter4.TaxCalculation;

/**
 * is responsible for receiving the values from keyboard;
 * */

import com.utils.ConsoleInputsReceiver;

import java.math.BigDecimal;
import java.util.Scanner;

public class Receiver {


    ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    public double amountInput() {
        System.out.print("What is the order amount?");
        double amount = BigDecimal(console.insistOnDoublePositiveInput());
        return amount;
    }

    public String stateInput() {
        while (true) {
            System.out.print("What is the state?");
            Scanner sc = new Scanner(System.in);
            String state = sc.nextLine().toUpperCase();
            if (!(state.equals(null))) {
                return state;
            }
            System.out.println("Incorrect input!");
        }
    }

    private double BigDecimal(double inputNumber) {
        return  BigDecimal
                .valueOf(inputNumber)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}

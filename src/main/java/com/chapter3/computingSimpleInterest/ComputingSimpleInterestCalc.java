package com.chapter3.computingSimpleInterest;

import java.math.BigDecimal;

public class ComputingSimpleInterestCalc {
    ComputingSimpleInterestInput input = new ComputingSimpleInterestInput();

    double principalInput() {
        return BigDecimal(input.doubleCheck());
    }

    double rateInput() {
        return input.doubleCheck();
    }

    int yearsInput() {
        return input.integerCheck();
    }

    double calculateSimpleInterest(double principal, double rate, int years) {
        return BigDecimal(principal *( 1 + rate / 100 * years));
    }

    public double BigDecimal(double inputNumber) {
        return  BigDecimal
                .valueOf(inputNumber)
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}


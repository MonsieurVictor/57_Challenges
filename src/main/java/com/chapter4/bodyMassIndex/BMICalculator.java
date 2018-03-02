package com.chapter4.bodyMassIndex;

/**
 *  is responsible for calculating BMI
 **/

import java.math.BigDecimal;

public class BMICalculator {

    public double bmiCalculation(HumanProperties human) {
        return BigDecimal.valueOf (human.weight / Math. pow(human.height, 2))
                .setScale(2, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }
}

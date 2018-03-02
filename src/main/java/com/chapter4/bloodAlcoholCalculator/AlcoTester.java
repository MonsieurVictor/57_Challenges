package com.chapter4.bloodAlcoholCalculator;

/**
 *  is responsible for calculatin your BAC
 **/

import java.math.BigDecimal;

public class AlcoTester {

    public void testAlcoholInBlood(HumanParameters human) {

        human.alcoDigesting.bloodAlcoholContent = calculateBAC(human);

        String legalDriveMsg = "You can drive a car legally.";
        String notLegalDriveMsg = "It's not legal for you to drive a car. Call a taxi.";
        String BACMsg = this.composeBACMessage(human);

        if (human.alcoDigesting.bloodAlcoholContent >= 0.08) {
            System.out.println(BACMsg + notLegalDriveMsg);
        } else {
            System.out.println(BACMsg + legalDriveMsg);
        }
    }

    private double calculateBAC(HumanParameters human) {
        return BigDecimal.valueOf(( human.alcoDigesting.totalAlcoholDrunk /
                (human.weight * human.alcoDigesting.alcoholDistributionRatio)
                - 0.015 * human.alcoDigesting.hoursPassed) / 10)
                .setScale(3, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }

    private String composeBACMessage(HumanParameters human) {
        return "Your BAC is " + this.calculateBAC(human) + ". ";
    }
}

package com.chapter4.BloodAlcoholCalculator;

/**
 *  is responsible for receiving values from console
 **/

import com.utils.ConsoleInputsReceiver;

public class ParametersReceiver {

    ConsoleInputsReceiver console = new ConsoleInputsReceiver();

    private String promptSexMsg = "What is your sex? \n1. Male \n2. Female";
    private String promptWeightMsg = "How many kg do you weigh?";
    private String promptHoursPassedMsg = "How many hours have passed since the last drink?";

    HumanParameters promptHumanParameters(HumanParameters human) {

        while (true) {
            System.out.println(promptSexMsg);
            int sex = console.insistOnIntegerPositiveInput();
            if (sex == 1) {
                human.alcoDigesting.alcoholDistributionRatio = 0.73;
                break;
            }
            if (sex == 2) {
                human.alcoDigesting.alcoholDistributionRatio = 0.66;
                break;
            }
        }

        System.out.println(promptWeightMsg);
        human.weight = console.insistOnIntegerPositiveInput();

        System.out.println(promptHoursPassedMsg);
        human.alcoDigesting.hoursPassed = console.insistOnDoublePositiveInput();

        return human;
    }



}

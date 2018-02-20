package com.chapter4.BodyMassIndex;

/**
 *  is responsible for giving an advice about your BMI
 **/

public class bmiAdvisor {

    private String lightMassMsg = "You are too thin. You should eat more";
    private String normalMassMsg = "You are within the ideal weight range";
    private String heavyMassMsg = "You are overweight. You should see a doctor";
    public double adviceAboutBmi (HumanProperties human, String changed){

        changed = "changed";
        System.out.println("Your BMI is " + human.bodyWeightIndex);

        if (human.bodyWeightIndex <= 18.5) {
            System.out.println(lightMassMsg);
        } else if (human.bodyWeightIndex >= 25) {
            System.out.println(heavyMassMsg);
        } else {
            System.out.println(normalMassMsg);
        }
        return human.bodyWeightIndex;
    }
}

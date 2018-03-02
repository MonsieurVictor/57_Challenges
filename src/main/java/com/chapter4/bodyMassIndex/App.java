package com.chapter4.bodyMassIndex;

/**
 *  a simple program which calculates body mass index (BMI)
 **/

public class App {

    private ValuesReceiver receiver = new ValuesReceiver();
    private HumanProperties human= new HumanProperties();
    private bmiAdvisor advisor = new bmiAdvisor();
    private BMICalculator calculator = new BMICalculator();

    private void start() {
        human = receiver.promptValues(human);
        human.bodyWeightIndex = calculator.bmiCalculation(human);
        String changed = "not changed";
        advisor.adviceAboutBmi(human, changed);
        System.out.println(changed);
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}



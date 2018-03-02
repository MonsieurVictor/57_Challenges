package com.chapter4.temperatureConverter;

public class ChoiceChecker {

    public boolean checkChoice(String choice) {

        if (choice.equals("arrayRotation90Degrees")) {
            return true;

        } else if (choice.equals("f")) {
            return true;

        } else if (choice.equals("k")) {
            return true;

        } else {
            System.out.println("incorrect!");
            return false;
        }
    }
}

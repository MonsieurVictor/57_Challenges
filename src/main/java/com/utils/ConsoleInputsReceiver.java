package com.utils;

import java.util.Scanner;

/**
 * is responsible for taking data from console
 */
public class ConsoleInputsReceiver {

    Scanner scanner = new Scanner(System.in);

    public String getLastInput() {
        while(true) {
            String input = this.scanner.nextLine();
            if (!(input.equals("")||input.equals(null))){
                return input;}
            System.out.println("Please enter something!");
        }
    }

    public double insistOnDoublePositiveInput() {
        double inputDouble;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            String input = this.getLastInput();
            if (checker.isDoubleFormat(input)) {
                inputDouble = Double.parseDouble(input);
                if (inputDouble > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive double!");
        }
        return inputDouble;
    }

    public double insistOnDoubleInput() {
        double inputDouble;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            String input = this.getLastInput();
            if (checker.isDoubleFormat(input)) {
                inputDouble = Double.parseDouble(input);
                break;
                }
            System.out.println("Please enter a double!");
            }

        return inputDouble;
    }


    public int insistOnIntegerInput() {
        int inputInteger;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            String input = this.getLastInput();
            if (checker.isIntegerFormat(input)) {
                inputInteger = Integer.parseInt(input);
                break;
            }
            System.out.println("Please enter an integer!");
        }
        return inputInteger;
    }

    public int insistOnIntegerPositiveInput() {
        int inputInteger;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            String input = this.getLastInput();
            if (checker.isIntegerFormat(input)) {
                inputInteger = Integer.parseInt(input);
                if (inputInteger > 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer!");
        }
        return inputInteger;
    }

    public String insistOnEnglish() {
        String inputStr;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            inputStr = this.getLastInput();
            if (checker.isOnlyEnglishLetters(inputStr)) {
                break;
            }
            System.out.println("Please enter only English letters!");
        }
        return inputStr;
    }

    public String insistOnEnglishOrDigits() {
        String inputStr;
        InputTypeChecker checker = new InputTypeChecker();
        while (true) {
            inputStr = this.getLastInput();
            if (checker.isOnlyEnglishLettersOrDigits(inputStr)) {
                break;
            }
            System.out.println("Please enter only English letters and numbers!");
        }
        return inputStr;
    }


}

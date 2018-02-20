package com.chapter3.selfCheckout;

import java.util.Scanner;

public class SelfCheckoutInput {


    public int integerCheck() {
        int inputNumber;
        while (true) {
            Scanner sc = new Scanner(System.in);
            String inputNumberStr = sc.nextLine();
            if (checkStringIsInteger(inputNumberStr)) {
                inputNumber = Integer.parseInt(inputNumberStr);
                if (inputNumber >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer!");
        }
        return inputNumber;
    }


    boolean checkStringIsInteger(String string) {

        if (this.isNull(string)) {
            return false;
        }
        if (this.hasSingleMinus(string)) {
            return false;
        }
        int idx = this.hasFirstMinus(string) ? 1 : 0;

        if (this.hasDigits(string, idx)){
            return true;
        }
        return false;
    }


    public double doubleCheck() {
        double inputDouble;
        while (true) {
            Scanner sc = new Scanner(System.in);
            String inputNumberStr = sc.nextLine();
            if (checkStringIsDouble(inputNumberStr)) {
                inputDouble = Double.parseDouble(inputNumberStr);
                if (inputDouble >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive double!");
        }
        return inputDouble;
    }

    /**
     * -1 - true
     * -2356 - true
     * 1 - true
     * 2456 - true
     * 234.466 - true
     * -234.567 - true
     * .7889 - true
     * -.67889 -true
     * 677.78899.4567 - false
     * 67.  - false
     * "-" - false
     *
     * @param string
     * @return
     */
    boolean checkStringIsDouble(String string) {
        if (this.isNull(string)) {
            return false;
        }
        if (this.hasSingleMinus(string)) {
            return false;
        }
        // check is there are dots
        //  if amount > 1 - return false
        // if amount == 1
        //  check that its position is not the last
        // idx = this.setScannerStart  - не понял, что это :(

        if (this.hasMultipleDots(string)) {
            return false;
        }
        if (theDotIsTheLast(string)) {
            return false;
        }
        int idx = this.hasFirstMinus(string) ? 1 : 0;
        if (this.hasDigitsOrDot(string, idx)) {
            return true;
        }
        return false;
    }

    boolean isNull(String nullString) {
        if (nullString == null || nullString.length() == 0) {
            return true;
        }
        return false;
    }

    boolean hasSingleMinus(String string) {
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    boolean hasFirstMinus(String string) {
        if (string.charAt(0) == '-') {
                return true;
            }
            return false;
        }

    boolean hasDigitsOrDot(String string, int idx){
        for (int i = idx; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!((c >= '0' && c <= '9') || c == '.')) {
                return false;
            }
        }
        return true;
    }

    boolean hasDigits(String string, int idx){
        for (int i = idx; i < string.length(); i++) {
            char c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    boolean theDotIsTheLast (String string) {
                if (string.charAt(string.length()-1) == '.') {
                    return true;
                }
            return false;
    }

    boolean hasMultipleDots (String string) {
        int i, numberOfDots = 0;
        char c;
        for (i = 1; i < string.length(); i++) {
            c = string.charAt(i);
            if (c == '.') {
                numberOfDots++;
            }
            if (numberOfDots > 1) {
                return true;
            }
        }
        return false;
    }
}


package com.utils;

public class InputTypeChecker {

    private boolean isNull(String input) {
        return input == null || input.length() == 0;
    }

    private boolean isSingleMinus(String input) {
        return input.charAt(0) == '-' && input.length() == 1;
    }

    private boolean hasMultipleDots (String input) {
        int firstOccurrenceOfDot = input.indexOf('.');
        return (firstOccurrenceOfDot != -1) && (firstOccurrenceOfDot != input.lastIndexOf('.'));
    }

    private boolean hasFirstMinus(String input) {
        return input.charAt(0) == '-';
    }

    private boolean isOnlyDigits(String input){
        int idx = this.hasFirstMinus(input) ? 1 : 0;
        for (int i = idx; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    private boolean isOnlyDigitsAndDots(String input){
        int idx = this.hasFirstMinus(input) ? 1 : 0;
        for (int i = idx; i < input.length(); i++) {
            char c = input.charAt(i);
            if ((c >= '0' && c <= '9') || c == '.') {
                return true;
            }
        }
        return false;
    }

    boolean theDotIsTheLast (String string) {
        if (string.charAt(string.length()-1) == '.') {
            return true;
        }
        return false;
    }

    public boolean isIntegerFormat  (String input) {
        if (this.isNull(input) || this.isSingleMinus(input)) {
            return false;
        }
        return this.isOnlyDigits(input);
    }

    public boolean hasSpaces (String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                return true;
            }
        }
        return false;
    }

    public boolean isDoubleFormat(String input) {
        if (this.isNull(input) || this.isSingleMinus(input) || this.hasSpaces(input) || this.hasMultipleDots(input)||this.theDotIsTheLast(input)) {
            return false;
        }
        return this.isOnlyDigitsAndDots(input);
    }

    public boolean isOnlyEnglishLettersOrDigits(String input){
        return input.matches("^[a-zA-Z0-9]+$");
    }

    public boolean isOnlyEnglishLetters(String input){
        return input.matches("^[a-zA-Z]+$");
    }
}

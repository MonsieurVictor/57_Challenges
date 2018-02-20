package com.chapter4.TaxCalculation;

/**
 * is responsible for checking if the state is Wisconsin
 * */

public class StateChecker {
    public boolean isWisconsin(String state) {
        return (state.equals("WI") || state.equals("WISCONSIN")) ? true : false;
    }
}

package com.reflection.lookup;

public class Subtract extends Operation{

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        this.result = firstOperand - secondOperand;
        return this.result;
    }
}

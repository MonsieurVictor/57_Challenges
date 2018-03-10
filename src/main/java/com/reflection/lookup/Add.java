package com.reflection.lookup;

public class Add extends Operation {

    @Override
    public int calculate(int firstOperand, int secondOperand) {
        this.result = firstOperand + secondOperand;
        return this.result;
    }

}

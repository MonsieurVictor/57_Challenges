package com.reflection.lookup;

public abstract class Operation {

    protected int result;

    public abstract int calculate(int firstOperand, int secondOperand);

    protected void printResult() {
        System.out.println("result = " + this.result);
    }

}

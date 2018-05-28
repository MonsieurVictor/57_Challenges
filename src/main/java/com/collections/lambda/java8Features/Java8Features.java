package com.collections.lambda.java8Features;

public class Java8Features {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(a);
        }
    }
    public static void main(String[] args) {
        Java8Features app = new Java8Features();
        app.start();
    }
    private void start () {


    }

}

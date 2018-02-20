package com.chapter3.paintCalculation;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * responsible for
 */
public class PaintCalcShape {

    protected double rectangleAreaReceiver(String shapePartName) {
        System.out.print("What is the " + shapePartName + " length?");
        double length = this.intNumberReceiver();
        System.out.print("What is the " + shapePartName + " width? ");
        double width = this.intNumberReceiver();
        return this.ceilArea(length * width);
    }

    double ceilArea(double rawArea) {
        return BigDecimal
                .valueOf(rawArea)
                .setScale(0, BigDecimal.ROUND_CEILING)
                .doubleValue();
    }

    protected double rectangleAreaReceiver() {
        return this.rectangleAreaReceiver("rectangle");
    }

    double intNumberReceiver() {
        for ( ; ; ) {
            Scanner scanner = new Scanner(System.in);
            int userInput;
            if (scanner.hasNextInt() && (userInput = scanner.nextInt()) > 0) {
                return userInput;
            }
            System.out.println("Please enter a positive number!");
        }
    }

}

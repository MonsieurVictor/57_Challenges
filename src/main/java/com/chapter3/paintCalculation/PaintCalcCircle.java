package com.chapter3.paintCalculation;

public class PaintCalcCircle extends PaintCalcShape{

    double areaCalculation() {
        System.out.print("What is the diameter of a room? ");
        double diameter = this.intNumberReceiver();
        return this.ceilArea(Math.pow(diameter, 2) * Math.PI / 4);
    }
}




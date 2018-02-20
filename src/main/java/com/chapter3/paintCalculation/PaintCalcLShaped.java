package com.chapter3.paintCalculation;

public class PaintCalcLShaped extends PaintCalcShape {

    double areaCalculation() {
        return this.rectangleAreaReceiver("total") -  this.rectangleAreaReceiver("deducted");
    }
}

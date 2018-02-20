package com.chapter3.paintCalculation;



import java.math.*;
import java.util.Scanner;

/**
 *  calculating area of rooms different shapes and gallons required to paint this area
 */
public class PaintCalc {
    public static void main(String[] args) {

        int squareFeetsPerGallon = 350;
        String shape;
        double area;

        for (; ; ) {
            System.out.print("Is the room rectangle, circle or L-shaped? \n" +
                    " Type \"r\" , \"c\" or \"l\" and press \"Enter\" ");
            Scanner sc = new Scanner(System.in);
            shape = sc.nextLine();
            if (shape.equals("r")) {
                shape = "a rectangle";
                PaintCalcRectangle squareRoom = new PaintCalcRectangle();
                area = squareRoom.areaCalculation();
                break;
            } else if (shape.equals("c")) {
                shape = "a circle";
                PaintCalcCircle RoundRoom = new PaintCalcCircle();
                area = RoundRoom.areaCalculation();
                break;
            } else if (shape.equals("l")) {
                shape = "an L-shaped";
                PaintCalcLShaped lShape = new PaintCalcLShaped();
                area = lShape.areaCalculation();
                break;
            } else {
                System.out.println("Incorrect intNumberReceiver!");
            }
        }


        /*PaintCalcShape n = new PaintCalcShape();
        double roundGallons = n.ceilArea(area / squareFeetsPerGallon);
        Boolean isSingleGallon = BigDecimal
                        .valueOf(roundGallons)
                        .compareTo(BigDecimal
                        .valueOf(1)) == 0;
        */
        BigDecimal roundGallons = BigDecimal
                .valueOf( area / squareFeetsPerGallon)
                .setScale(0, BigDecimal.ROUND_CEILING);
        Boolean isSingleGallon = BigDecimal
                .valueOf( area / squareFeetsPerGallon)
                .setScale(0, BigDecimal.ROUND_CEILING)
                .compareTo(BigDecimal.valueOf(1)) == 0;
        String verb = isSingleGallon ? " gallon " : " gallons ";
        System.out.print(
            "You will need to purchase " + roundGallons + verb + "of paint\n" +
            "to cover " + area + " square feet of " + shape + " room"
        );
    }
}




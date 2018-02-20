package com.chapter3;

import java.math.*;

import java.util.Scanner;

// area calculation of a rectangle room and conversion from feets to meters and vice versa

public class AreaOfRoom {
    public static void main (String [] args) {
        int length, width;
        String flag, flagConverted;
        double  area, areaConverted;
        double constant = 0.09290304;

        for ( ; ; ) {
            System.out.print("Feet or meters? Type \"f\" or \"m\" and press \"Enter\" ");
            Scanner sc = new Scanner(System.in);
            flag = sc.nextLine();
            if (flag.equals("f")) {
                flag = "feet";
                flagConverted = "meters";
                System.out.println("You have chosen " + flag + ". ");
                break;}
            else if (flag.equals("m")) {
                flag = "meters";
                flagConverted = "feet";
                System.out.print("You have chosen " + flag + ". ");
                break;}
            else  {System.out.println("Incorrect intNumberReceiver!");}
                }

        System.out.print("What is the length of the room? ");
            for ( ; ; ) {
                Scanner sc = new Scanner(System.in);
                if (sc.hasNextInt()) {
                    length = sc.nextInt();
                    if (length >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }
        System.out.print("What is the width of the room? ");

        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                width = sc.nextInt();
                if (width >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive integer number!");
        }

        System.out.println("You entered dimensions of " + length
                + " " + flag + " by " + width + " " +  flag + ". " );
        area = length * width;
        if (flag.equals("feet")) {
            areaConverted = area * constant;
        }
        else {
                        areaConverted = area / constant;
        }
        BigDecimal roundArea = BigDecimal.valueOf(areaConverted);
        roundArea = roundArea.setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.print("The area is " + area + " square " + flag + ";\n"
                + roundArea + " square " + flagConverted + ".");

    }

}

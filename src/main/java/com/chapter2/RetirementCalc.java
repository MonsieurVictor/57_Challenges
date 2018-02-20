package com.chapter2;

import java.util.Calendar;

import java.util.Scanner;

public class RetirementCalc {

    public static void main(String[] args) {

        System.out.print("What is your current age? ");
        int Age;
        int Retire;
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            String AgeStr = sc.nextLine();
            if (checkStringIsNumber(AgeStr)) {
                Age = Integer.parseInt(AgeStr);
                if (Age >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive number!");
        }

        System.out.print("At what age would you like to retire ?");
        for ( ; ; ) {
            Scanner sc = new Scanner(System.in);
            String RetireStr = sc.nextLine();
            if (checkStringIsNumber(RetireStr)) {
                Retire = Integer.parseInt(RetireStr);
                if (Retire >= 0) {
                    break;
                }
            }
            System.out.println("Please enter a positive number!");
        }

        int LastAge = Retire - Age;
        if (LastAge <= 0) {
            System.out.println("You can already retire!");
        }
        else {
            System.out.println("You have " + LastAge + " years left until you can retire");

            Calendar calendar = Calendar.getInstance();
            int Year = calendar.get(Calendar.YEAR);
            int LastYear = Year + LastAge;
            System.out.print("It's " + Year + " , so you can retire in " + LastYear + ".");
        }
    }

    public static boolean checkStringIsNumber(String string) {
        if (string == null || string.length() == 0) return false;
        int i = 0;
        if (string.charAt(0) == '-') {
            if (string.length() == 1) {
                return false;
            }
            i = 1;
        }
        char c;
        for (; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
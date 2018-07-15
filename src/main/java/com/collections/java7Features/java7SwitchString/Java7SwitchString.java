package com.collections.java7Features.java7SwitchString;


    /**  String in Switch Statement
    In Java 7, Java allows you to use string objects in the expression of switch statement.
    In order to use string, you need to consider the following points:

    1.It must be only String object.
    Object game = "Hockey"; // It is not allowed
    String game = "Hockey"; // It is OK.
    2.String object is case sensitive.
    "Hickey" and "hocker" are not equal.
    3. No Null object
    Be careful while passing string object, passing a null object cause to NullPointerException.*/

public class Java7SwitchString {
    public static void main(String[] args) {
        String game = "Cricket";
        switch (game) {
            case "Hockey":
                System.out.println("Let's play Hockey");
                break;
            case "Cricket":
//                System.out.println("Let's play Cricket");
                break;
            case "Football":
                System.out.println("Let's play Football");

        }

        /**  Output:
         Let's play Cricket
         */

        String game2 = "Card-Games";
        switch (game2) {
            case "Hockey":
            case "Cricket":
            case "Football":
                System.out.println("This is a outdoor game");
                break;
            case "Chess":
            case "Card-Games":
            case "Puzzles":
            case "Indoor basketball":
                System.out.println("This is a indoor game");
                break;
            default:
                System.out.println("What game it is?");
        }

        /**Output:
         This is a indoor game*/
    }
}

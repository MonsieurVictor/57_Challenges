package com.chapter4.BloodAlcoholCalculator;

import com.utils.ConsoleInputsReceiver;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

/**
 *  is responsible for calculating the total alcohol drunk
 **/

public class AlcoholicBar {

    private ConsoleInputsReceiver console= new ConsoleInputsReceiver();
    private HumanParameters drunkAlcohol = new HumanParameters();
    private DrinksDBDriver driver = new DrinksDBDriver();
    String[][] alcoholicArray;

    private String welcomeMsg = "╔══╗╔╗  ╔══╗╔══╗  ╔══╗ ╔══╗╔═══╗\n" +
            "║╔╗║║║  ║╔═╝║╔╗║  ║╔╗║ ║╔╗║║╔═╗║\n" +
            "║╚╝║║║  ║║  ║║║║  ║╚╝╚╗║╚╝║║╚═╝║\n" +
            "║╔╗║║║  ║║  ║║║║  ║╔═╗║║╔╗║║╔╗╔╝\n" +
            "║║║║║╚═╗║╚═╗║╚╝║  ║╚═╝║║║║║║║║║\n" +
            "╚╝╚╝╚══╝╚══╝╚══╝  ╚═══╝╚╝╚╝╚╝╚╝";
    private String whatToDrinkMsg = "Welcome! What would you like to drink?" ;
    private String onceMoreMsg = "What else would you like?\n" +
            "0. I don,t want to drink anymore.";


    public HumanParameters enterAlcoholicBar() throws IOException, AWTException, InterruptedException {

        System.out.println(welcomeMsg);
        System.out.println(whatToDrinkMsg);
        alcoholicArray = driver.getBufferArray();
        while (true) {
            driver.printDrinks();
            while (true) {
                int choice = console.insistOnIntegerInput();
                if (choice > 0 && choice <= alcoholicArray.length) {
                    drunkAlcohol.alcoDigesting.totalAlcoholDrunk += letsDrink(choice);
                    break;
                } else if (choice == 0) {
                    return drunkAlcohol;
                } else {
                    System.out.println("incorrect input!");
                }
            }

//            click(75,700);
            Thread.sleep(500);
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(welcomeMsg);
            System.out.println("You have already drunk " + drunkAlcohol.alcoDigesting.totalAlcoholDrunk +
                    " grams of pure alcohol.");
            System.out.println(onceMoreMsg);
        }
    }

    public int letsDrink(int choice){
        int fortress = Integer.parseInt(alcoholicArray[choice-1][2]);
        System.out.println("How many grams of " + alcoholicArray[choice-1][1] + " to pour?");
        int volume = console.insistOnIntegerPositiveInput();
        return volume*fortress/100;
    }
    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}

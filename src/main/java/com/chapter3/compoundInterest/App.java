package com.chapter3.compoundInterest;

import com.utils.ConsoleInputsReceiver;


/**
 *  Determining Compound Interest - the value of an investment
 compounded over time. The container should ask for the
 starting amount, the number of years to invest, the interest
 rate, and the number of periods per year to compound.
 */

public class App {

    ConsoleInputsReceiver receiver = new ConsoleInputsReceiver();
    String appInputDesc = "Would you like to calculate the compound interest\n" +
        " or the initial amount you’d need to invest to reach a specific goal?\n" +
        " Type \"arrayRotation90Degrees\" or \"g\" and press Enter!";


    public void start() {

        //    ValuesContainer container = (new Receiver()).getContainer(); не понял, как использовать в этом классе =(
        System.out.print(this.appInputDesc);

        while (true) {
            String purpose = this.receiver.getLastInput();
            if (purpose.equals("arrayRotation90Degrees")) {
                FinalAmountOutput finalAmount = new FinalAmountOutput();
                finalAmount.finalAmountOutput();
                break;
            } else if (purpose.equals("g")) {
                InitialAmountOutput initialAmount = new InitialAmountOutput();
                initialAmount.initialAmountOutput();
                break;
            } else {
                System.out.println("Incorrect input!");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}

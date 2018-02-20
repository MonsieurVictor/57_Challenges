package com.chapter4.PasswordValidation;


/**
 *  a simple program which validates user login/password credentials.
 *
 * */

public class App {

    private CredentialsReceiver receiver = new CredentialsReceiver();
    private CredentialsChecker checker = new CredentialsChecker();
    private String rightMessage = "Welcome, ";
    private String wrongMessage = "I don't know you. Please try again. Tries left: ";
    private String noTriesLeft = "You have used all attempts! Good bye!";
    private int numberOfTries = 3;

    private void start() {
        while (true) {
            Credentials inputtedCreds = this.receiver.promptCredentials();
            Boolean result = checker.checkCredentialsMatch(inputtedCreds);
            if (result) {
                System.out.println(rightMessage + inputtedCreds.getLogin() + "!");
                break;
            }else if (numberOfTries > 1) {
                numberOfTries--;
                System.out.println(wrongMessage + numberOfTries );
            }else {
                System.out.println(noTriesLeft);
                break;
            }
        }
    }

    public static void main (String[] args){
        App app = new App();
        app.start();
    }
}

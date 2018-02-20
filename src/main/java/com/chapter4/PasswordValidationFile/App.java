package com.chapter4.PasswordValidationFile;


import java.io.IOException;

/**
 *  a simple program which validates user login/password credentials and create new credentials.
 *
 * */

public class App {

    private PromptSignUp promptSignUp = new PromptSignUp();
    private CredentialsReceiver receiver = new CredentialsReceiver();
    private CredentialsChecker checker = new CredentialsChecker();
    private String rightMessage = "Welcome, ";
    private String wrongMessage = "I don't know you. Please try again. Tries left: ";
    private String noTriesLeft = "You have used all attempts! Good bye!";

    private int numberOfTries = 3;

    private void start() throws IOException {
        promptSignUp.promptSignUp();
        while (true) {
            Credentials inputtedCreds = this.receiver.promptCredentials();

            Boolean result = checker.checkCredentialsMatch(inputtedCreds);
            if (result) {
                System.out.println(rightMessage + inputtedCreds.getInputLogin() + "!");
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

    public static void main (String[] args) throws IOException{
        App app = new App();
        app.start();
    }
}

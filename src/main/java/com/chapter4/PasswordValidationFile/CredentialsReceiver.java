package com.chapter4.PasswordValidationFile;

import com.utils.ConsoleInputsReceiver;

/**
* is responsible for receiving values from keyboard
*
* */

public class CredentialsReceiver {

    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private String promptLogin = "Sign in using your login and password.\nEnter your login:";
    private String promptPassword = "Enter your password (case sensitive): ";

    public Credentials promptCredentials() {
        Credentials promptedCreds = new Credentials();
        System.out.println(this.promptLogin);
        promptedCreds.setInputLogin(this.console.getLastInput()) ;
        System.out.println(this.promptPassword);
        promptedCreds.setInputPassword(this.console.getLastInput());
        return promptedCreds;
    }
}
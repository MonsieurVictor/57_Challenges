package com.chapter4.PasswordValidation;

import com.utils.ConsoleInputsReceiver;

/**
* is responsible for receiving values from keyboard
*
* */

public class CredentialsReceiver {

    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private String promptLogin = "What is the login?";
    private String promptPassword = "What is the password? (case sensitive)";

    public Credentials promptCredentials() {
        Credentials creds = new Credentials();
        System.out.println(this.promptLogin);
        creds.setLogin(this.console.getLastInput()) ;
        System.out.println(this.promptPassword);
        creds.setPassword(this.console.getLastInput());
        return creds;
    }
}



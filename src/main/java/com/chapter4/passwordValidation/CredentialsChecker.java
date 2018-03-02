package com.chapter4.passwordValidation;

import java.util.Comparator;

/**
 * is responsible for validating the password
 *
 * */

public class CredentialsChecker {

    private DatabaseDriver driver = new DatabaseDriver();

    public Boolean checkCredentialsMatch(Credentials creds) {
        String login = creds.getLogin();
        String pass = creds.getPassword();

        return driver.isThereLoginPasswordMatch(login, pass, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.toLowerCase().equals(s2.toLowerCase())) return 0;
                return 1;
            }
        });
    }
}

package com.chapter4.PasswordValidationFile;

import java.io.IOException;
import java.util.Comparator;

/**
 * is responsible for validating the password
 *
 * */

public class CredentialsChecker {

    private DBDriver driver = new DBDriver();

    public Boolean checkCredentialsMatch(Credentials creds) throws IOException {

        return driver.isThereLoginPasswordMatch(creds.getInputLogin(), creds.getInputPassword(), new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.toLowerCase().equals(s2.toLowerCase())) return 0;
                return 1;
            }
        }) ;
    }
}

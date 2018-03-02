package com.chapter4.passwordValidationFile;

import com.utils.ConsoleInputsReceiver;
import com.utils.InputTypeChecker;

import java.io.IOException;
import java.util.Comparator;

/**
 * is responsible for entering new credentials to the DB.txt
 *
 * */



public class SignUpper {

    private DBDriver driver = new DBDriver();
    private DBWriter writer = new DBWriter();
    private InputTypeChecker checker = new InputTypeChecker();
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();

    private String createLogin = "Please enter new login (English letters and digits only) :";
    private String createNameMsg = "Please enter your name (English letters only):";
    private String createPasswordMsg = "Please enter new password(English letters and digits only):";
    private String isNotUniqueLogin = "This login already exists! Please enter another login.";
    private String isLoginFreeMsg = "This login is free.";

    private String newLogin;
    private String newPassword;
    private String newName;

    public void loginCreation() throws IOException {
        writer.makeDBDirectory();
        writer.makeDBtxt();
        while (true) {

            System.out.println(createLogin);
            newLogin = console.insistOnEnglishOrDigits().toLowerCase();

            if (isUniqueLogin(newLogin)) {
                System.out.println(isLoginFreeMsg);
                System.out.println(createNameMsg);
                newName = console.insistOnEnglish();

                System.out.println(createPasswordMsg);
                newPassword = console.insistOnEnglishOrDigits();

                writer.writeNewCredentials(newName, newLogin, newPassword);
                break;
            } else {
                System.out.println(isNotUniqueLogin);
            }
        }
    }

    public Boolean isUniqueLogin(String newLogin) throws IOException {
        return !driver.isThereLoginMatch(
            newLogin,
            new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    if (s1.toLowerCase().equals(s2.toLowerCase())) return 0;
                    return 1;
                }
            }
        );
    }
}


   
   
package com.chapter4.PasswordValidationFile;

import com.utils.ConsoleInputsReceiver;
import java.io.IOException;


/**
 * is responsible for prompting if we want to sing up
 *
 * */

public class PromptSignUp {

    private String signUpMessage = "Do you want to sign up? (Y/N) ";
    private ConsoleInputsReceiver console = new ConsoleInputsReceiver();
    private SignUpper signUp = new SignUpper();

    public void promptSignUp() throws IOException {
        while(true){
            System.out.println (signUpMessage);
            String choice = this.console.getLastInput();
           if(choice.equals("Y")|| choice.equals("y")){
               signUp.loginCreation();
               break;
           } else if(choice.equals("N")|| choice.equals("n")){
               break;
           }
           else{}
        }
    }
}

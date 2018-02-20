package com.chapter4.LegalDrivingAge;

import java.io.IOException;

/**
 *  a simple program which checks legal driving age in different countries.
 *
 **/

public class App {

    Receiver receiver = new Receiver();
    LegalChecker checker = new LegalChecker();

    private void start() throws IOException {
       checker.checkAge(this.receiver.promptAge());
    }

    public static void main (String[] args) throws IOException {
        App app = new App();
        app.start();
    }
}

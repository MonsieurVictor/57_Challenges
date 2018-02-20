package com.chapter4.PasswordValidation;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * is responsible for keeping the login/password
 * this is imitation of DBtxt so we want to keep is isolated from everything
 * but a kind of DBConnector
 *
 * */


public class Database {

    private String [][] databaseArray = {
            {"Tymur", "asd"},
            {"Victor", "dsa"},
            {"Alex", "12"}
            // {tymur, qwe123}
            // {tymur, asd123}
    };

    public String [][] getArray(){
        return databaseArray;
    }

}

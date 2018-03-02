package com.chapter4.passwordValidation;

import java.util.Comparator;

/**
 * is responsible for getting the login/password
 *
 * */

public class DatabaseDriver {

    private Database database = new Database();
    private String [][] bufferArray;

    public DatabaseDriver () {
        bufferArray = database.getArray();
    }

    private int getTotalRows(){
        return bufferArray.length;
    }

    private String getLoginFromDB(int idx){
        return bufferArray[idx][0];
    }

    private String getPasswordFromDB(int idx){
        return bufferArray[idx][1];
    }

    public Boolean isThereLoginPasswordMatch(String login, String password, Comparator<String> matcher) {
        for (int i = 0; i < this.getTotalRows(); i ++) {
            Boolean loginMatch = matcher.compare(login, getLoginFromDB(i)) == 0;
            Boolean passMatch = matcher.compare(password, getPasswordFromDB(i)) == 0;
            if (loginMatch && passMatch) return true;
        }
        return false;
    }










}


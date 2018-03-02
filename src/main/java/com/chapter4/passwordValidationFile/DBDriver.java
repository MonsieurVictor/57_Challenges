package com.chapter4.passwordValidationFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * is responsible for getting the login/password and matching the crredentials
 *
 * */

public class DBDriver {

    private DBReader dbReader = new DBReader();
    private String [][] bufferArray;

    //private DBWriter writer = new DBWriter();  // STACKOVERFLOW!!!

    ArrayList <String []> bufferArrayList = new ArrayList();

    public void getBufferArrayList() throws IOException {
        this.bufferArrayList = dbReader.getArrayList();
        bufferArray = new String [bufferArrayList.size()][4];
        String[] bufferStr;
        for (int i = 0; i < bufferArrayList.size(); i++) {
            bufferStr = bufferArrayList.get(i);
            for (int j = 0; j<bufferStr.length; j++) {
                bufferArray [i][j] = bufferStr [j];
            }
        }
    }

//    public DBDriver () {
//        bufferArray = dbReader.getBufferArrayList();
//    }

    public int getTotalRows (){
        return bufferArray.length;
    }

    private String getDBLogin(int idx){
        return bufferArray[idx][1];
    }

    private String getDBPassword(int idx){
        return bufferArray[idx][3];
    }

    public Boolean isThereLoginPasswordMatch(String login, String password, Comparator<String> matcher) throws IOException {
        DBWriter writer = new DBWriter(); //
        writer.makeDBDirectory();
        writer.makeDBtxt();
        getBufferArrayList();
        for (int i = 0; i < this.getTotalRows(); i ++) {
            Boolean loginMatch = matcher.compare(login, getDBLogin(i)) == 0;
            Boolean passMatch = matcher.compare(password, getDBPassword(i)) == 0;
            if (loginMatch && passMatch) return true;
        }
        return false;
    }

    public Boolean isThereLoginMatch (String login, Comparator<String> matcher) throws IOException {

        getBufferArrayList();
        for (int i = 0; i < this.getTotalRows(); i ++) {
            Boolean loginMatch = matcher.compare(login, getDBLogin(i)) == 0;
            if (loginMatch) return true;
        }
        return false;
    }
}

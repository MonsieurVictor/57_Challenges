package com.chapter4.PasswordValidation;

/**
 * for representing credentials model
 */
public class Credentials {

    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

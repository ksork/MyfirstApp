package ru.inettel.ksork.myfirstapplication;

import java.io.Serializable;

/**
 * Created by ksork on 07.02.18.
 */

public class User implements Serializable{

    private String mLogin;
    private String mPassword;

    public User(String Login, String Password) {
        this.mLogin = Login;
        this.mPassword = Password;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String mLogin) {
        this.mLogin = mLogin;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}

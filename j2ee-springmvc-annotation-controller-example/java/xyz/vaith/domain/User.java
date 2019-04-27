package xyz.vaith.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String password;
    private String username;
    private String loginname;

    public User() {
        super();
    }

    public User(String loginname, String password, String username ) {
        this.password = password;
        this.username = username;
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    @Override
    public String toString() {
        return "User{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", loginname='" + loginname + '\'' +
                '}';
    }
}

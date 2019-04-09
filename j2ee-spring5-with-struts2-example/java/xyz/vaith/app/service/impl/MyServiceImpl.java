package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.MyService;

public class MyServiceImpl implements MyService {
    @Override
    public int validLogin(String username, String password) {
        if (username.equalsIgnoreCase("wee") && password.equals("123")) {
            return 99;
        }
        return -1;
    }
}

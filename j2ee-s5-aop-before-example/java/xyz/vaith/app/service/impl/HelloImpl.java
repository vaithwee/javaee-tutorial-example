package xyz.vaith.app.service.impl;

import org.springframework.stereotype.Component;
import xyz.vaith.app.service.Hello;

@Component("hello")
public class HelloImpl implements Hello {
    @Override
    public Integer addUser(String username, String password) {
        System.out.println("executing addUser method: username = " + username + ", password = " + password );
        return 20;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("executing deleteUser method: id = " + id);
    }

    @Override
    public void removeUser() throws Throwable {
        int i = 1 / 0;
    }
}

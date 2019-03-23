package xyz.vaith.app.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import xyz.vaith.app.dao.UserDao;

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("UserDaoImpl save method executing");
    }
}

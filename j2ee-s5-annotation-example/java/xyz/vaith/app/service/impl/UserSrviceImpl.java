package xyz.vaith.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.vaith.app.dao.UserDao;
import xyz.vaith.app.service.UserService;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserSrviceImpl implements UserService {
//    @Autowired
//    @Qualifier(value = "userDao")
    @Resource(name = "userDao")
    public UserDao userDao;
    @Override
    public void save() {
        System.out.println("UserSrviceImpl save method executing");
        userDao.save();
    }
}

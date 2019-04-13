package xyz.vaith.app.service.impl;

import xyz.vaith.app.dao.UserDao;
import xyz.vaith.app.domain.User;
import xyz.vaith.app.service.UserService;
import xyz.vaith.app.util.MD5Utils;

import javax.transaction.Transactional;

@Transactional
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void regist(User user) {
        user.setPassword(MD5Utils.md5(user.getPassword()));
        user.setState(1);
        userDao.save(user);
    }

    @Override
    public User login(User user) {
        user.setPassword(MD5Utils.md5(user.getPassword()));
        User existUser = userDao.login(user);
        return existUser;
    }
}

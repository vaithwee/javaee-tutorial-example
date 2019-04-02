package xyz.vaith.app.service.impl;

import org.springframework.stereotype.Component;
import xyz.vaith.app.domian.User;
import xyz.vaith.app.service.UserDao;

@Component("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
}

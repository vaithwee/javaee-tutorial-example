package xyz.vaith.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.vaith.domain.User;
import xyz.vaith.mapper.UserMapper;
import xyz.vaith.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {
        return userMapper.findWithLoginNameAndPassword(username, password);
    }
}

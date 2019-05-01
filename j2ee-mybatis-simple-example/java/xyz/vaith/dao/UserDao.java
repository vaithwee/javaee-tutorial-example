package xyz.vaith.dao;

import xyz.vaith.domain.User;

import java.util.List;

public interface UserDao {
    User findUserById(Integer id);
    List<User> findUsersByName(String username);
    void save(User user);
}

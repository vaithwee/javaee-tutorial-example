package xyz.vaith.service;

import xyz.vaith.domain.User;

public interface UserService {
    User login(String username, String password);
}

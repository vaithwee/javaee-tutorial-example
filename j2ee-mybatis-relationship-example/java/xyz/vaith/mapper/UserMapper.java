package xyz.vaith.mapper;

import xyz.vaith.domain.User;

public interface UserMapper {
    User selectUserById(Integer id);
}

package xyz.vaith.mapper;

import xyz.vaith.domain.Person;

public interface PersonMapper {
    Person selectPersonById(Integer id);
}

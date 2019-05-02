package xyz.vaith.mapper;

import xyz.vaith.domain.Student;

public interface StudentMapper {
    Student selectStudentByClazzId(Integer id);
    Student selectStudentById(Integer id);
}

package xyz.vaith.test;

import org.apache.ibatis.session.SqlSession;
import xyz.vaith.domain.Clazz;
import xyz.vaith.domain.Student;
import xyz.vaith.domain.User;
import xyz.vaith.util.SqlSessionFactory;

import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1() {
        SqlSession session = SqlSessionFactory.getSession();
        User user = new User("jack", "男", 18);
        session.insert("xyz.vaith.mapper.UserMapper.saveUser", user);
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testSelect() {
        SqlSession session = SqlSessionFactory.getSession();
        User user =session.selectOne("xyz.vaith.mapper.UserMapper.selectedUser", 5);
        System.out.println(user);
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testUpdate() {
        SqlSession session = SqlSessionFactory.getSession();
        User user = session.selectOne("xyz.vaith.mapper.UserMapper.selectedUser", 5);
        user.setName("tom");
        user.setAge(25);
        session.update("xyz.vaith.mapper.UserMapper.modifyUser", user);
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testDelete() {
        SqlSession session = SqlSessionFactory.getSession();
        session.delete("xyz.vaith.mapper.UserMapper.removeUser", 5);
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testSelectUserMap() {
        SqlSession session = SqlSessionFactory.getSession();
        List<Map<String, Object>> list = session.selectList("xyz.vaith.mapper.UserMapper.selectUserMap");
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
        }
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testResultMap2() {
        SqlSession session = SqlSessionFactory.getSession();
        List<User> list = session.selectList("xyz.vaith.mapper.UserMapper.selectUserMap2");
        for (User user : list) {
            System.out.println(user);
        }
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testSelectStudnt() {
        SqlSession session = SqlSessionFactory.getSession();
        List<Student> list = session.selectList("xyz.vaith.mapper.UserMapper.selectStudent");
        for (Student student : list) {
            System.out.println(student);
        }
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void testSelectClazz() {
        SqlSession session = SqlSessionFactory.getSession();
        List<Clazz> list = session.selectList("xyz.vaith.mapper.UserMapper.selectClazz");
        for (Clazz clazz : list) {
            System.out.println(clazz);
            for (Student student : clazz.getStudents()) {
                System.out.println(student);
            }
        }
        session.close();
    }
}

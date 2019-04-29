package xyz.vaith.app;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import xyz.vaith.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1() throws Exception {
        System.out.println("hello world");
        SqlSession session = getSqlSession();
        User user = session.selectOne("xyz.vaith.domain.User.findUserById", 1);
        System.out.println(user);
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void test2() throws Exception {
        System.out.println("hello world");
        SqlSession session = getSqlSession();
        List<User> list = session.selectList("xyz.vaith.domain.User.findUserByName", "张");
        for (User user : list) {
            System.out.println(user);
        }
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void test3()  throws Exception {
        SqlSession session = getSqlSession();
        User user = new User();
        user.setUsername("wee");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("深圳福田");
        session.insert("xyz.vaith.domain.User.save", user);
        session.commit();

        System.out.println(user);
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void test4() throws Exception {
        System.out.println("hello world");
        SqlSession session = getSqlSession();
        User user = session.selectOne("xyz.vaith.domain.User.findUserById", 1);
        System.out.println(user);
        user.setAddress("福建厦门");
        session.update("xyz.vaith.domain.User.update", user);
        session.commit();
        session.close();
    }

    @org.junit.jupiter.api.Test
    public void test5() throws Exception {
        System.out.println("hello world");
        SqlSession session = getSqlSession();
        User user = session.selectOne("xyz.vaith.domain.User.findUserById", 28);
        System.out.println(user);
        user.setAddress("福建厦门");
        session.delete("xyz.vaith.domain.User.delete", user);
        session.commit();
        session.close();
    }

    private SqlSession getSqlSession() throws IOException {
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        SqlSessionFactory sessionFactory = ssfb.build(inputStream);
        return sessionFactory.openSession();
    }
}

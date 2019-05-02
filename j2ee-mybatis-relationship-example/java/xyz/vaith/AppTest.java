package xyz.vaith;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import xyz.vaith.domain.*;
import xyz.vaith.mapper.*;

import java.io.IOException;
import java.io.InputStream;


public class AppTest {


    @Test
    public void test1() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        PersonMapper personMapper = sessionFactory.openSession().getMapper(PersonMapper.class);
        Person p = personMapper.selectPersonById(1);
        System.out.println(p);

    }

    @Test
    public void test2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        ClazzMapper cm = sessionFactory.openSession().getMapper(ClazzMapper.class);
        Clazz clazz = cm.selectClazzById(1);
        System.out.println(clazz);
        for (Student student : clazz.getStudents()) {
            System.out.println(student);
        }
    }

    @Test
    public void test3() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        StudentMapper studentMapper = sessionFactory.openSession().getMapper(StudentMapper.class);
        Student student = studentMapper.selectStudentById(1);
        System.out.println(student);
    }

    @Test
    public void test4() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        UserMapper userMapper = sessionFactory.openSession().getMapper(UserMapper.class);
        User user = userMapper.selectUserById(1);
        System.out.println(user);
        for (Order order : user.getOrders()) {
            System.out.println(order);

        }
    }

    @Test
    public void test5() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        OrderMapper orderMapper = sessionFactory.openSession().getMapper(OrderMapper.class);
        Order order = orderMapper.selectOrderByOrderId(2);
        System.out.println(order);
        System.out.println(order.getUser());
    }
}

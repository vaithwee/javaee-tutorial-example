package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.domian.User;
import xyz.vaith.app.service.Person;
import xyz.vaith.app.service.UserDao;

import java.util.Arrays;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        System.out.println(context.getBean("steelAxe"));
        System.out.println("executing get bean method before");

        System.out.println(context.getBean("chinese", Person.class));
        System.out.println("executing get bean method after");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.save(new User());

        ((ClassPathXmlApplicationContext) context).close();
    }
}

package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Object person = context.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Object person = context.getBean("student");
        System.out.println(person);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Object person = context.getBean("teacher");
        System.out.println(person);
    }
}

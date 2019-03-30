package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class App {
    @Test
    public void test1() {
        Person person = new Person();
        Axe axe = new Axe();
        person.setAxe(axe);
        person.useAxe();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Person person = context.getBean("person", Person.class);
        person.useAxe();
    }
}

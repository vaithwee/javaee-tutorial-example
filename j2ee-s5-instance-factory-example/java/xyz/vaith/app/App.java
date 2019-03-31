package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.Person;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Person chinese = context.getBean("chinese", Person.class);
         System.out.println(chinese.sayHello("Wee"));
        System.out.println(chinese.sayGoodBye("Wee"));
    }
}

package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.Person;

public class App {
    @Test
    public void test1() throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        System.out.println(context.getBean("p1")==context.getBean("p1"));
        System.out.println(context.getBean("p2")==context.getBean("p2"));
        System.out.println(context.getBean("date"));
        Thread.sleep(1000);
        System.out.println(context.getBean("date"));
    }
}

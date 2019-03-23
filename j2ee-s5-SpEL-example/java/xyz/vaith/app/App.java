package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Object bill1 = context.getBean("bill1");
        Object bill2 = context.getBean("bill2");
        System.out.println(bill1);
        System.out.println(bill2);
    }

}

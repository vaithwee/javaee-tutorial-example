package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        System.out.println(context.getBean("north"));
        System.out.println(context.getBean("theValue"));
        System.out.println(context.getBean("&theValue"));
    }
}

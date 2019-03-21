package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void initAndDestroy() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.cfg.xml");
        HelloModel hello = (HelloModel) ac.getBean("hello");
        hello.save();
        ((ClassPathXmlApplicationContext) ac).close();
    }
}

package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.Being;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Being dog = context.getBean("dog", Being.class);
        dog.testBeing();
        Being cat = context.getBean("cat", Being.class);
        cat.testBeing();
    }
}

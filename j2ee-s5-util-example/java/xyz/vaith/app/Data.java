package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Data {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        xyz.vaith.app.domain.Data data = context.getBean("data", xyz.vaith.app.domain.Data.class);
        data.useAxe();
    }
}

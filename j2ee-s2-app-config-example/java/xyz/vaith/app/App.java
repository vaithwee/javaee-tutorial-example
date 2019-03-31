package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.domain.Person;
import xyz.vaith.app.xyz.vaith.app.config.AppConfig;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Person chinese = context.getBean("chinese", Person.class);
        chinese.useAxe();
    }

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person chinese = context.getBean("chinese", Person.class);
        chinese.useAxe();
    }
}

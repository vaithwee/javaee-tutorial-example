package xyz.vaith.app;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        String hello = context.getMessage("hello", new String[] {"孙悟空"}, Locale.getDefault(Locale.Category.FORMAT));
        String now = context.getMessage("now", new Object[]{new Date()}, Locale.CHINA);
        System.out.println(hello);
        System.out.println(now);
    }
}

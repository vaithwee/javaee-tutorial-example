package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.Hello;

public class App {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Hello hello = context.getBean("hello", Hello.class);
        hello.addUser("wee", "123");
        hello.deleteUser(200);
        try {
            hello.removeUser();
        } catch (Throwable throwable) {
//            throwable.printStackTrace();
        }
    }
}

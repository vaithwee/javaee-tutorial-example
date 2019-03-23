package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.UserService;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        UserService userService = (UserService) context.getBean("userServiceOther");
        userService.save();

        UserService userService1 = (UserService) context.getBean("userServiceOther");
        userService1.save();

        System.out.println(userService);
        System.out.println(userService1);
        ((ClassPathXmlApplicationContext) context).close();

    }
}

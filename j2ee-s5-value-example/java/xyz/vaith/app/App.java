package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.domain.ExmapleBean;

public class App {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.cfg.xml");
        ExmapleBean exampleBean = ctx.getBean("exampleBean", ExmapleBean.class);
        System.out.println(exampleBean);
    }
}

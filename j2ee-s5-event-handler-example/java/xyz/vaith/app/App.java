package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.event.EmailEvent;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        EmailEvent event = new EmailEvent("test", "test@spring.org", "this is a test");
        context.publishEvent(event);
    }
}

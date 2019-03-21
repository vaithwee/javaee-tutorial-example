package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        ScopeModel scopeModel = (ScopeModel) context.getBean("scope");
        ScopeModel scopeModel1 = (ScopeModel) context.getBean("scope");
        scopeModel.save();
        scopeModel1.save();
        System.out.println(scopeModel);
        System.out.println(scopeModel1);

    }
}

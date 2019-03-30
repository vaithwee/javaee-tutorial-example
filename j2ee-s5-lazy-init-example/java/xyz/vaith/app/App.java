package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import xyz.vaith.app.service.Person;

import javax.annotation.Resource;

public class App {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        System.out.println("调用前");
        Person person = context.getBean("chinese", Person.class);
        System.out.println("调用后");
    }

    @Test
    public void test2() {
        Resource resource = (Resource) new ClassPathResource("spring.cfg.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions((org.springframework.core.io.Resource) resource);
    }
}

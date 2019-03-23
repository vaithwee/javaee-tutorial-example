package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.ProductDao;

public class App {
    @Test
    public void test1() throws Throwable {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        ProductDao pDao = (ProductDao) context.getBean("pDao");
        pDao.save();
        pDao.find();
        pDao.update();
        pDao.delete();
    }
}

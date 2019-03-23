package xyz.vaith.app;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.vaith.app.service.ProductService;

public class App {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.cfg.xml");
        ProductService productService = (ProductService) context.getBean("productService");
        productService.save();
        productService.find();
        productService.update();
        productService.delete();
    }
}

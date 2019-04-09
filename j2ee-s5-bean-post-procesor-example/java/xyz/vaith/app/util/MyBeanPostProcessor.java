package xyz.vaith.app.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import xyz.vaith.app.Person;

import java.lang.reflect.Field;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强处理");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强处理");
        if (bean instanceof Person) {

                Class clazz = bean.getClass();
                try {
                    Field f = clazz.getDeclaredField("name");
                    f.setAccessible(true);
                    f.set(bean, "Wee" + f.get(bean));
                } catch (Exception e) {
                    e.printStackTrace();
                }

        }
        return bean;
    }
}

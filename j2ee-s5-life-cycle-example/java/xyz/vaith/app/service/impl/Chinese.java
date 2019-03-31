package xyz.vaith.app.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class Chinese implements Person, InitializingBean, BeanNameAware, ApplicationContextAware, DisposableBean {

    private Axe axe;
    private String beanName;

    public void setAxe(Axe axe) {
        System.out.println("setAxe");
        this.axe = axe;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName");
        this.beanName = s;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterProperties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }

    @Override
    public void useAxe() {
        this.axe.chop();
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    public Chinese() {
        System.out.println("Spring实例化主调bean: Chinese实例...");
    }

    public void init() {
        System.out.println("init");
    }

    public void delloc() {
        System.out.println("delloc");
    }
}

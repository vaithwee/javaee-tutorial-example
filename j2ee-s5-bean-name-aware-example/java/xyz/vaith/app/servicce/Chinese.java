package xyz.vaith.app.servicce;

import org.springframework.beans.factory.BeanNameAware;

public class Chinese implements BeanNameAware {
    private String beanName;

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
    }

    public void info() {
        System.out.println("Chinese实现类, 部署该Bean时指定的id为"+beanName);
    }
}

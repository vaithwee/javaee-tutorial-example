package xyz.vaith.app;

import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("executing init method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("executing afterPropertiesSet method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

package xyz.vaith.app.service;

public class Person {
    public Person() {
        System.out.println("正在执行Person的无参构造");
    }

    public void setTest(String name) {
        System.out.println("正在执行setTest方法, 传入的参数为:" + name);
    }
}

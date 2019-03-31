package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Person;

public class American implements Person {
    @Override
    public String sayHello(String name) {
        return name + ", Hello";
    }

    @Override
    public String sayGoodBye(String name) {
        return name + ", Good Bye";
    }
}

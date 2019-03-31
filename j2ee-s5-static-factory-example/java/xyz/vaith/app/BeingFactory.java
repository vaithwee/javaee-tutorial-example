package xyz.vaith.app;

import xyz.vaith.app.service.Being;
import xyz.vaith.app.service.impl.Cat;
import xyz.vaith.app.service.impl.Dog;

public class BeingFactory {
    public static Being getBeing(String arg) {
        if (arg.equals("dog")) {
            return new Dog();
        } else  {
            return new Cat();
        }
    }
}

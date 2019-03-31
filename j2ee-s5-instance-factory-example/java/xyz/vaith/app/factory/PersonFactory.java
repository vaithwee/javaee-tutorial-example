package xyz.vaith.app.factory;

import xyz.vaith.app.service.Person;
import xyz.vaith.app.service.impl.American;
import xyz.vaith.app.service.impl.Chinese;

public class PersonFactory {

    public Person getPerson(String ethnic) {
        if (ethnic.equals("chin")) {
            return new Chinese();
        } else  {
            return new American();
        }
    }
}

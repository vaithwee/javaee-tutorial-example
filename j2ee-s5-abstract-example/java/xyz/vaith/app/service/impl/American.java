package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class American implements Person {
    private String name;
    private Axe axe;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
       System.out.println(name + this.axe.chop());
    }
}

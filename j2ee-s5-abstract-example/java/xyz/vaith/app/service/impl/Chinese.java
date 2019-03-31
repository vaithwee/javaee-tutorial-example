package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class Chinese implements Person {
    private Axe axe;
    private String name;

    public Axe getAxe() {
        return axe;
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void useAxe() {
        System.out.println(name + axe.chop());
    }
}

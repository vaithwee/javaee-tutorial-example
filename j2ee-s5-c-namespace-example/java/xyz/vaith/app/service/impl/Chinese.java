package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class Chinese implements Person {
    private Axe axe;
    private int age;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
        System.out.println("age:" + axe);
    }

    public Chinese(Axe axe, int age) {
        this.axe = axe;
        this.age = age;
    }
}

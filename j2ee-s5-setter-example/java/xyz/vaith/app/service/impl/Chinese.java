package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

public class Chinese implements Person {

    private Axe axe;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }
}

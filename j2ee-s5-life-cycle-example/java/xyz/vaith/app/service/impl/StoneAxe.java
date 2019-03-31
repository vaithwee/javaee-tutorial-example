package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;

public class StoneAxe implements Axe {
    @Override
    public void chop() {
        System.out.println("石头斧头砍材真慢");
    }
}

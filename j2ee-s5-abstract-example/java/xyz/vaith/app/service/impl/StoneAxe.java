package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;

public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "用石斧砍柴非常慢";
    }
}

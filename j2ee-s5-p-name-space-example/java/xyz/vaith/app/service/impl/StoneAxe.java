package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.Axe;

public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "石斧头砍柴真的慢";
    }
}

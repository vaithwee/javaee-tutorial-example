package xyz.vaith.app.domain;

public class StoneAex implements Axe {
    @Override
    public void chop() {
        System.out.println("用石斧砍柴真的慢");
    }
}

package xyz.vaith.app.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import xyz.vaith.app.service.Axe;

@Primary
@Component
public class StoneAxe implements Axe {
    @Override
    public String chop() {
        return "石斧头砍柴好慢";
    }
}

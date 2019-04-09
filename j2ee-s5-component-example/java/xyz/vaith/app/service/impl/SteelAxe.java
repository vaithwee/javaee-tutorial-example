package xyz.vaith.app.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import xyz.vaith.app.service.Axe;

@Component
@Scope("prototype")
public class SteelAxe implements Axe {
    @Override
    public String chop() {
        return "钢斧头砍才好快";
    }
}

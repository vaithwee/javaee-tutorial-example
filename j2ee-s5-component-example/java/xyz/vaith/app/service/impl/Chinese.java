package xyz.vaith.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import xyz.vaith.app.service.Axe;
import xyz.vaith.app.service.Person;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Set;

@Lazy
@Component
@DependsOn({"stoneAxe", "steelAxe"})
public class Chinese implements Person {
    @Value("#{T(Math).PI}")
    private String name;
    @Resource(name = "stoneAxe")
    private Axe axe;
    private Set<Axe> axeSet;
    @Autowired
    private Axe otherAxe;

    @Autowired
    public void setAxeSet(Set<Axe> axeSet) {
        this.axeSet = axeSet;
    }

    @Autowired
    private Axe[] axes;

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void useAxe() {
        System.out.println(axe.chop());
    }

    @PostConstruct
    public void init() {
        System.out.println("executing init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("executing destroy method");
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", axe=" + axe +
                ", axeSet=" + axeSet +
                ", otherAxe=" + otherAxe +
                ", axes=" + Arrays.toString(axes) +
                '}';
    }
}

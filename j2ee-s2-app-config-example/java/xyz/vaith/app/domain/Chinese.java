package xyz.vaith.app.domain;

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
        System.out.println("我是" + name + axe.chop());
    }
}

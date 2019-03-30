package xyz.vaith.app.domain;

public class ExmapleBean {
    private Integer integerField;
    private Double doubleField;

    public Integer getIntegerField() {
        return integerField;
    }

    public void setIntegerField(Integer integerField) {
        this.integerField = integerField;
    }

    public Double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(Double doubleField) {
        this.doubleField = doubleField;
    }

    @Override
    public String toString() {
        return "ExmapleBean{" +
                "integerField=" + integerField +
                ", doubleField=" + doubleField +
                '}';
    }
}

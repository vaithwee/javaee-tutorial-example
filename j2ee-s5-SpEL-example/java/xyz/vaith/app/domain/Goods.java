package xyz.vaith.app.domain;

public class Goods {
    private Double price;
    private Integer number;
    private String name;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateTotal() {
        return number * price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}

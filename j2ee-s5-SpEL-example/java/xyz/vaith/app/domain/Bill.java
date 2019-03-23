package xyz.vaith.app.domain;

public class Bill {
    private Double total;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "total=" + total +
                '}';
    }
}

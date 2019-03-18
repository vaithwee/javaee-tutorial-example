package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "address_info")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String addressDetail;

    public Address() {
    }

    public Address(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressDetail='" + addressDetail + '\'' +
                '}';
    }
}

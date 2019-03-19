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
    @ManyToOne(targetEntity = Person.class)
    @JoinColumns({@JoinColumn(name = "person_first", referencedColumnName = "first", nullable = false), @JoinColumn(name = "person_last", referencedColumnName = "last", nullable = false)})
    private Person person;

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}

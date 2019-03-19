package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "address_info")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String detail;

    @ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinTable(name = "person_address", joinColumns = @JoinColumn(name = "a_id", referencedColumnName = "address_id"), inverseJoinColumns = @JoinColumn(name = "p_id", referencedColumnName = "person_id"))
    private Person person;

    public Address() {
    }

    public Address(String detail) {
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                '}';
    }
}

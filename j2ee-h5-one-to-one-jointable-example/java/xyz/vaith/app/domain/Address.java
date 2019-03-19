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
    @OneToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinTable(name = "person_address", joinColumns = @JoinColumn(name = "a_id", referencedColumnName = "address_id", unique = true), inverseJoinColumns = @JoinColumn(name = "p_id", referencedColumnName = "person_id", unique = true))
    private Person person;

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
}

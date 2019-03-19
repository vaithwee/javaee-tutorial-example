package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "person_info")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    private String name;

    @OneToOne(targetEntity = Address.class, mappedBy = "person")
    @JoinTable(name = "person_address", joinColumns = @JoinColumn(name = "p_id", referencedColumnName = "person_id", unique = true), inverseJoinColumns = @JoinColumn(name = "a_id", referencedColumnName = "address_id", unique = true))
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

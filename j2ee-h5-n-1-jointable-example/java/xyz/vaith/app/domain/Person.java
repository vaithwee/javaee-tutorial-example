package xyz.vaith.app.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "person_info")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer age;

    @ManyToOne(targetEntity = Address.class)
    @JoinTable(name = "person_address", joinColumns = @JoinColumn(name = "person_id", referencedColumnName = "person_id", unique = true), inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName = "address_id"))
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

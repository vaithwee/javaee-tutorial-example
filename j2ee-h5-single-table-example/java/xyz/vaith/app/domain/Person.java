package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name = "person_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("普通人")
@Table(name = "person_info")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Character gender;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "detail", column = @Column(name = "address_detail")),
            @AttributeOverride(name = "zip", column = @Column(name ="address_zip")),
            @AttributeOverride(name = "country", column = @Column(name ="address_country"))
    })

    private Address address;

    public Person() {
    }

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

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
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
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }
}

package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "address_info")
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String detail;

    @ManyToMany(targetEntity = Person.class, cascade = CascadeType.ALL)
    @JoinTable(name = "person_address", joinColumns = @JoinColumn(name = "a_id", referencedColumnName = "address_id"), inverseJoinColumns = @JoinColumn(name = "p_id", referencedColumnName = "person_id"))
    private Set<Person> people = new HashSet<>();

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

    public Set<Person> getPeople() {
        return people;
    }

    public void setPeople(Set<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                '}';
    }
}

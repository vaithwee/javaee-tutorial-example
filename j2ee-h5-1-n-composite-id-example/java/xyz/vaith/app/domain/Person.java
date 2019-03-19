package xyz.vaith.app.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "person_info")
public class Person implements Serializable {
    @Id
    @Column( length = 20)
    private String first;
    @Id
    @Column(length = 20)
    private String last;
    private Integer age;
    @OneToMany(targetEntity = Address.class, mappedBy = "person", cascade = CascadeType.ALL)
    private Set<Address> addresses = new HashSet<>();

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirst().equals(person.getFirst()) &&
                getLast().equals(person.getLast());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getLast());
    }
}

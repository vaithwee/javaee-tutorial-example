package xyz.vaith.app.domain;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Embeddable
public class Address {
    private String addressDetail;
    @Parent
    private Person person;
    @OneToMany(targetEntity = School.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "person_id")
    private Set<School> schools = new HashSet<>();

    public Address() {
    }

    public Address(String addressDetail) {
        this.addressDetail = addressDetail;
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

    public Set<School> getSchools() {
        return schools;
    }

    public void setSchools(Set<School> schools) {
        this.schools = schools;
    }
}

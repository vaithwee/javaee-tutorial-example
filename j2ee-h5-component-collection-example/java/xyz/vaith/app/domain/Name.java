package xyz.vaith.app.domain;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Embeddable
public class Name {
    @Column(name = "person_first_name")
    private String first;
    @Column(name = "person_last_name")
    private String last;
    @Parent
    private Person owner;
    @ElementCollection(targetClass = Integer.class)
    @CollectionTable(name = "power_inf", joinColumns = @JoinColumn(name = "person_name_id", nullable = false))
    @MapKeyColumn(name = "name_aspect", length = 20)
    @Column(name = "name_power", nullable = false, length = 20)
    @MapKeyClass(String.class)
    private Map<String, Integer> power = new HashMap<>();

    public Name() {
    }

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

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

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Map<String, Integer> getPower() {
        return power;
    }

    public void setPower(Map<String, Integer> power) {
        this.power = power;
    }
}

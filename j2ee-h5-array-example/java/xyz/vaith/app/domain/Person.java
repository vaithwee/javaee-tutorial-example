package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "person_inf")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "school_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @Column(name = "school_name")
    @OrderColumn(name = "array_order")
    private String[] schools;

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

    public String[] getSchools() {
        return schools;
    }

    public void setSchools(String[] schools) {
        this.schools = schools;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", schools=" + Arrays.toString(schools) +
                '}';
    }
}

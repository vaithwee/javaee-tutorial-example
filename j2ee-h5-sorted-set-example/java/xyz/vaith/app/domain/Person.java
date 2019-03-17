package xyz.vaith.app.domain;

import org.hibernate.annotations.SortNatural;

import javax.persistence.*;
import java.util.SortedSet;
import java.util.TreeSet;

@Entity
@Table(name = "person_inf")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "trainings_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @Column( name = "training_name", nullable = false, length = 20)
    @SortNatural
    private SortedSet<String> trainings = new TreeSet<>();

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

    public SortedSet<String> getTrainings() {
        return trainings;
    }

    public void setTrainings(SortedSet<String> trainings) {
        this.trainings = trainings;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", trainings=" + trainings +
                '}';
    }
}

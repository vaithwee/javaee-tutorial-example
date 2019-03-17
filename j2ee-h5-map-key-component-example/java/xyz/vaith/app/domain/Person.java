package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "person_info")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer age;

    @ElementCollection(targetClass = Integer.class)
    @CollectionTable(name = "name_power_info", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @Column(name = "nick_power", nullable = false)
    @MapKeyClass(Name.class)
    private Map<Name, Integer> nickPower = new HashMap<>();

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

    public Map<Name, Integer> getNickPower() {
        return nickPower;
    }

    public void setNickPower(Map<Name, Integer> nickPower) {
        this.nickPower = nickPower;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", nickPower=" + nickPower +
                '}';
    }
}

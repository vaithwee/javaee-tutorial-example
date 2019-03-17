package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "person_id")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;

    @ElementCollection(targetClass = Float.class)
    @CollectionTable(name = "score_inf", joinColumns = @JoinColumn(name = "person_id", nullable = false))
    @MapKeyColumn(name = "subject_name", length = 20)
    @MapKeyClass(String.class)
    @Column(name = "mark")
    private Map<String, Float> scores = new HashMap<>();

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

    public Map<String, Float> getScores() {
        return scores;
    }

    public void setScores(Map<String, Float> scores) {
        this.scores = scores;
    }
}

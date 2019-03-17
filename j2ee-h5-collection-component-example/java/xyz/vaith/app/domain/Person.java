package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "person_inf")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer age;

    @ElementCollection(targetClass = Score.class)
    @CollectionTable(name = "score_inf", joinColumns = @JoinColumn(name = "score_person_id", nullable = false))
    @MapKeyColumn(name = "subject_name", length = 100)
    @MapKeyClass(String.class)
    private Map<String, Score> scores = new HashMap<>();

    @ElementCollection(targetClass = Name.class)
    @CollectionTable(name = "nick_inf", joinColumns = @JoinColumn(name = "nick_person_id", nullable = false))
    @OrderColumn(name = "list_order")
    private List<Name> nicks = new ArrayList<>();


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

    public Map<String, Score> getScores() {
        return scores;
    }

    public void setScores(Map<String, Score> scores) {
        this.scores = scores;
    }

    public List<Name> getNicks() {
        return nicks;
    }

    public void setNicks(List<Name> nicks) {
        this.nicks = nicks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", scores=" + scores +
                ", nicks=" + nicks +
                '}';
    }
}

package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person_inf")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "person_name", length = 50)
    private String name;

    @Temporal(TemporalType.DATE)
    private Date birth;

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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}

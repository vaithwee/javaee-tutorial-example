package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "person_inf")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer age;
    @Enumerated
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "person_firstName")),
            @AttributeOverride(name = "lastName", column = @Column(name = "person_lastName"))
    })
    private Name name;

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

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}

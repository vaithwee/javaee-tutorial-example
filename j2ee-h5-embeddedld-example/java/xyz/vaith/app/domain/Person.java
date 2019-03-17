package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "person_info")
public class Person {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "first", column = @Column(name = "person_first_name", length = 100)),
            @AttributeOverride(name = "last", column = @Column(name = "person_last_name", length = 100))
    })
    private Name name;
    private Integer age;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

package xyz.vaith.app.model;

public class Dog {
    private Long id;
    private String name;
    private Integer age;

    private Person master;

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}

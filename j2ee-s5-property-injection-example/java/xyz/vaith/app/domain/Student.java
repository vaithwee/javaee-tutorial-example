package xyz.vaith.app.domain;

public class Student extends Person {
    private Double score;

    public Student() {
    }

    public Student(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

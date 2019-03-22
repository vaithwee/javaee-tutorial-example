package xyz.vaith.app.domain;

public class Teacher extends Person {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "student=" + student +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

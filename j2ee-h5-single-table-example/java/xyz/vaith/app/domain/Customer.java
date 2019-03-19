package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("顾客")
@Table(name = "custom_info")
public class Customer extends Person {
    private String comments;
    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_id", nullable = true)
    private Employee employee;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

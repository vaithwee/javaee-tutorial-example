package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "customer_info")
public class Customer extends Person {
    private String comments;
    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
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

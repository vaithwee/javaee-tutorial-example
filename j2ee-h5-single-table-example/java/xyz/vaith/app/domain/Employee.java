package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("员工")
@Table(name = "employee_info")
public class Employee extends Person {
    private String title;
    private double salary;
    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL, mappedBy = "employee")
    public Set<Customer> customers = new HashSet<>();
    @ManyToOne(targetEntity = Manager.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id", nullable = true)
    private Manager manager;

    public Employee() {
    }

    public Employee(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}

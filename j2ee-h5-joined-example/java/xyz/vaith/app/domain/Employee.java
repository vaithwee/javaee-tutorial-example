package xyz.vaith.app.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "employee_info")
public class Employee extends Person {
    private String title;
    private Double salary;
    @OneToMany(targetEntity = Customer.class, mappedBy = "employee")
    private Set<Customer> customers = new HashSet<>();
    @ManyToOne(targetEntity = Manager.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id", nullable = true)
    private Manager manager;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
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
}

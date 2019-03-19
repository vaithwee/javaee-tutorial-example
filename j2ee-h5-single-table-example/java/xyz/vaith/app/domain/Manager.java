package xyz.vaith.app.domain;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("经理")
public class Manager extends Customer {
    private String department;
    @OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL, mappedBy = "manager")
    private Set<Employee> employees = new HashSet<>();

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}

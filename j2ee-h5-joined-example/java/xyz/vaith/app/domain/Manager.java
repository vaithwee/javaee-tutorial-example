package xyz.vaith.app.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "manager_info")
public class Manager extends Employee {
    private String department;
    @OneToMany(targetEntity = Employee.class, mappedBy = "manager")
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

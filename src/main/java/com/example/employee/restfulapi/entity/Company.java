package com.example.employee.restfulapi.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Integer id;
    private String companyName;
    private Integer employeesNumber;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyId")
    private Set<Employee> employees;

    public Company() {
    }

    public Company(String companyName, Integer employeesNumber) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
    }

    public Company(@NotNull String companyName, @NotNull Integer employeesNumber, Set<Employee> employees) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}

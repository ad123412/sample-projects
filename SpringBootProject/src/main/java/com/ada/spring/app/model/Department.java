package com.ada.spring.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */

@Entity
public class Department implements Serializable{

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String deptName;

    @OneToMany( cascade = CascadeType.ALL,
                fetch = FetchType.EAGER,
                mappedBy = "department"
              )
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

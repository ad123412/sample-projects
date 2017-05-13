package com.ada.spring.app.service;

import com.ada.spring.app.model.Employee;
import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */
public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

}

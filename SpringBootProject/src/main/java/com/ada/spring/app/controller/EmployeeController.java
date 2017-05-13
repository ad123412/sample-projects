package com.ada.spring.app.controller;

import com.ada.spring.app.model.Employee;
import com.ada.spring.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADA on 5/11/2017.
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee" , method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("all employee list >>> " + allEmployees);
        return allEmployees;
    }

    @RequestMapping(value = "/employee" , method = RequestMethod.POST)
    public Employee createEmployee
            (@RequestBody(required = true) Employee employee) {

        Employee newEmployee = employeeService.saveEmployee(employee);
        System.out.println("employee created >>> " + newEmployee);
        return newEmployee;
    }
}

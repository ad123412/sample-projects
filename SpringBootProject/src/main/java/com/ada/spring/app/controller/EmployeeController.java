package com.ada.spring.app.controller;

import com.ada.spring.app.model.Employee;
import com.ada.spring.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public @ResponseBody List<Employee> getAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        System.out.println("all employee list >>> " + allEmployees);
        return allEmployees;
    }

    @RequestMapping(value = "/employee" , method = RequestMethod.POST)
    public @ResponseBody Employee createEmployee
            (@RequestBody(required = true) Employee employee) {

        Employee newEmployee = employeeService.saveEmployee(employee);
        System.out.println("employee created >>> " + newEmployee);
        return newEmployee;
    }

    @RequestMapping(value = "/employee/dept/{deptId}", method = RequestMethod.GET)
    public @ResponseBody List<Employee> getAllEmployees
            (@PathVariable(required = true, value = "deptId") String deptId ) {

        List<Employee> allEmployees = employeeService.getAllEmployeeByDepartment(deptId);
        System.out.println("all employee list belongs to dept " + deptId + "is >> " + allEmployees);
        return allEmployees;
    }
}

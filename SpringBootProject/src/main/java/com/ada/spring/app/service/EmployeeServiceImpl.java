package com.ada.spring.app.service;

import com.ada.spring.app.model.Employee;
import com.ada.spring.app.repository.DepartmentRepository;
import com.ada.spring.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepo;

    @Autowired
    private DepartmentRepository deptRepo;


    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) empRepo.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployeeByDepartment(String deptName) {
        return empRepo.findAllByDepartmentDeptName(deptName);
    }
}

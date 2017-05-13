package com.ada.spring.app.service;

import com.ada.spring.app.model.Department;
import com.ada.spring.app.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */

@Service
public class DepartmentServiceImpl implements  DepartmentService{

    @Autowired
    private DepartmentRepository deptRepo;

    @Override
    public List<Department> getAllDepartments() {
        return (List<Department>) deptRepo.findAll();
    }
}

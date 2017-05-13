package com.ada.spring.app.controller;

import com.ada.spring.app.model.Department;
import com.ada.spring.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/dept", method = RequestMethod.GET)
    public @ResponseBody List<Department> getAllDepartments(){

        List<Department> allDepartments = departmentService.getAllDepartments();
        System.out.println("All departments >>>>> " + allDepartments);
        return allDepartments;
    }

}

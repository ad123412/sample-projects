package com.ada.spring.app.repository;

import com.ada.spring.app.model.Employee;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by ADA on 5/13/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

    /**
     * find all the employee by the department name
     */
    public List<Employee> findAllByDepartmentDeptName(String deptName);
}

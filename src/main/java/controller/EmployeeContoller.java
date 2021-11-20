package com.csb.samplefullstack.controller;

import com.csb.samplefullstack.entity.Employee;
import com.csb.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/employee")
@CrossOrigin("*") //allow all connections
public class EmployeeController {

    private EmployeeRepository employeerepository;

    @RequestMapping("/employees")
    public List<Employee> getAll(){
        employeerepository.findAll();
    }
}



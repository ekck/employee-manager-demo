package com.zanahtech.empmanager.controller;

import com.zanahtech.empmanager.entity.Employee;
import com.zanahtech.empmanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    //create employee api
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBodygit   Employee employee){
        return employeeRepository.save(employee);
    }
}

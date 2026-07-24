package com.vish.SpringJDBCExample2.service;

import com.vish.SpringJDBCExample2.model.Employee;
import com.vish.SpringJDBCExample2.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo repo;

    public void addEmployee(Employee e){
       repo.save(e);
    }

    public List<Employee> getAllEmp(){
        return repo.findAll();
    }

}

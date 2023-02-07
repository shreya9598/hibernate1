package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
}

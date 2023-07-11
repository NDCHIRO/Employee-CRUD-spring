package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findById(int employeeId);
    public Employee save(Employee theEmployee);
    public void deleteById(int employeeId);
}

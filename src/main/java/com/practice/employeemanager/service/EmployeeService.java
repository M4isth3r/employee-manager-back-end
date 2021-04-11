package com.practice.employeemanager.service;

import com.practice.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Employee updateEmployee(Employee employee);
    Employee findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}

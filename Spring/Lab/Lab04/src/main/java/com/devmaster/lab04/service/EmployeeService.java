package com.devmaster.lab03.service;


import com.devmaster.lab03.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<Employee>();

    public EmployeeService() {
        employees.addAll(Arrays.asList(
                new Employee(1, "Alex", "Male", 22, 100.0),
                new Employee(2, "Chris", "Male",23, 120.0),
                new Employee(3, "Alena", "Female", 20, 105.0),
                new Employee(4, "Bob", "Female", 21, 105.0),
                new Employee(5, "Tristana", "Female", 22, 110.0)
        ));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) {
        return employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee employee) {
        Employee check = getEmployee(id);
        if (check == null) {
            return null;
        }

        employees.forEach(item -> {
            if (employee.getId() == item.getId()) {
                item.setId(employee.getId());
                item.setAge(employee.getAge());
                item.setSalary(employee.getSalary());
                item.setFullName(employee.getFullName());
                item.setGender(employee.getGender());
            }
        });
    }
}

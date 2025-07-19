package com.devmaster.lab04.service.impl;

import com.devmaster.lab04.dto.EmployeeDTO;
import com.devmaster.lab04.entity.Employee;
import com.devmaster.lab04.mapper.EmployeeMapper;
import com.devmaster.lab04.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employees = new ArrayList<Employee>();

    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeServiceImpl() {
        employees.addAll(Arrays.asList(
                new Employee(1, "Alex", "Male", 22, 100.0),
                new Employee(2, "Chris", "Male",23, 120.0),
                new Employee(3, "Alena", "Female", 20, 105.0),
                new Employee(4, "Bob", "Female", 21, 105.0),
                new Employee(5, "Tristana", "Female", 22, 110.0)
        ));
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employees.stream()
                .map(employeeMapper::toDTO)
                .toList();
    }

    @Override
    public EmployeeDTO getEmployeeById(String id) {
        return employees.stream()
                .filter(employee -> employee.getId() == Integer.parseInt(id))
                .findFirst()
                .map(employeeMapper::toDTO)
                .orElse(null);
    }

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = employeeMapper.toEntity(employeeDTO);
        employees.add(employee);

        return employeeMapper.toDTO(employee);
    }

    @Override
    public EmployeeDTO updateEmployee(String id, EmployeeDTO employeeDTO) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == Integer.parseInt(id)) {
                Employee updated = employeeMapper.toEntity(employeeDTO);
                employees.set(i, updated);
                return employeeMapper.toDTO(updated);
            }
        }

        return null;
    }

    @Override
    public void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.getId() == Integer.parseInt(id));
    }
}

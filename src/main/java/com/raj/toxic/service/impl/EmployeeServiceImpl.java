package com.raj.toxic.service.impl;

import com.raj.toxic.entity.Employee;
import com.raj.toxic.repository.EmployeeRepository;
import com.raj.toxic.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl (EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}

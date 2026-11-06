package com.raj.toxic.service.impl;

import com.raj.toxic.entity.Employee;
import com.raj.toxic.repository.EmployeeRepository;
import com.raj.toxic.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger log = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    /**
     *
     */
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    /**
     * @return
     */
    @Override
    public Double getSecondHighestSalary() {

        List<Employee> employeeList = employeeRepository.findAll();
//        Optional<Double> secondHighestSalary = employeeList.stream().map(Employee::getSalary).distinct().filter(Objects::nonNull).sorted(Comparator.reverseOrder()).skip(1).findFirst();
//        return secondHighestSalary.orElse(0d);

        Double highestSalary = null;
        Double secondHighestSalary = null;

        for (Employee employee : employeeList) {
            double employeeSalary = employee.getSalary();


            if (highestSalary == null || employeeSalary > highestSalary) {

                if (highestSalary != null) {
                    secondHighestSalary = highestSalary;
                }
                highestSalary = employeeSalary;

            } else if (employeeSalary < highestSalary && (secondHighestSalary == null || employeeSalary > secondHighestSalary)) {
                secondHighestSalary = employeeSalary;
            }

        }

        return secondHighestSalary;
    }
}

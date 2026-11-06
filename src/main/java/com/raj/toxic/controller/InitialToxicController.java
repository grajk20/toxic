package com.raj.toxic.controller;

import com.raj.toxic.entity.Employee;
import com.raj.toxic.service.EmployeeService;
import com.raj.toxic.service.PracticeDSAlgo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class InitialToxicController {

    private static final Logger log = LoggerFactory.getLogger(InitialToxicController.class);

    private final PracticeDSAlgo practiceDSAlgo;

    private final EmployeeService employeeService;

    public InitialToxicController(PracticeDSAlgo practiceDSAlgo, EmployeeService employeeService) {
        this.practiceDSAlgo = practiceDSAlgo;
        this.employeeService = employeeService;
    }

    @GetMapping("/init")
    public String InitialToxicControllerInit() {

        log.info("Raj Gowda - Init Controller from logger");
        return "Raj Gowda : Init";
    }

    @GetMapping("/algorithm")
    public String AlgorithmPracticeHandler() {

        log.info("AlgorithmPracticeHandler: Start");

        practiceDSAlgo.execute();
        return "AlgorithmPracticeHandler: Completed";
    }

    @GetMapping("/playground")
    public String CodingPlayground(@RequestParam String valueOne,
                                   @RequestParam int valueTwo,
                                   @RequestParam int valueThree) {

        log.info("CodingPlayground: Start");

        String result = practiceDSAlgo.runPlayground(valueTwo, valueThree);

        return "runPlayground: Completed : " + result;
    }

    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee) {

        if (employee !=null && !Objects.equals(employee.getFirstName(), "") && employee.getSalary() != 0 ) {
            employeeService.addEmployee(employee);
            return "Employee Added :: "+employee.getFirstName();
        }

        return "Employee Addition failed";
    }


    @GetMapping("/employee/salary/second")
    public Double getSecondHighestSalary() {

        return employeeService.getSecondHighestSalary();
    }
}

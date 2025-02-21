package com.capgemini.springcoreIntro.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component // Marks this as a Spring Bean
public class Employee {

    private String employeeName = "John Doe";
    private final Department department;

    // Constructor Injection (Recommended)
    @Autowired
    public Employee(Department department) {
        this.department = department;
    }



    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department.getDepartmentName());
    }
}


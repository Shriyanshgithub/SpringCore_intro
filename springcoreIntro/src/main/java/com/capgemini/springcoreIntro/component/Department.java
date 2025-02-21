package com.capgemini.springcoreIntro.component;

import org.springframework.stereotype.Component;

@Component  // Marks this as a Spring Bean
public class Department {

    private String departmentName = "Engineering";

    public Department() {

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}



package com.capgemini.springcoreIntro;

import com.capgemini.springcoreIntro.component.Department;
import com.capgemini.springcoreIntro.component.Employee;
import com.capgemini.springcoreIntro.component.Employee;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoreIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreIntroApplication.class, args);

		Employee employee = new Employee(new Department());

		employee.showEmployeeDetails();
	}

}

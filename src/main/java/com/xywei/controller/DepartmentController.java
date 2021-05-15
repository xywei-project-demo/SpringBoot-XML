package com.xywei.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xywei.domain.Department;
import com.xywei.domain.Employee;

@Controller
public class DepartmentController {

	@RequestMapping(value = "/department", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public Department getDepartment(@RequestBody(required = false) Department department1) {
		
		System.out.println("department1=" + department1);

		Employee employeeA = new Employee(100, "A");
		Employee employeeB = new Employee(101, "B");

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employeeA);
		employees.add(employeeB);

		Department department = new Department(10088, "department1001", employees);

		return department;
	}
}

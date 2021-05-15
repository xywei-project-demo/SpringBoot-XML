package com.xywei.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xywei.domain.Employee;
import com.xywei.domain.User;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Employee employeeIndex() {
		return new Employee(1111, "111Employee");
	}
	
	@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public User userIndex() {
		return new User(11, "111");
	}

}

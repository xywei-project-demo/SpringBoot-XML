package com.xywei.domain;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 
 * @author future
 * @Datetime 2021年5月15日 下午6:34:02<br/>
 * @Description 一个部门有多个员工
 */
@JacksonXmlRootElement(localName = "department")
public class Department {

	@JacksonXmlProperty(localName = "id")
	// @JacksonXmlCData对数值的无效
	@JacksonXmlCData
	private Integer id;

	@JacksonXmlProperty(localName = "name")
	@JacksonXmlCData
	private String name;

	@JacksonXmlElementWrapper(localName = "employees")
	@JacksonXmlProperty(localName = "employee")
	private List<Employee> employees;

	public Department() {

	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Department(Integer id, String name, List<Employee> employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}

}

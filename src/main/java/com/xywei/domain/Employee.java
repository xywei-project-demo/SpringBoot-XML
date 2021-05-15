package com.xywei.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/**
 * 
 * @author future
 * @Datetime 2021年5月15日 下午6:30:58<br/>
 * @Description
 */
@JacksonXmlRootElement(localName = "employee")
public class Employee {

	@JacksonXmlProperty(localName = "employee_id", isAttribute = true)
	private Integer id;
	
	@JacksonXmlText
	@JacksonXmlCData
	private String name;
	
	public Employee() {
	}
	
	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

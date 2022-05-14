package com.example.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HelloService {
	
	@Autowired
	private HelloRepository repository;
	
	
	public Employee getEmployee(String id) {
		
		Map<String,Object>map = repository.findByld(id);
		
		
		String employeeId = (String)map.get("id");
		String name =(String)map.get("name");
		int age = (Integer)map.get("age");
		
		Employee employee = new Employee();
		employee.setEmployeeld(employeeld);
		employee.setEmployeeName(name);
		employee.setEmployeeAge(age);
		
		return employee;
	}
}

package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.Employee;
import com.example.demo.Service.EmployeeService;


@RequestMapping("Employee/")
public class EmployeeController {
	
	private EmployeeService empService;
	
public EmployeeController(EmployeeService empService) {
		super();
		this.empService = empService;
	}


@RequestMapping("getBYId")
	public void getEmpDetailsBYId(@RequestBody Employee emp) {
	
empService.getEmpDetailsBYId(emp);
	}
	
}

package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Employee;
import com.example.demo.Dao.EmployeeDao;
@Service
public class EmployeeService {
	private EmployeeDao edao;
	@Autowired
public EmployeeService(EmployeeDao edao) {
		super();
		this.edao = edao;
	}
public void getEmpDetailsBYId(Employee emp) {
		edao.save(emp);
	}
}

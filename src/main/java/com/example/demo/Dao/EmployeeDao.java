package com.example.demo.Dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeDao extends CrudRepository<Employee,Serializable> {
public Employee findByName(String name);

public List<Employee> findBySalary(Double salary);

public List<Employee> findByWorkinglocation(String workinglocation);

public Employee findByNameAndWorkinglocation(String name,String location);

public Employee findByNameAndSalary(String name,Double salary);
 
public Employee  findByIdAndSalary(Integer id,Double salary);



}

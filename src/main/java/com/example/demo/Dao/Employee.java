package com.example.demo.Dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Table
@Entity
public class Employee {
	@Id
	@GeneratedValue
private Integer id;
	@Column
private String name;
	@Column
private Double salary;
	@Column
private String workinglocation;
	
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", workinglocation=" + workinglocation
				+ "]";
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
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getWorkinglocation() {
	return workinglocation;
}
public void setWorkinglocation(String workinglocation) {
	this.workinglocation = workinglocation;
}

}

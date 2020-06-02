package com.example.demo.Dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDaoJpa extends JpaRepository<Employee,Serializable>{

}

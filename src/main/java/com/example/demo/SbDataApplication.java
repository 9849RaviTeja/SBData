package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.Dao.Employee;
import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Dao.EmployeeDaoJpa;

@SpringBootApplication
@EnableMBeanExport(defaultDomain="first")
public class SbDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SbDataApplication.class, args);
		/*curd Repistory
		 * 
		 * EmployeeDao dao=ctxt.getBean(EmployeeDao.class);
		System.out.println("findByName");
		Employee e1=dao.findByName("praveen");
		System.out.println("findBySalary");
		List<Employee> empList1=dao.findBySalary((double)60000);
		for (Employee employee : empList1) {
			System.out.println(employee);
		}
		System.out.println("findByWorkinglocation");
		List<Employee> empList2=dao.findByWorkinglocation("Hyderabad");
		for (Employee employee : empList2) {
			System.out.println(employee);
		}
		System.out.println("findByIdAndSalary");
		Employee e3=dao.findByIdAndSalary(1, (double)100000);
		System.out.println(e3);
		System.out.println("findBYNameandSalary");
	Employee e4=	dao.findByNameAndSalary("chintu",(double) 60000);
	System.out.println(e4);
	System.out.println("findByNameAndWorkinglocation");
	Employee e5=dao.findByNameAndWorkinglocation("Arun", "pune");
	System.out.println(e5);*/
		/*sorting*/
		EmployeeDaoJpa jparepo=ctxt.getBean(EmployeeDaoJpa.class);
List<Employee> empjpalist=	jparepo.findAll(Sort.by("name").descending());

for (Employee employee : empjpalist) {
	System.out.println(employee);
}
/* pagination*/
int page=0;
int size=3;
PageRequest pageRequest=PageRequest.of(page, size,Sort.by("name"));

Page<Employee> pageable=jparepo.findAll(pageRequest);

int totalnoofPages=pageable.getTotalPages();
System.out.println("Total no of pages"+totalnoofPages);
List<Employee> empList=pageable.getContent();

for (Employee employee : empList) {
	System.out.println(employee);
}
	}
	

}

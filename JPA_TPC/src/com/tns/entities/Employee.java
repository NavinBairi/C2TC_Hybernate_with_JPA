package com.tns.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "emp_store")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;

	private String name;
	private double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}


/*create database demo_tpc;
use demo_tpc;

create table emp_store(
 employeeId INT NOT NULL,
 name VARCHAR(45) NOT NULL,
 salary INT NOT NULL,
 PRIMARY KEY (employeeId)
);

create table mgr (
departmentName varchar(50) not null,
 employeeId INT NOT NULL 
);


select * from emp_store;
select * from mgr;*/
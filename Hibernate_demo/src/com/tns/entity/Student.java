package com.tns.entity;

import java.io.Serializable;

import javax.persistence.*;

//information to the program about the database table
@Entity  // by using @Entity: 'student class'  become entity class 
@Table(name = "student") // table name which are in database 


//Student class 
//serializable is a interface : any java object want to map with database object , for communicate we need to use serializable 
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id // @Id we use for telling java that database  studentId  is  primary key
	private int studentId;  // Variable 1 : Primary key 
	private String name;   // Variable 2
	
	
	// get and setter auto create
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {}

}


//A persistence context is a set of entities such that for any persistent identity there is a unique entity instance

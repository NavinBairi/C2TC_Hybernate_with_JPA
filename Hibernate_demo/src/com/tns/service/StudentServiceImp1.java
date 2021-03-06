package com.tns.service;

import com.tns.dao.StudentDao;
import com.tns.dao.StudentDaoImp1;
import com.tns.entity.Student;

public class StudentServiceImp1 implements StudentService {
	
private StudentDao dao;
public StudentServiceImp1()
{
	dao = new StudentDaoImp1();
	}

	@Override
	public void addStudent(Student student) {
	dao.beginTransaction();
	dao.addStudent(student);
	dao.commiTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commiTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commiTransaction();
	}
	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id);
		
		return student;
	}

}

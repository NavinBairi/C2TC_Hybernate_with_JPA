package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Student student = new Student();
		student.setNAME("Navin");
		
		Address homeAddress = new Address();
		homeAddress.setAddress_Street("Adarsh nagar");
		homeAddress.setAddress_City("Vapi");
		homeAddress.setAddress_State("Gujarat");
		homeAddress.setAddress_ZipCode(396165);

		//inject address into student table
		student.setAddress(homeAddress);
		
		em.persist(student);
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		System.out.println("Added one employee and manager to database.");
	}

}

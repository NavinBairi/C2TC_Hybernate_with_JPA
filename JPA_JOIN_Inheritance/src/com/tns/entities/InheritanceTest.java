package com.tns.entities;

import javax.persistence.*;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee employee = new Employee();  // object : employee
		employee.setName("Navin");
		employee.setSalary(1516);	
		em.persist(employee); 
	
		Manager manager = new Manager();
		manager.setName("Akash");
		manager.setSalary(2646);
		manager.setDepartmentName("IT");
		em.persist(manager);   // insert
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		System.out.println("done");		
	}

}

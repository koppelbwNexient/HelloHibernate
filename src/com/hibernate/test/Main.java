package com.hibernate.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		//student.setId(1);
		student.setName("Carl jones");
		student.setBirthday(new Date());
		
		Student student2 = new Student();
		//student.setId(2);
		student2.setName("Miley Cyrus");
		student2.setBirthday(new Date());
		
		Student waldo;
		
		
		// Contains all the data regarding the hibernate config file
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		
		// Opens a database connection
		Session session = sessionFactory.openSession();
		
		// Retrieves a Student object from the database
		waldo = (Student) session.get(Student.class, 2);
		System.out.println("Waldo's new name is: " + waldo.getName());
		
		// Database usage 
		session.beginTransaction();
		session.save(student);
		session.save(student2);
		session.getTransaction().commit();
		session.close();
		
		// Closes a database connection
		sessionFactory.close();
		
	}

}

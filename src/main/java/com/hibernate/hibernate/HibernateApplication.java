package com.hibernate.hibernate;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SpringBootApplication
public class HibernateApplication {

	public static void main(String[] args) {

		Employee emp=new Employee();
		emp.setEmpId(102);
		emp.setEmpName("Shreyansh");
		emp.setEmpDept("CSE");


		Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(emp);
		transaction.commit();




	}

}

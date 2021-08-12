package com.entlogics.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entlogics.entity.Instructor;
import com.entlogics.entity.InstructorDetail;
import com.entlogics.entity.Student;

public class CreateBiDemo3 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			InstructorDetail id = session.get(InstructorDetail.class, 1);
			
			System.out.println(id);
			
			System.out.println(id.getI());
			
			session.getTransaction().commit();
			
			System.out.println("Done..");

		} finally {
			factory.close();
		}
	}

}

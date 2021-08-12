package com.entlogics.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entlogics.entity.Instructor;
import com.entlogics.entity.InstructorDetail;
import com.entlogics.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			Instructor i = new Instructor("steph","rock","stephenrock@");
			
			InstructorDetail id = new InstructorDetail("http://gg","jjjj");
			
			i.setInstructorDetail(id);
			
			session.beginTransaction();

			session.save(i);
			
			session.getTransaction().commit();
			
			System.out.println("Done..");

		} finally {
			factory.close();
		}
	}

}

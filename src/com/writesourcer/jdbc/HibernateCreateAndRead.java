package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;

public class HibernateCreateAndRead {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			User sam = new User("Sam", "Ham", "sham@hsu.edu", "Sham2021%");
			
			session.beginTransaction();
			
			session.save(sam);
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			User getSam = session.get(User.class, sam.getId());
			
			session.getTransaction().commit();			
			
			System.out.println(getSam);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			factory.close();
		}
		
	}

}

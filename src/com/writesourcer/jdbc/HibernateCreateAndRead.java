package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;
import com.writesourcer.models.UserProfile;

public class HibernateCreateAndRead {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(UserProfile.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			User f = new User("joeintheknow", "Joe", "Flow", "jflow@yahoo.com", "joe2021%");
			
			session.beginTransaction();
			
			session.save(f);
			
			session.getTransaction().commit();
			
			
			session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			User getF = session.get(User.class, f.getId());
			
			System.out.println(f.getId());
			
			session.getTransaction().commit();
			
			System.out.println("Complete new user: " + getF);
			
			System.out.println(getF);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			factory.close();
		}
		
	}

}

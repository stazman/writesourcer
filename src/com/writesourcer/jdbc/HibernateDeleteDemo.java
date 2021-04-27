package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;
import com.writesourcer.models.UserProfile;

public class HibernateDeleteDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			.addAnnotatedClass(UserProfile.class)
			.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			int theId = 5;
			
			session.beginTransaction();
			
			User u = session.get(User.class, theId);

			if ( u != null) {
				
				session.delete(u);
				
				System.out.println(u);
				
				session.getTransaction().commit();
				
			} 
			
		} finally {
			
			session.close();	
		}
		

	}

}

package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;

public class HibernateSessionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				//Not required; hibernate will find the hibernate.cfg.xml file by default
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			User tempUser = new User("Joe", "Smith", "jsmith@gmail.com", "JS2021%");
			
			session.beginTransaction();
			
			session.save(tempUser);
			
			session.getTransaction().commit();
			
			
		} finally {
			factory.close();
		}

	}

}

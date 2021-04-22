package com.writesourcer.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;

public class QueryTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {


		SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			List<User> users = session
			.createQuery("from User")
			.getResultList();
			
			
			//Note that both queries can be done within the same transaction
			
//			session.getTransaction().commit();
			
			System.out.println(users);
			
//			session = factory.getCurrentSession();
//			
//			session.beginTransaction();
			
			users = session
				.createQuery("from User u where u.firstName LIKE 'Tom'")
				.getResultList();
			
			System.out.println(users);
			
			users = session
				.createQuery("from User u where u.firstName = 'Frank' OR u.lastName = 'Smith'")
				.getResultList();
			
			System.out.println(users);
			
			users = session
				.createQuery("from User u where u.email LIKE '%yahoo.com'")
				.getResultList();
			
			System.out.println(users);
			
			session.getTransaction().commit();
			
			
		} finally {

			factory.close();
		}
		
	}

}

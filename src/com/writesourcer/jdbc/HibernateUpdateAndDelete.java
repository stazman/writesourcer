package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;
import com.writesourcer.models.UserProfile;

public class HibernateUpdateAndDelete {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			
			//This child class was needed though it wasn't used because of the existing association:
			
			.addAnnotatedClass(UserProfile.class)
			.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
						
//			User newJan = new User("jantothemax", "Jan", "Jones", "jjones@hsu.edu", "Jan2021%");
//			
//			UserProfile janProfile = new UserProfile("I'm Jan Jones.", "jj", "jj", "jj", "aa, bb, cc", "", "", "", "", "");							
			

			session.beginTransaction();
			

			//Two ways to update:
			
			session.createQuery("update User set email = 'jjones@yahoo.com' where lastName = 'Jones'")
				.executeUpdate();
			
			
			int janId = 6;
			
			User jan = session.get(User.class, janId);
			
			jan.setEmail("jjones@crazytown.com");
					
			System.out.println(jan.getEmail());

			
			//Two ways to delete
			
			session.delete(jan);
			
			System.out.println(jan);
			
			session.getTransaction().commit();
			
			System.out.println(jan);

			
			//Note: I apparently wasn't allowed to re-create Jan this way
			
//			session.beginTransaction();
//			
//			newJan.setUserProfile(janProfile);
//			
//			System.out.println(newJan);
//			
//			session.getTransaction().commit();
//
//			System.out.println(newJan);
//			System.out.println("new Jan is made");

			
//			session.beginTransaction();
			
			
			session.createQuery("delete from User u where u.username = 'jantothemax'")
				.executeUpdate();
			
//			System.out.println(newJan);
			
			System.out.println(jan);

			
			session.getTransaction().commit();
			
//			System.out.println(newJan);
			
			System.out.println(jan);

			
		} finally {

			factory.close();
		
		}
		
	}
}

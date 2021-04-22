package com.writesourcer.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;
import com.writesourcer.models.UserProfile;

public class CreateWithOneToOne {

	
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(UserProfile.class)
				.buildSessionFactory();
			
			Session session = factory.getCurrentSession();
			
			//Note: There's no need for exception handling because Hibernate takes care of it for us!
			try {
				
				User jan = new User("jantothemax", "Jan", "Jones", "jjones@hsu.edu", "Jan2021%");
				
				UserProfile janProfile = new UserProfile("I'm Jan Jones.", "jj", "jj", "jj", "aa, bb, cc", "", "", "", "", "");				
						
				jan.setUserProfile(janProfile);
				
				session.beginTransaction();
				
				
				//Note: this will also save the userprofile object because of CascadeType.ALL
				
				session.save(jan);
				
				
				session.getTransaction().commit();;

				
				System.out.println("Saved: " + jan);
				
				
			} finally {

				factory.close();
			
			}
			
			
		}
	}

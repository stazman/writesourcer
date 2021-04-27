package com.writesourcer.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.writesourcer.models.User;
import com.writesourcer.models.UserProfile;

public class HibernateBiDirOneToOneReadandDelete {

	public static void main(String[] args) {
		
		//To get user by user profile
		
		SessionFactory factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			.addAnnotatedClass(UserProfile.class)
			.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			int theId = 1;
			
			session.beginTransaction();
			
			UserProfile up = session.get(UserProfile.class, theId);

			//To delete both user and profile when the user's profile is deleted 
			//(through cascade type ALL)
			
			//or To delete just the profile
			//(through cascade= {CascadeType.DETACH, CascadeType.MERGE, 
			//CascadeType.PERSIST, CascadeType.REFRESH} in UserProfile ...
			
			//but you have to break the relationship between User and UserProfile
			//or the deleted UserProfile object would be re-saved, incorrectly of course, 
			//by the association with User as it's coded ... and the user_profile_id for the 
			//user is changed to null in the MySQL db
			
//			up.getUser().setUserProfile(null);

			
//			session.delete(up);
			
			System.out.println(up);
			
			System.out.println(up.getUser());
			
			
			session.getTransaction().commit();
		
		
		} catch (Exception e){
			
			e.printStackTrace();
			
		} finally {
			
			session.close();
			
			factory.close();	
		}
		

	}

}


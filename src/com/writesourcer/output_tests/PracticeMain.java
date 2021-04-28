package com.writesourcer.output_tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.writesourcer.models.ScienceFantasyGroups;

public class PracticeMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ScienceFantasyGroups sfgs = context.getBean(ScienceFantasyGroups.class, "scienceFantasyGroups");
		
		System.out.println(sfgs.joinRequest());
		
		context.close();
		
	}

}

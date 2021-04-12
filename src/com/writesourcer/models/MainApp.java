package com.writesourcer.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        //load the Spring Configuration path
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from Spring container
        WritersGroup wg = context.getBean("scienceFictionGroups", WritersGroup.class);

        //call methods on the bean
        System.out.println(wg.joinRequest());

        //close the context
        context.close();
    }
}

package com.writesourcer.output_tests;

import com.writesourcer.models.ScienceFictionGroups;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceMainApp {

    public static void main(String[] args) {

        //load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configs/applicationContext.xml");

        // retrieve bean from spring container

        ScienceFictionGroups sfgs = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        // call methods on the bean

        System.out.println(sfgs.joinRequest());
        System.out.println(sfgs.listGroups());

//        System.out.println(sfgs.getModerator());
//        System.out.println(sfgs.getName());
//        System.out.println(sfgs.getDescription());



        // close the context

        context.close();
    }
}

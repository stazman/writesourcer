package com.writesourcer.models;

import com.writesourcer.services.ScienceFictionService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceMainApp {

    public static void main(String[] args) {

        //load the spring configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container

        ScienceFictionGroups sfgs = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        // call methods on the bean

        System.out.println(sfgs.joinRequest());
        System.out.println(sfgs.listGroups());


        // close the context

        context.close();
    }
}

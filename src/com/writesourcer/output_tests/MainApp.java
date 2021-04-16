package com.writesourcer.output_tests;

import com.writesourcer.models.WritersGroup;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        //load the Spring Configuration path
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configs/applicationContext.xml");

        //retrieve bean from Spring container
        WritersGroup wgsf = context.getBean("scienceFictionGroups", WritersGroup.class);
        WritersGroup wgsfan = context.getBean("scienceFantasyGroups", WritersGroup.class);

        //call methods on the bean
        System.out.println(wgsf.joinRequest());
        System.out.println(wgsfan.joinRequest());

        System.out.println(wgsf.listGroups());
        System.out.println(wgsfan.listGroups());


        //close the context
        context.close();
    }
}

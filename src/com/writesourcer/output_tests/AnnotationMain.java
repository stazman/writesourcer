package com.writesourcer.output_tests;

import com.writesourcer.models.WritersGroup;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configs/applicationContext.xml");

        WritersGroup wg = context.getBean("scienceFictionGroups", WritersGroup.class);

        System.out.println(wg.joinRequest());

        System.out.println(wg.listGroups());

        System.out.println(wg.getServiceMessage());


    }
}

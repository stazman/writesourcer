package com.writesourcer.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ScienceFictionGroups sfgs = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        System.out.println(sfgs.listGroups());

    }
}

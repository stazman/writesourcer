package com.writesourcer.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifecycle - applicationContext.xml");

        ScienceFictionGroups sfgs = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        System.out.println(sfgs.joinRequest());
        System.out.println(sfgs.listGroups());

        context.close();

    }
}

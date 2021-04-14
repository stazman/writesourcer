package com.writesourcer.models;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        ScienceFictionGroups sfwg = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        ScienceFictionGroups sfwg2 = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        boolean checkSingleton = ( sfwg == sfwg2);

        System.out.println(checkSingleton);

        System.out.println(sfwg2);
        System.out.println(sfwg);

        context.close();
    }
}


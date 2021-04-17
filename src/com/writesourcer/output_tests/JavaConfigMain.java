package com.writesourcer.output_tests;

import com.writesourcer.configs.WritersGroupsConfig;
import com.writesourcer.models.ScienceFictionGroups;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WritersGroupsConfig.class);

        ScienceFictionGroups sfgs = context.getBean("scienceFictionGroups", ScienceFictionGroups.class);

        System.out.println(sfgs.listGroups());

        System.out.println(sfgs.joinRequest());

        System.out.println(sfgs.getServiceMessage());

        System.out.println(sfgs.getModerator());

        System.out.println(sfgs.getName());

        System.out.println(sfgs.getDescription());

        context.close();

    }

}

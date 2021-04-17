package com.writesourcer.output_tests;

import com.writesourcer.configs.WritersGroupsConfig;
import com.writesourcer.models.WritersGroup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WritersGroupsConfig.class);

        WritersGroup wg = context.getBean("scienceFictionGroups", WritersGroup.class);

        System.out.println(wg.listGroups());

        System.out.println(wg.joinRequest());

        System.out.println(wg.getServiceMessage());

        context.close();

    }

}

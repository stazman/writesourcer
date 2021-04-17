package com.writesourcer.models;

import com.writesourcer.services.WritersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ScienceFictionGroups implements WritersGroup  {

    @Value("${wg.moderator}")
    private String moderator;

    @Value("${wg.name}")
    private String name;

    @Value("${wg.description}")
    private String description;


    private WritersGroupService wgserv;

    public ScienceFictionGroups() {
    }

    @Autowired
    @Qualifier("scienceFictionGroupsService")
    public void setWgserv(WritersGroupService wgserv) {
        this.wgserv = wgserv;
    }

    @Override
    public String joinRequest(){
        return "Join one of our fine Science Fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "Here is a list of all of our fine Science Fiction Groups.";
    }

    @Override
    public String getServiceMessage() {
        return wgserv.getMessage();
    }

    @PostConstruct
    private void startupTest() {
        System.out.println("This is a custom startup lifecycle method being executed.");
    }

    @PreDestroy
    private void destroyTest() {
        System.out.println("This is a custom destroy lifecycle method being executed.");
    }
}
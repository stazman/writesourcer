package com.writesourcer.models;

import com.writesourcer.services.WritersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScienceFictionGroups implements WritersGroup  {

    private WritersGroupService wgserv;

    @Autowired
    public ScienceFictionGroups(WritersGroupService thewgserv) {
        wgserv = thewgserv;
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

    private void startupTest() {
        System.out.println("This is a custom startup lifecycle method being executed.");
    }

    private void destroyTest() {
        System.out.println("This is a custom destroy lifecycle method being executed.");
    }
}
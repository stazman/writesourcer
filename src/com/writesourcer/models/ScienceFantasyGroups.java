package com.writesourcer.models;

import com.writesourcer.services.WritersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ScienceFantasyGroups implements WritersGroup {

    private WritersGroupService wgserv;

    @Autowired
    @Qualifier("scienceFantasyGroupsService")
    public void setWgserv(WritersGroupService thewgserv) {
        this.wgserv = thewgserv;
    }

    @Override
    public String joinRequest() {
        return "Join one of our fine Science Fantasy groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "Here is a list of all of our fine Science Fantasy Groups.";
    }

    @Override
    public String getServiceMessage() {
        return wgserv.getMessage();
    }
}

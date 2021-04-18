package com.writesourcer.models;

import com.writesourcer.services.WritersGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GeneralFictionGroups implements WritersGroup {

    private WritersGroupService wgserv;

    @Autowired
    @Qualifier("scienceFantasyGroupsService")
    public void setWgserv(WritersGroupService thewgserv) {
        this.wgserv = thewgserv;
    }


    @Override
    public String joinRequest() {
        return null;
    }

    @Override
    public String listGroups() {
        return null;
    }

    @Override
    public String getServiceMessage() {
        return null;
    }
}

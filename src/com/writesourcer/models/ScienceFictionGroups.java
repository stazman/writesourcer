package com.writesourcer.models;

import com.writesourcer.services.ScienceFictionService;

public class ScienceFictionGroups implements WritersGroup {

    private ScienceFictionService sfserv;

    public ScienceFictionGroups(ScienceFictionService theSfserv) {
        sfserv = theSfserv;
    }

    public String joinRequest(){
        return "Join one of our fine Science Fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return sfserv.serviceMessage();
    }

    public ScienceFictionService getSfGroupsService() {
        return sfserv;
    }

    public void setSfGroupsService(ScienceFictionService sfserv) {
        this.sfserv = sfserv;
    }
}
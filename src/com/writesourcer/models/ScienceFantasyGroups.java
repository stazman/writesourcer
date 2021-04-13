package com.writesourcer.models;

import com.writesourcer.services.ScienceFantasyService;
import com.writesourcer.services.ScienceFictionService;

public class ScienceFantasyGroups implements WritersGroup {

    private ScienceFantasyService sfanserv;

    public ScienceFantasyGroups(ScienceFantasyService theSfanserv) {
        sfanserv = theSfanserv;
    }

    @Override
    public String joinRequest() {
        return "Join one of our fine Science Fantasy groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return sfanserv.serviceMessage();
    }
}

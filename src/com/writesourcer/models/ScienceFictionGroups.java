package com.writesourcer.models;

import com.writesourcer.services.ScienceFictionService;

public class ScienceFictionGroups implements WritersGroup {

    private ScienceFictionService sfserv;

    public ScienceFictionGroups(ScienceFictionService sfserv) {
        this.sfserv = sfserv;
    }

    public String joinRequest(){
        return "Join one of our fine Science Fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "This is a list of all the Science Fiction groups you can join.";
    }
}
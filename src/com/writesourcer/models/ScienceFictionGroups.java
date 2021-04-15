package com.writesourcer.models;

import com.writesourcer.services.ScienceFictionService;
import org.springframework.stereotype.Component;

@Component("scienceFictionGroups")
public class ScienceFictionGroups extends WritersGroups implements WritersGroup {

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

    private void startupTest() {
        System.out.println("This is a custom startup lifecycle method being executed.");
    }

    private void destroyTest() {
        System.out.println("This is a custom destroy lifecycle method being executed.");
    }
}
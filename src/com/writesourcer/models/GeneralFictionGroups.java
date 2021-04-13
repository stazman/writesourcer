package com.writesourcer.models;

public class GeneralFictionGroups implements WritersGroup {


    @Override
    public String joinRequest() {
        return "Join one of our fine General Fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "This is a list of all the General Fiction groups you can join.";
    }
}

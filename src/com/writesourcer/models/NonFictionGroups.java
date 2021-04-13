package com.writesourcer.models;

public class NonFictionGroups implements WritersGroup {

    @Override
    public String joinRequest() {
        return "Join one of our fine Non-fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "This is a list of all the Non-fiction groups you can join.";
    }
}

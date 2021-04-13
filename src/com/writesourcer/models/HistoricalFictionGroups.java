package com.writesourcer.models;

public class HistoricalFictionGroups implements WritersGroup {

    @Override
    public String joinRequest() {
        return "Join one of our fine Historical Fiction groups to improve your writing!";
    }

    @Override
    public String listGroups() {
        return "This is a list of all the Historical Fiction groups you can join.";
    }
}

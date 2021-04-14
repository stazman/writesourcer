package com.writesourcer.models;

public class WritersGroups implements WritersGroup {

    public String moderator;
    public String name;
    public String description;

    public WritersGroups() {
    }


    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String joinRequest() {
        return null;
    }

    @Override
    public String listGroups() {
        return null;
    }
}

package com.writesourcer.services;

import org.springframework.stereotype.Component;

@Component
public class ScienceFantasyGroupsService implements WritersGroupService {
    @Override
    public String getMessage() {
        return "This service is for handling messages to Science Fantasy groups.";
    }
}

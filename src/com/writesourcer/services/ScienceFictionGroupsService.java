package com.writesourcer.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ScienceFictionGroupsService implements WritersGroupService {

    @Override
    public String getMessage() {
        return "This service is for handling messages to Science Fiction groups.";
    }
}
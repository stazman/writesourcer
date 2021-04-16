package com.writesourcer.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ScienceFictionService implements WritersGroupService {

    @Override
    public String getMessage() {
        return "This service is for handling messages to Science Fiction groups.";
    }
}
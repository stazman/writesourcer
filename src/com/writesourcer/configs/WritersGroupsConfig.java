package com.writesourcer.configs;

import com.writesourcer.models.ScienceFictionGroups;
import com.writesourcer.models.WritersGroup;
import com.writesourcer.services.ScienceFictionGroupsService;
import com.writesourcer.services.WritersGroupService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.writesourcer")
public class WritersGroupsConfig {

    @Bean
    public WritersGroupService scienceFictionGroupsService(){
        return new ScienceFictionGroupsService();
    }

    @Bean
    public WritersGroup scienceFictionGroups() {
        ScienceFictionGroups sfg = new ScienceFictionGroups(scienceFictionGroupsService());
        return sfg;
    }

}

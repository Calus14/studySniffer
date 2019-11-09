package com.blackmesa.studysniffer.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class StudySnifferConfig {


    @PostConstruct
    public void postConstruct() {
        for(int i = 0; i < 10; i++)
        System.out.println("HELELELAJSDLFJASLDJFJLASDFJASDFJL");
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

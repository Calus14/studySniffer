package com.blackmesa.studysniffer.controller;


import com.blackmesa.studysniffer.domain.api.StudySnifferApi;
import com.blackmesa.studysniffer.domain.dto.StudyDto;
import com.blackmesa.studysniffer.domain.dto.StudySummaryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/studySniffer")
public class StudySnifferController implements StudySnifferApi {

    @Override
    public StudySummaryDto getStudySummary(StudyDto dto) {
        return null;
    }
}

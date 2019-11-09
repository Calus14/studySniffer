package com.blackmesa.studysniffer.service;

import com.blackmesa.studysniffer.domain.dto.StudyDto;
import com.blackmesa.studysniffer.domain.dto.StudySummaryDto;
import com.blackmesa.studysniffer.repository.StudyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudySummaryServiceImpl implements StudySummaryService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private StudyRepository studyRepository;
    @Autowired

    // TODO Replace this. Only making return static final so we can probe the database
    static final UUID testId = UUID.randomUUID();
    public UUID getStudyId(StudyDto studyDto){
        return testId;
    }

    /* Handle the fact that we are requiring to find the same study summary, maybe add a count too how much
     people search for the same study. Also handle what happens if we get the same study but a different summary...
     */
    public StudySummaryDto getStudySummary(StudyDto studyDto) {
        UUID studyId = this.getStudyId(studyDto);
        boolean alreadySeenStudy = false;
        if( studyRepository.studyExistsById(this.getStudyId(studyDto) ) )
        {
            System.out.println("Found a credential");
            alreadySeenStudy = true;
        }
        else {
            System.out.println("No user found");
        }

        StudySummaryDto studySummary = modelMapper.map(studyDto, StudySummaryDto.class);
        // TODO Other logic

        return studySummary;
    }
}

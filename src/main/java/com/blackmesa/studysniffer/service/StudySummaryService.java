package com.blackmesa.studysniffer.service;

import com.blackmesa.studysniffer.domain.dto.StudyDto;
import com.blackmesa.studysniffer.domain.dto.StudySummaryDto;

import java.util.UUID;

public interface StudySummaryService {

    UUID getStudyId(StudyDto studyDto);

    StudySummaryDto getStudySummary(StudyDto studyDto);

}

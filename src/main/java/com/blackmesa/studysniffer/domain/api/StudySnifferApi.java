package com.blackmesa.studysniffer.domain.api;

import com.blackmesa.studysniffer.domain.dto.StudyDto;
import com.blackmesa.studysniffer.domain.dto.StudySummaryDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

public interface StudySnifferApi {

    // Method that the client will send down the the running application querying for the historical process data
    //
    @RequestMapping(value = "/getStudySummary",
                    method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    StudySummaryDto getStudySummary(StudyDto dto);
}

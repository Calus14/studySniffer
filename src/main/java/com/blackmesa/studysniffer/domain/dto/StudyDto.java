package com.blackmesa.studysniffer.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.UUID;

//TODO As posted on the trello board someone please do this shiiiiiit
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StudyDto {
    @NotNull
    String studyText;
}

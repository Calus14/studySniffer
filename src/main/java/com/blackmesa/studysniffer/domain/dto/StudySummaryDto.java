package com.blackmesa.studysniffer.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

// TODO Someone also needa do this Cacaaaaaa
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class StudySummaryDto {

    @NotNull
    String studySummary;
}

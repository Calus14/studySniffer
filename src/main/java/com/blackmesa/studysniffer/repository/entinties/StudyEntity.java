package com.blackmesa.studysniffer.repository.entinties;

import com.blackmesa.studysniffer.domain.dto.StudySummaryDto;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "studys")
@Data
public class StudyEntity {
    @Id
    @Column(name = "study_id", nullable = false, unique = true)
    private UUID study_id;

    @Column(name = "study_text", nullable = false, unique = true)
    private String study_text;

    @Embedded
    @Column(name = "study_summary", nullable = true, unique = false)
    private StudySummaryDto study_summary;
}

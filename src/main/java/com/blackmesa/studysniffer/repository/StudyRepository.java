package com.blackmesa.studysniffer.repository;

import com.blackmesa.studysniffer.repository.entinties.StudyEntity;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudyRepository extends CrudRepository<StudyEntity, UUID>{

    @Query(nativeQuery = true, value = "SELECT EXISTS ( SELECT * from studys where study_id = :studyId)")
    boolean studyExistsById(@Param("studyId") UUID studyId);
}

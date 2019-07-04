package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.TimeLog;

import net.bytebuddy.implementation.bind.annotation.Default;

@Repository
public interface TimeLogRepository extends JpaRepository<TimeLog, Long> {

}
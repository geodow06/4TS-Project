package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}

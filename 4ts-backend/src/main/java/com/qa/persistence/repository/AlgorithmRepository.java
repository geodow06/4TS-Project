package com.qa.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.Algorithm;

@Repository
public interface AlgorithmRepository extends JpaRepository<Algorithm, Long> {
	
}
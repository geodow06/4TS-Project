package com.qa.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Group;


public interface GroupRepository extends JpaRepository<Group,Long>{

}

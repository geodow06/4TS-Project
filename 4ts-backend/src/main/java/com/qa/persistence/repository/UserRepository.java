package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.persistence.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByUserName(String username);
}
package com.qa.persistence.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomMethodsRepository {
	public boolean checkUsernames(String userName); 
	public List<String> getAllUsernames(); 
	//public Algorithm findAlgorithmByName(String name);
}

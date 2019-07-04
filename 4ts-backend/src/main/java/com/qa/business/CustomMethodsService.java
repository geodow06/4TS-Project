package com.qa.business;

import java.util.List;

import com.qa.persistence.domain.User;

public interface CustomMethodsService {
	public boolean checkUsernames(String username);

	public List<String> getAllUsernames(); 
	public boolean deleteById(Long iD);
}

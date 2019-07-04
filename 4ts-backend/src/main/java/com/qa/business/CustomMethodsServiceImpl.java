package com.qa.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.User;
import com.qa.persistence.repository.CustomMethodsRepository;
import com.qa.persistence.repository.UserRepository;

@Service
public class CustomMethodsServiceImpl implements CustomMethodsService {

	@Autowired
	private UserServiceImpl svc;

	@Override
	public boolean checkUsernames(String username) {
		List<String> usernames = getAllUsernames();
		for (int i = 0; i < usernames.size(); i++) {
			if (usernames.get(i).equals(username)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<String> getAllUsernames() {
		List<User> users = svc.getAllUsers();
		List<String> usernames = new ArrayList<>();
		for (User user : users) {
			usernames.add(user.getUserName());
		}
		return usernames;
	}

	@Override
	public boolean deleteById(Long iD) {
		// TODO Auto-generated method stub
		return false;
	}


}

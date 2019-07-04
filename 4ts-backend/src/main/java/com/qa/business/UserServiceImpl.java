package com.qa.business;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.persistence.domain.User;
import com.qa.persistence.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CustomMethodsServiceImpl svc;

	@Override
	public String addUser(String userName, String userPassword) {
		User aUser = new User();
		aUser.setUserName(userName);
		aUser.setUserPassword(userPassword);

		if (userName.length() < 5 || userPassword.length() < 5) {
			return "Your username and password must be atleast five characters long";
		} else if (svc.checkUsernames(userName)) {
			return userName + " has already been taken please choose another";
		} else {
			userRepo.save(aUser);
			return "User " + userName + " succesfully added.";
		}
	}

	@Override
	public List<User> getAllUsers() {

		return userRepo.findAll();
	}

	@Override
	public User getAUser(Long userID) {

		return userRepo.findById(userID).get();

	}

	@Override
	public String updateUser(String userName, String userPassword, Long userID) {

		User aUser = getAUser(userID);
		if (aUser != null) {
			User newUser = aUser;

			newUser.setUserName(userName);
			newUser.setUserPassword(userPassword);
			userRepo.save(newUser);
		} else {

		}
		return "User " + userID + " updated";
	}

	@Override
	public boolean deleteUser(Long userID) {

		userRepo.deleteById(userID);
		return userRepo.existsById(userID);
	}

	@Override
	public List<String> getUserFriends(Long userID) {
		User aUser = getAUser(userID);

		if (aUser != null) {

			List<String> friendsList = aUser.getFriends();
			return friendsList;
		} else {
			return null;
		}
	}

	@Override
	public User logInUser(String username, String Password) {
		List<User> users = getAllUsers();

		for (User user : users) {

			if (user.getUserName().equals(username) && user.getUserPassword().contentEquals(Password)) {
				return user;

			}

		}
		User nullUser = new User();
		return nullUser;

	}

	@Override
	public User getAdmin(String username) {
		User admin = userRepo.findByUserName(username);

		return admin;
	}

	@Override
	public List<String> getMutualFriends(Long userID, Long friendID) {
		// TODO Auto-generated method stub
		return null;
	}

}

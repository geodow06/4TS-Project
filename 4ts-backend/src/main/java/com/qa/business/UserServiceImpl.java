package com.qa.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.persistence.domain.Algorithm;
import com.qa.persistence.domain.TimeLog;
import com.qa.persistence.domain.User;
import com.qa.persistence.repository.AlgorithmRepository;
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
	public List<Algorithm> getUserAlgs(Long userID) {
		User aUser = getAUser(userID);
		List<User> allUsers = getAllUsers();
		if (aUser != null) {

			List<Algorithm> algList = aUser.getUserAlgs();
			return algList;
		} else {
			return null;
		}
	}

	@Override
	public List<TimeLog> getUserAlgTimes(Long userID, Long algID) {
		List<Algorithm> userAlgs = getUserAlgs(userID);
		List<TimeLog> algTimes = new ArrayList<TimeLog>();
		for (Algorithm alg : userAlgs) {
			if (alg.getAlgID() == algID) {
				algTimes = alg.getTimeLogs();

			} else {
				continue;
			}
		}
		return algTimes;

	}

	@Override
	public User logInUser(String username, String Password) {
		List<User> users = getAllUsers();

		for (User user : users) {

			if (user.getUserName().equals(username)&&user.getUserPassword().contentEquals(Password)) {
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

}

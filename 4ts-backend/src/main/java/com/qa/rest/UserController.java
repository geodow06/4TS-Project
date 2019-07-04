package com.qa.rest;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.business.UserServiceImpl;
import com.qa.persistence.domain.User;

@RestController
public class UserController {
	@Autowired
	public UserServiceImpl svc;

	@RequestMapping("/addUser/{userName}/{userPassword}")
	public String addUser(@PathVariable String userName, @PathVariable String userPassword) {

		return svc.addUser(userName, userPassword);
	}

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {

		return svc.getAllUsers();
	}

//	@RequestMapping(value = " /getAUser/{userId}", method=RequestMethod.GET)
	@RequestMapping("/getAUser/{userID}")
	public User getAUser(@PathVariable Long userID) {

		return svc.getAUser(userID);
	}

	@RequestMapping("/updateUser/{userName}/{userPassword}/{userID}")
	public String updateUser(@PathVariable String userName, @PathVariable String userPassword,
			@PathVariable Long userID) {

		return svc.updateUser(userName, userPassword, userID);
	}

	@RequestMapping("/deleteUser/{userID}")
	public boolean deleteUser(@PathVariable Long userID) {

		return svc.deleteUser(userID);
	}

	@RequestMapping("logInUser/{userName}/{userPassword}")
	public User logInUser(@PathVariable String userName, @PathVariable String userPassword) {
		return svc.logInUser(userName, userPassword);

	}
}

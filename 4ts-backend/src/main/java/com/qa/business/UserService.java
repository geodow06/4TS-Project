package com.qa.business;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.qa.persistence.domain.*;

public interface UserService {
	// C
	public String addUser(String userName, String userPassword);

	public List<Algorithm> getUserAlgs(Long userID);

	// R
	public List<User> getAllUsers();

	public User getAUser(Long userID);

	public List<TimeLog> getUserAlgTimes(Long userID, Long algID);

	public User logInUser(String username, String Password);

	public User getAdmin(String username);

	// U
	public String updateUser(String userName, String userPassword, Long userId);

	// D
	public boolean deleteUser(Long userID);

//	public int cycleUsers(String user_name);
}

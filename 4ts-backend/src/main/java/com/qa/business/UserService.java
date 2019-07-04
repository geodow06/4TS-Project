package com.qa.business;

import java.util.List;
import com.qa.persistence.domain.*;

public interface UserService {
	// C
	public String addUser(String userName, String userPassword);

	// R
	public List<User> getAllUsers();

	public User getAUser(Long userID);

	public User logInUser(String username, String Password);

	public User getAdmin(String username);

	List<String> getUserFriends(Long userID);

//	Maybe a getFriendsFriend method to find mutual 
	List<String> getMutualFriends(Long userID, Long friendID);

	// U
	public String updateUser(String userName, String userPassword, Long userId);

	// D
	public boolean deleteUser(Long userID);

}

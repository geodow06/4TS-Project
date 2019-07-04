package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userID")
	private Long userID;

	@Column(name = "Username")
	private String userName;

	@Column(name = "Password")
	private String userPassword;
	
	@Column(name = "Email") 
	private String email;  
	
	@Column(name = "groupID") 
	private Long groupID;
	
	@Column(name = "Friends") 
	private List<String> friends;
//  Will have to change how the mapping works to accommodate multiple memberships
//	@Column(name = "Memberships") 
//	private Set<Long> memberships;  
	
	
	
	public User() {

	}

	public User(Long userID, String userName, String userPassword, String email, Long groupID, List<String> friends) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
		this.email = email;
		this.groupID = groupID; 
		this.friends = friends;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getGroupID() {
		return groupID;
	}

	public void setGroupID(Long groupID) {
		this.groupID = groupID;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + ", email="
				+ email + ", groupID=" + groupID + ", friends=" + friends + "]";
	}

	

	




}

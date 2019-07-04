package com.qa.persistence.domain;

import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID", nullable = false, insertable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@Column(name = "userAlgs")
	private List<Algorithm> userAlgs;

	public User() {

	}

	public User(Long userID, String userName, String userPassword, List<Algorithm> userAlgs) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAlgs = userAlgs;
	}

	public Long getUserID() {
		return userID;
	}

	public List<Algorithm> getUserAlgs() {
		return userAlgs;
	}

	public void setUserAlgs(List<Algorithm> userAlgs) {
		this.userAlgs = userAlgs;
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

	@Override
	public String toString() {
		return String.format("User[userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userAlgs=" + userAlgs + "]", userID, userName, userPassword, userAlgs);
	}

}

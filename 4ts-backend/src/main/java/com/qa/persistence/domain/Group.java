package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity 
@Table(name = "Group")
public class Group { 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "groupID") 
	private Long groupID;
	
	@Column(name = "groupName") 
	private String groupName; 
	
//	@Column(name = "admin") 
//	private String admin;
	
	@Column(name ="key") 
	private String key;
	
	@OneToMany(fetch = FetchType.EAGER) 
	@JoinColumn(name = "groupID", nullable = false, insertable = false, updatable = false) 
	@OnDelete(action = OnDeleteAction.CASCADE) 
	private List<User> members; 
	
	public Group() { 
		
	}

	public Group(Long groupID, String groupName, List<User> members, String admin, String key) {
		super();
		this.groupID = groupID;
		this.groupName = groupName;
//		this.admin = admin; 
		this.key = key;
		this.members = members;
	}

	public Long getGroupID() {
		return groupID;
	}

	public void setGroupID(Long groupID) {
		this.groupID = groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	} 
	
	

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

//	public String getAdmin() {
//		return admin;
//	}
//
//	public void setAdmin(String admin) {
//		this.admin = admin;
//	}
	
	
	
	public List<User> getMembers() {
		return members;
	}

	public void setMembers(List<User> members) {
		this.members = members;
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName +  ", key=" + key
				+ ", members=" + members + "]";
	}

	
	
}

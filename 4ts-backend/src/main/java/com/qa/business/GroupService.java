package com.qa.business;

import java.util.List;

public interface GroupService {
//	C 
	public String addGroup(String groupName, String creatorName, String key); 
	
	public String addMember(Long groupName, String creatorName, String key); 
	
//	R 
	public List<String> getMembersNames(Long groupID); 
	
//	U 
	
	
//	D 
	public boolean RemoveMemberByName(String name); 
	
	public boolean deleteGroup(String groupName);
	
	
	
	
}

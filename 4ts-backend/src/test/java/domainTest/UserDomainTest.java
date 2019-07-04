package domainTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.User;

public class UserDomainTest {

	User user;

//	List<Algorithm> userAlgs = new ArrayList<Algorithm>();
	Long userID = 1L;
	String password = "password";
	String username = "username";
	Long newUserID = 2L; 
	String newUserName = "new username";
	String newUserPassword = "new password"; 
//	List<Algorithm> newUserAlgs = new ArrayList<>();
//	@Before
//	public void setup() {
//		Algorithm alg1 = new Algorithm();
//		Algorithm alg2 = new Algorithm();
//		userAlgs.add(alg1);
//		userAlgs.add(alg2);
//		user = new User(1L, username, password, userAlgs);
//
//	}


	
	@Test 
	public void testGetUserID() { 
		assertEquals(userID, user.getUserID());
	} 
	@Test 
	public void testSetUserID() { 
		user.setUserID(newUserID); 
		assertEquals(newUserID, user.getUserID());
	}
	@Test 
	public void testGetUserName() { 
		assertEquals(username, user.getUserName());
	} 
	@Test 
	public void testSetUserName() { 
		
		user.setUserName(newUserName); 
		assertEquals(newUserName, user.getUserName());
	}
	@Test 
	public void testGetUserPassword() { 
		assertEquals(password, user.getUserPassword());
	} 
	@Test 
	public void testSetUserPassword() { 
		
		
		user.setUserPassword(newUserPassword); 
		assertEquals(newUserPassword, user.getUserPassword());
	}
//	@Test 
//	public void testGetUserAlgs() { 
//		assertEquals(userAlgs, user.getUserAlgs());
//	} 
//	@Test 
//	public void testSetUserAlgs() { 
//		user.setUserAlgs(newUserAlgs); 
//		assertEquals(newUserAlgs, user.getUserAlgs());
//	}

}

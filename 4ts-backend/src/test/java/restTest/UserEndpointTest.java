package restTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.mapping.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.business.UserServiceImpl;
import com.qa.persistence.domain.User;
import com.qa.rest.UserController;

@RunWith(MockitoJUnitRunner.class)
public class UserEndpointTest {
	private static final String testString = "test";
	private static final String testUserName = "username";
	private static final String testUserPassword = "password";
	private static final Long testLong = 1L;

	private static final List<User> MOCK_USERLIST = new ArrayList<>();

	private static final User MOCK_USER = new User();
	@InjectMocks
	UserController uCon;

	@Mock
	UserServiceImpl svc;

	@Mock
	User user;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllUsers() {

		Mockito.when(svc.getAllUsers()).thenReturn(MOCK_USERLIST);
		assertEquals(MOCK_USERLIST, uCon.getAllUsers());
	}

	@Test
	public void testGetAUser() {
		User MOCK_OBJECT = new User();
		Mockito.when(svc.getAUser(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, uCon.getAUser(testLong));
	}

	@Test
	public void testUpdateAUser() {
		Mockito.when(svc.updateUser(testUserName, testUserPassword, testLong)).thenReturn(testString);
		assertEquals(testString, uCon.updateUser(testUserName, testUserPassword, testLong));
	}

	@Test
	public void testDeleteUser() {
		boolean testBoolean = true;
		Mockito.when(svc.deleteUser(testLong)).thenReturn(testBoolean);
		assertEquals(testBoolean, uCon.deleteUser(testLong));
	}

	@Test
	public void testLogInUer() {
		Mockito.when(svc.logInUser(testUserName, testUserPassword)).thenReturn(MOCK_USER);
		assertEquals(MOCK_USER, uCon.logInUser(testUserName, testUserPassword));
	}

	@Test
	public void testAddUser() {
		Mockito.when(svc.addUser(testUserName, testUserPassword)).thenReturn(testString);
		assertEquals(testString, uCon.addUser(testUserName, testUserPassword));
	}
}

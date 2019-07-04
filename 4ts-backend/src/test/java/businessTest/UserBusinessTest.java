package businessTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.business.UserServiceImpl;
import com.qa.persistence.domain.User;
import com.qa.persistence.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserBusinessTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	private static final User MOCK_USER = new User();
	private static final List<User> MOCK_LIST = new ArrayList<>();
	@InjectMocks
	UserServiceImpl svc;

	@Mock
	UserRepository userRepo;

	@Mock
	User User;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllUsers() {

		Mockito.when(userRepo.findAll()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllUsers());
	}

	@Test
	public void testGetAUser() {
		Mockito.when(userRepo.findById(testLong)).thenReturn(Optional.of(MOCK_USER));
		assertEquals(Optional.of(MOCK_USER), Optional.of(svc.getAUser(testLong)));
	}

	@Test
	public void testUpdateUser() {
		String response = "User 1 updated";
		// assertEquals(response, svc.updateUser(testString, testString, testLong));

	}

	@Test
	public void testDeleteUser() {

		boolean response = false;
		assertEquals(response, svc.deleteUser(testLong));

	}

	@Test
	public void testAddUser() {
		assertEquals("Your username and password must be atleast five characters long", svc.addUser("123", "123"));
		// assertEquals("User username succesfully added.",svc.addUser("username",
		// "password"));
	}

	@Test
	public void testGetUserAlgs() {
		// TODO
	}

	@Test
	public void testGetUserAlgTimes() {
		// TODO
	}

	@Test
	public void testLogInUser() {
		// TODO
	}

	@Test
	public void testGetAdmin() {

		assertEquals(null, svc.getAdmin(testString));
	}
}

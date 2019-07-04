package businessTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.qa.business.CustomMethodsServiceImpl;
import com.qa.business.TimeLogServiceImpl;
import com.qa.persistence.domain.TimeLog;
import com.qa.persistence.domain.User;
import com.qa.persistence.repository.CustomMethodsRepository;
import com.qa.persistence.repository.TimeLogRepository;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomMethodsBusinessTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";

	@InjectMocks
	CustomMethodsServiceImpl svc;

	@Mock
	CustomMethodsRepository repo;

	@Before
	public void setup() {

	}

	@Test
	public void testGetAllUsernames() {

		// List<String> MOCK_LIST = Arrays.asList("test", "test", "test");
		// Mockito.when(testString).thenReturn(testString);
		// assertEquals(MOCK_LIST, svc.getAllUsernames());
	}

	@Test
	public void testCheckUsernames() {

	}
}

package restTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.business.CustomMethodsServiceImpl;
import com.qa.rest.CustomMethodsController;

@RunWith(MockitoJUnitRunner.class)
public class CustomMethodsEndpointTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	private static final List<String> MOCK_LIST = new ArrayList<>();
	@InjectMocks
	CustomMethodsController cMCon;
	@Mock
	CustomMethodsServiceImpl svc;

	@Before
	public void setup() {

	}

	@Test
	public void testCheckUsernames() {
		Mockito.when(svc.checkUsernames(testString)).thenReturn(true);
		assertEquals(true, cMCon.checkUsernames(testString));
	}

	@Test
	public void testGetAllUsernames() {

		Mockito.when(svc.getAllUsernames()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, svc.getAllUsernames());
	}
}

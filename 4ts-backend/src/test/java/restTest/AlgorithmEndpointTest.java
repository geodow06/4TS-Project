package restTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.business.AlgorithmServiceImpl;
import com.qa.persistence.domain.Algorithm;
import com.qa.persistence.domain.TimeLog;
import com.qa.rest.AlgorithmController;

@RunWith(MockitoJUnitRunner.class)
public class AlgorithmEndpointTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	private static final Algorithm MOCK_OBJECT = new Algorithm();
	private static final List<Algorithm> MOCK_LIST = new ArrayList<>();
	@InjectMocks
	AlgorithmController aCon;

	@Mock
	AlgorithmServiceImpl svc;

	@Mock
	Algorithm Algorithm;

	@Before
	public void setup() {
//		uCon.svc;
	}
	
	@Test 
	public void testCreateAlgorithm() { 
		String response = "Algorithm test successfully created";
		Mockito.when(svc.createAlgorithm(testString, testString, testString, testLong)).thenReturn(response);
		assertEquals(response, aCon.createAlgorithm(testString, testString, testString, testLong));
	}
	
	@Test
	public void testGetAllAlgorithms() {

		Mockito.when(svc.getAllAlgorithms()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, aCon.getAllAlgorithms());
	}

	@Test
	public void testGetAnAlgorithm() {

		Mockito.when(svc.getAnAlgorithm(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, aCon.getAnAlgorithm(testLong));
	}

	@Test
	public void testUpdateAlgorithm() {
		Mockito.when(svc.updateAlgorithm(testString, testString, testString, testLong)).thenReturn(testString);
		assertEquals(testString, aCon.updateAlgorithm(testString, testString, testString, testLong));

	}

	@Test
	public void testDeleteAlgorithm() {
		Mockito.when(svc.deleteAlgorithm(testLong)).thenReturn(true);
		assertEquals(true, aCon.deleteAlgorithm(testLong));
	}

	@Test
	public void testGetRandomAlgorithm() {
		Mockito.when(svc.getRandomAlgorithm(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, aCon.getRandomAlgorithm(testLong));
	}
}

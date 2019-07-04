package restTest;

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
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.business.TimeLogServiceImpl;
import com.qa.persistence.domain.TimeLog;
import com.qa.rest.TimeLogController;

@RunWith(MockitoJUnitRunner.class)
public class TimeLogEndpointTest {
	private static final Long testLong = 1L;
	private static final String testString = "test";
	private static final TimeLog MOCK_OBJECT = new TimeLog();
	@InjectMocks
	TimeLogController tCon;
	@Mock
	TimeLogServiceImpl svc;

	@Mock
	TimeLog TimeLog;

	@Before
	public void setup() {
//		uCon.svc;
	}

	@Test
	public void testGetAllTimeLogs() {
		List<TimeLog> MOCK_LIST = Arrays.asList(TimeLog, TimeLog);
		Mockito.when(svc.getAllTimeLogs()).thenReturn(MOCK_LIST);
		assertEquals(MOCK_LIST, tCon.getAllTimeLogs());
	}

	@Test
	public void testGetATimeLog() {

		Mockito.when(svc.getATimeLog(testLong)).thenReturn(MOCK_OBJECT);
		assertEquals(MOCK_OBJECT, tCon.getATimeLog(testLong));
	}

	@Test
	public void testUpdateATimeLog() {
		Mockito.when(svc.updateTimeLog(testString, testLong, testLong)).thenReturn(testString);
		assertEquals(testString, tCon.updateTimeLog(testString, testLong, testLong));
	}

	@Test
	public void testDeleteTimeLog() {
		Mockito.when(svc.deleteTimeLog(testLong)).thenReturn(true);
		assertEquals(true, tCon.deleteTimeLog(testLong));
	}

	@Test
	public void testCreateTimeLog() {
		// TODO
		Mockito.when(svc.createTimeLog(testString, testLong)).thenReturn(testString);
		assertEquals(testString, tCon.addTimeLog(testString, testLong));
	}

	@Test
	public void testGet3Avg() {
		Mockito.when(svc.get3Avg(testLong, testLong)).thenReturn(testString);
		assertEquals(testString, tCon.get3Avg(testLong, testLong));

	}
}

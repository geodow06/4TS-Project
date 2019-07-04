package domainTest;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Algorithm;
import com.qa.persistence.domain.TimeLog;
import com.qa.persistence.domain.User;

public class TimeLogDomainTest {
	TimeLog timeLog;

	Long timeID = 1L;
	String time = "time";
	Long algID = 1L;
	Long newTimeID = 2L;
	String newTime = "new time";
	Long newAlgID = 2L;

	@Before
	public void setup() {

		timeLog = new TimeLog(timeID, time, algID);
	}

	@Test
	public void testGetTimeID() {
		assertEquals(timeID, timeLog.getTimeID());
	}
 
	@Test
	public void testSetTimeID() {

		timeLog.setTimeID(newTimeID);
		assertEquals(newTimeID, timeLog.getTimeID());
	}

	@Test
	public void testGetTime() {
		assertEquals(time, timeLog.getTime());
	}

	@Test
	public void testSetTime() {

		timeLog.setTime(newTime);
		assertEquals(newTime, timeLog.getTime());
	}

	@Test
	public void testGetAlgID() {
		assertEquals(algID, timeLog.getAlgID());
	}

	@Test
	public void testSetAlgID() {

		timeLog.setAlgID(newAlgID);
		assertEquals(newAlgID, timeLog.getAlgID());
	}
}

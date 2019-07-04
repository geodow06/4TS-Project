package domainTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Algorithm;
import com.qa.persistence.domain.TimeLog;
import com.qa.persistence.domain.User;

public class AlgorithmDomainTest {

	Algorithm algorithm;

	Long algID = 1L;
	String name = "name";
	String moves = "moves";
	String scramble = "scramble";
	List<TimeLog> timeLogs = new ArrayList<TimeLog>();
	Long userID = 1L;
	// private static final Algorithm MOCK_OBJECT = mock(Algorithm.class);

	@Before
	public void setup() {
		TimeLog timeLog1 = new TimeLog();
		TimeLog timeLog2 = new TimeLog();
		timeLogs.add(timeLog1);
		timeLogs.add(timeLog2);
		algorithm = new Algorithm(algID, name, moves, scramble, timeLogs, userID);

	}

	@Test
	public void testGetAlgID() {
		assertEquals(algID, algorithm.getAlgID());
	}

	@Test
	public void testGetName() {
		assertEquals(name, algorithm.getName());
	}

	@Test
	public void testGetMoves() {
		assertEquals(moves, algorithm.getMoves());
	}

	@Test
	public void testGetScramble() {
		assertEquals(scramble, algorithm.getScramble());
	}

	@Test
	public void testGetTimeLogs() {
		assertEquals(timeLogs, algorithm.getTimeLogs());
	}

	@Test
	public void testGetUserID() {
		assertEquals(userID, algorithm.getUserID());
	}

	@Test
	public void testSetAlgID() {
		Long newAlgID = 2L;
		algorithm.setAlgID(newAlgID);
		assertEquals(newAlgID, algorithm.getAlgID());
	}

	@Test
	public void testSetName() {
		String newName = "new name";
		algorithm.setName(newName);
		assertEquals("new name", algorithm.getName());

	}

	@Test
	public void testSetMoves() {
		String newMoves = "new moves";
		algorithm.setMoves(newMoves);
		assertEquals("new moves", algorithm.getMoves());
	}

	@Test
	public void testSetScramble() {
		String newScramble = "new scramble";
		algorithm.setScramble(newScramble);
		assertEquals("new scramble", algorithm.getScramble());
	}

	@Test
	public void testSetTimeLogs() {
		algorithm.setTimeLogs(timeLogs);
		assertEquals(timeLogs, algorithm.getTimeLogs());
	}

	@Test
	public void testSetUserID() {
		Long newUserID = 2L;
		algorithm.setUserID(newUserID);
		assertEquals(newUserID, algorithm.getUserID());
	}

}

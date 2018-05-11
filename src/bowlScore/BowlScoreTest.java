package bowlScore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlScoreTest {

	private BowlScore bowlscore;
	
	@Before
	public void setUp() {
		bowlscore = new BowlScore();
	}
	
	@Test
	public void shouldReturnNine() {
		int input = 9;
		assertEquals(String.valueOf(input), bowlscore.registerScore(input));
	}

	
}

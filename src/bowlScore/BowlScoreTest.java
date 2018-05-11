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
		String input = "9";
		assertEquals(String.valueOf(input), bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnZero() {
		String input = "dash";
		assertEquals(String.valueOf("0"), bowlscore.registerScore(input));
	}

	
}

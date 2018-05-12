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
		String[] input = {"9"};
		assertEquals(String.valueOf(input), bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnZero() {
		String[] input = {"dash"};
		assertEquals(String.valueOf("0"), bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnThree() {
		String[] input = {"3"};
		assertEquals(String.valueOf("3"), bowlscore.registerScore(input));
	}

	@Test
	public void shouldAlsoReturnZero() {
		String[] input = {"foul"};
		assertEquals(String.valueOf("0"), bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnTen() {
		String[] input = {"strike"};
		assertEquals(String.valueOf("10"), bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn9() {
		String[] input = {"4", "5"};
		assertEquals(String.valueOf("9"), bowlscore.registerScore(input));
	}
	
	
}

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
		assertEquals(9, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnZero() {
		String[] input = {"dash"};
		assertEquals(0, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnThree() {
		String[] input = {"3"};
		assertEquals(3, bowlscore.registerScore(input));
	}

	@Test
	public void shouldAlsoReturnZero() {
		String[] input = {"foul"};
		assertEquals(0, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnTen() {
		String[] input = {"strike"};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn9() {
		String[] input = {"4", "5"};
		assertEquals(9, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn5() {
		String[] input = {"3", "2"};
		assertEquals(5, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn10() {
		String[] input = {"4", "spare"};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn10() {
		String[] input = {"8", "spare"};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
}

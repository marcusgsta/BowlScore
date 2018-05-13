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
	public void shouldReturn30() {
		int[] input = {1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2};
		assertEquals(30, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn38() {
		int[] input = {1,9, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2};
		assertEquals(38, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn46() {
		int[] input = {1,9, 1,9, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2};
		assertEquals(46, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn40() {
		int[] input = {10, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2, 1,2};
		assertEquals(40, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn0() {
		int[] input = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		assertEquals(0, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn45() {
		int[] input = {10, 10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		assertEquals(45, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn75() {
		int[] input = {10, 10, 10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		assertEquals(75, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn93() {
		int[] input = {10, 10, 10, 3,3, 0,0, 4,6, 4,0, 0,0, 0,0, 0,0};
		assertEquals(93, bowlscore.registerScore(input));
	}
	
	
}

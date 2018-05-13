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
	
	
	/*
	@Test
	public void shouldReturnZilch() {
		int[] input = {9};
		assertEquals(0, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturnZero() {
		int[] input = {0};
		assertEquals(0, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn0Too() {
		int[] input = {3};
		assertEquals(0, bowlscore.registerScore(input));
	}

	/* Test for foul ball
	 * 
	 */
	/*
	@Test
	public void shouldAlsoReturnZero() {
		int[] input = {0};
		assertEquals(0, bowlscore.registerScore(input));
	}
	*/
	/*
	 * Test for one strike
	 */
	/*
	@Test
	public void shouldReturn0() {
		int[] input = {10};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn9() {
		int[] input = {4, 5};
		assertEquals(9, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn5() {
		int[] input = {3, 2};
		assertEquals(5, bowlscore.registerScore(input));
	}
	*/
	/*
	 * Test for spare (2 balls)
	 */
	/*
	@Test
	public void shouldReturn0Aswell() {
		int[] input = {4, 6};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldAlsoReturn10() {
		int[] input = {8, 2};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn10() {
		int[] input = {10, 7};
		assertEquals(10, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldAlsoReturnNine() {
		int[] input = {0, 9};
		assertEquals(9, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn7() {
		int[] input = {4, 3, 4};
		assertEquals(7, bowlscore.registerScore(input));
	}

	@Test
	public void shouldReturn14() {
		int[] input = {4, 6, 4};
		assertEquals(14, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn28() {
		int[] input = {10, 8, 1};
		assertEquals(28, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldAlsoReturn28() {
		int[] input = {10, 8, 1, 4};
		assertEquals(28, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn35() {
		int[] input = {10, 8, 1, 4, 3};
		assertEquals(35, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn41() {
		int[] input = {10, 10, 1, 4, 3};
		assertEquals(41, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn21() {
		int[] input = {10, 10, 1};
		assertEquals(20, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn25() {
		int[] input = {10, 10, 1, 4};
		assertEquals(41, bowlscore.registerScore(input));
	}
	*/
}

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
	/*
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
	
	@Test
	public void shouldReturn107() {
		int[] input = {10, 10, 10, 3,7, 3,0, 4,6, 4,0, 0,0, 0,0, 0,0};
		assertEquals(107, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn300() {
		int[] input = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		assertEquals(300, bowlscore.registerScore(input));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
		int[] input = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 7, 7, 7};
		Object o = bowlscore.registerScore(input);
	}
	
	@Test
	public void shouldReturn267() {
		int[] input = {10, 10, 10, 10, 10, 10, 10, 10, 10, 9, 0};
		assertEquals(267, bowlscore.registerScore(input));
	}
	
	*/
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowException() {
		int[] frameOne = {2, 4, 3};
		int[][] input = {frameOne};
		Object o = bowlscore.registerScore(input);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowException2() {
		int[] frameOne = {2};
		int[][] input = {frameOne};
		Object o = bowlscore.registerScore(input);
	}

	
	@Test(expected = IndexOutOfBoundsException.class)
	public void shouldThrowExceptionTooManyFrames() {
		int[] frameOne = {1,5};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[] frameEleven = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen, frameEleven};
		Object o = bowlscore.registerScore(input);
	}   
	
	@Test
	public void shouldReturn81() {
		int[] frameOne = {1,5};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(81, bowlscore.registerScore(input));
	}                                                               		
	
	@Test
	public void shouldReturn94() {
		int[] frameOne = {10,0};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(94, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn88() {
		int[] frameOne = {1,9};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(88, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn103() {
		int[] frameOne = {10,0};
		int[] frameTwo = {4,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(103, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn112() {
		int[] frameOne = {10,0};
		int[] frameTwo = {10,0};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(112, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn98() {
		int[] frameOne = {8,2};
		int[] frameTwo = {5,5};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,6};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(98, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn90() {
		int[] frameOne = {1,5};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,8,7};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(90, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn92() {
		int[] frameOne = {1,5};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {10,7,2};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(92, bowlscore.registerScore(input));
	} 
	
	@Test
	public void shouldReturn93() {
		int[] frameOne = {1,5};
		int[] frameTwo = {3,6};
		int[] frameThree = {7,2};
		int[] frameFour = {3,6};
		int[] frameFive = {4,4};
		int[] frameSix = {5,3};
		int[] frameSeven = {3,3};
		int[] frameEight = {4,5};
		int[] frameNine = {8,1};
		int[] frameTen = {2,8,10};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(93, bowlscore.registerScore(input));
	}
	
	@Test
	public void shouldReturn300() {
		int[] frameOne = {10,10};
		int[] frameTwo = {10,10};
		int[] frameThree = {10,10};
		int[] frameFour = {10,10};
		int[] frameFive = {10,10};
		int[] frameSix = {10,10};
		int[] frameSeven = {10,10};
		int[] frameEight = {10,10};
		int[] frameNine = {10,10};
		int[] frameTen = {10,10,10};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(300, bowlscore.registerScore(input));
	}
}

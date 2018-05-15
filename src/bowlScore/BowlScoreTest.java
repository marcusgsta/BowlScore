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
	
	@Test
	public void shouldReturn135() {
		int[] frameOne = {6,3};
		int[] frameTwo = {7,1};
		int[] frameThree = {8,2};
		int[] frameFour = {7,2};
		int[] frameFive = {10,0};
		int[] frameSix = {6,2};
		int[] frameSeven = {7,3};
		int[] frameEight = {10,0};
		int[] frameNine = {8,0};
		int[] frameTen = {7,3,10};
		int[][] input = { frameOne, frameTwo, frameThree, frameFour, frameFive, frameSix, frameSeven, frameEight, frameNine, frameTen};
		assertEquals(135, bowlscore.registerScore(input));
	}
	
}

package bowlScore;

import java.util.Arrays;

public class BowlScore {

	public Object registerScore(int[][] input) {
		int strike = 0;
		int[] frames = new int[10];
		int currentFrame = 0;
		int ball = 1;
		int partScore = 0;
		boolean isSpare = false;
		int totalScore = 0;
		int strikeBonus = 0;
		int spareBonus = 0;
		boolean strikeStep = false;
		boolean lastFrame = false;
		int count;
		int[] game = new int[10];
		
		if (input.length != 10) {
			throw new IndexOutOfBoundsException("Index is out of bounds!");
		}
			// loop through all frames
		for (int m = 0; m < input.length; m++) {
			// loop through frame
			//count = 0;
			
			for ( int h = 0; h < input[m].length; h++ ) {
				if ( input[m].length != 2 ) {
					throw new IndexOutOfBoundsException("Index is out of bounds!");
				}
				// for all valid balls, add the regular points
				if (input[m][h] >= 0 || input[m][h] <= 10)
					partScore += input[m][h];
				
				if ( strikeStep == true ) {
					strikeBonus += input[m][h];
					strikeStep = false;
				}
				if ( strike == 1 ) {
					strikeBonus += input[m][h];
					strike = 0;
					strikeStep = true;
				} else if ( isSpare == true ) {
					spareBonus += input[m][h];
					isSpare = false;
				}
				
				// if strike
				if ( input[m][h] == 10 ) {
					strike += 1;
					break;
					
					//frames[currentFrame] = totalScore;
					/*currentFrame++;
					if ( currentFrame == 10) {
						lastFrame = true;
					}*/
					// if strike in last frame
				/*} else if ( input[m][h] == 10 && lastFrame == true) {
						ball = 0;
				}*/
				
				}
				if ( partScore == 10 ) {
					isSpare = true;
					System.out.println(isSpare);
				}

			}
			// add gathered points and reset partScore
			totalScore += partScore;
			partScore = 0;	
		}
		/*
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0 || input[i] <= 10)
				partScore += input[i];
			
				if ( ball == 1 ) {
					if ( strikeStep == true ) {
						strikeBonus += input[i];
						strikeStep = false;
					}
					if ( strike == 1 ) {
						strikeBonus += input[i];
						strike = 0;
						strikeStep = true;
					} else if ( isSpare == true ) {
						spareBonus += input[i];
						isSpare = false;
					}

					if ( input[i] == 10 && lastFrame == false) {
						strike += 1;
						totalScore += partScore;
						partScore = 0;
						ball = 0;
						frames[currentFrame] = totalScore;
						currentFrame++;
						if ( currentFrame == 10) {
							lastFrame = true;
						}
						// if strike in last frame
					} else if ( input[i] == 10 && lastFrame == true) {
							ball = 0;
					}
				}
				
				
				if ( ball == 2 ) {
					if ( strikeStep == true ) {
						strikeBonus += input[i];
						strikeStep = false;
					}
					if ( partScore == 10 ) {
						isSpare = true;
					} else if ( partScore != 10) {
						if ( strike == 1 ) {
							strikeBonus += input[i];
							strike--;
						}
					}
					totalScore += partScore;
					partScore = 0;
					ball = 0;
					frames[currentFrame] = totalScore;
					currentFrame++;
				} 
				
				ball++;
				
		}
		*/
		totalScore += spareBonus;
		totalScore += strikeBonus;
		//int totalSum = totalScore;
		return totalScore;
	}
}

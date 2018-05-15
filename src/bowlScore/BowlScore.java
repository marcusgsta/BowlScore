package bowlScore;

import java.util.Arrays;

public class BowlScore {

	public Object registerScore(int[][] input) {
		int strike = 0;
		int partScore = 0;
		boolean isSpare = false;
		int totalScore = 0;
		int strikeBonus = 0;
		int spareBonus = 0;
		boolean strikeStep = false;
		// Number of frames must be 10
		if (input.length != 10) {
			throw new IndexOutOfBoundsException("Index is out of bounds!");
		}
			// loop through all frames
		for (int m = 0; m < input.length; m++) {
			// loop through frame
			
			// if length of a frame is not 2, it has to begin with either a strike or a spare
			for ( int h = 0; h < input[m].length; h++ ) {
				// if length of a frame is not 2
				if ( input[m].length != 2 ) {
					// check for strike in last frame
					if ( input[m][0] == 10) {
						
					// check for spare in last frame
					} else if ( input[m][0] + input[m][1] == 10) {
						
					} else {
						throw new IndexOutOfBoundsException("Index is out of bounds!");
					}
				}

				// for all valid balls, add the regular points
				if (input[m][h] >= 0 || input[m][h] <= 10)
					partScore += input[m][h];
				// check for second ball after a strike "strikeStep"
				if ( strikeStep == true ) {
					strikeBonus += input[m][h];
					strikeStep = false;
				}
				// check for strike
				if ( strike == 1 ) {
					strikeBonus += input[m][h];
					strike = 0;
					strikeStep = true;
					// check for spare
				} else if ( isSpare == true ) {
					spareBonus += input[m][h];
					isSpare = false;
				}
				
				// if strike, remember this for the next throws, unless in last frame
				if ( input[m][h] == 10 && Arrays.asList(input).indexOf(input[m]) != 9) {
					strike += 1;
					break;
				}
				// if spare, remember this unless in last frame
				if ( partScore == 10 && Arrays.asList(input).indexOf(input[m]) != 9) {
					isSpare = true;
				}
			}
			// add gathered points and reset partScore
			totalScore += partScore;
			partScore = 0;	
		}
		// add bonuses for spares and strike to total
		totalScore += spareBonus;
		totalScore += strikeBonus;
		return totalScore;
	}
}

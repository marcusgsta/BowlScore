package bowlScore;

public class BowlScore {

	public Object registerScore(int[] input) {
		int strike = 0;
		int currentFrame = 0;
		int ball = 1;
		int partScore = 0;
		boolean isSpare = false;
		int totalScore = 0;
		int strikeBonus = 0;
		int spareBonus = 0;
		boolean strikeStep = false;
		boolean lastFrame = false;
		
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
					currentFrame++;
				} 
				
				ball++;
		}

		
		totalScore += spareBonus;
		totalScore += strikeBonus;
		int totalSum = totalScore;
		return totalSum;
	}
}

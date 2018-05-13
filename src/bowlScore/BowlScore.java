package bowlScore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(int[] input) {
		int strike = 0;
		boolean spare = false;
		int currentFrame = 0;
		int[] frames = new int[10];
		int count = 1;
		int partScore = 0;
		int[] balls;
		int currentBall = 0;
		boolean frameIsOver = false;
		boolean isSpare = false;
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0 || input[i] <= 10)
				partScore += input[i];
				//System.out.println(partScore);

			
				if ( count == 1 && partScore != 10 ) {
					if (isSpare == true) {
						frames[currentFrame-1] += partScore;
						isSpare = false;
					}
				}
				
				if ( count == 1 && partScore == 10 ) {
					strike += 1;
					frames[currentFrame] += partScore;
					if ( strike == 2 ) {
						frames[currentFrame-1] += partScore;
						//strike -= 1;
					}
					frameIsOver = true;
					count = 0;
					currentFrame++;
					partScore = 0;
				}
				
				if ( count == 2 && partScore != 10 ) {
					frames[currentFrame] += partScore;
					if ( strike == 1 ) {
						frames[currentFrame-1] += partScore;
						strike -= 1;
					}
					if ( strike == 2 ) {
						frames[currentFrame-2] += partScore;
						strike -= 1;
					}
					frameIsOver = true;
					partScore = 0;
					currentFrame++;
					count = 0;
				}
				
				if ( count == 2 && partScore == 10 ) {
					frames[currentFrame] += partScore;
					frameIsOver = true;
					isSpare = true;
					
					partScore = 0;
					currentFrame++;
					count = 0;
				}
				
				/*if ( count == 2 && strike == 1) {
					frames[currentFrame-1] += partScore + 10;
					frames[currentFrame] += partScore;
					strike -= 1;
					partScore = 0;
					currentFrame++;
					count = 0;
				}*/
				/*
				if ( count == 2 && strike == 0) {
					if ( partScore != 10) { // if not spare
						System.out.println("partScore" + partScore);
						frames[currentFrame] += partScore;
						currentFrame++;
						partScore = 0;
					}
					if ( partScore == 10 ) { // if spare
						spare = true;
						currentFrame++;
					}
				}
				
				if ( count == 2 && partScore == 10 ) {
					strike += 1;
					currentFrame++;
					partScore = 0;
				}
				

				
				if ( count == 3 && strike == 1 ) {
					frames[currentFrame-1] += 10 + partScore;
					frames[currentFrame] += partScore;
					partScore = 0;
					count = 0;
					strike -= 1;
				}
				
				if ( count == 3 && strike == 2 ) {
					frames[currentFrame-2] += 10 + 10 + partScore;
					strike -= 1;
					count = 0;
				}
				
				if ( count == 3 && spare == true) {
					frames[currentFrame-1] += partScore;
					partScore = 0;
					spare = false;
					count = 0;
				}
				*/
				count++;
				//currentFrame++;
		}
		
		int sum = IntStream.of(frames).sum();
		System.out.println(Arrays.toString(frames));

		//System.out.println(sum);
		//totalSum = partSum;
		return sum;
	}


	

}

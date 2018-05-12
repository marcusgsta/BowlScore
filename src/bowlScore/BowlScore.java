package bowlScore;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(int[] input) {
		int totalSum;
		int partSum = 0;
		boolean strike = false;
		boolean spare = false;
		int savedPoints = 0;
		int currentFrame = 0;
		int lastFrame = currentFrame - 1;
		int[] frames = new int[10];
		int count = 1;
		int partScore = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0 || input[i] <= 10)
				partScore += input[i];
				if ( count == 2)
					frames[currentFrame] += partScore;
					currentFrame++;
					partScore = 0;
				count++;
			
				/*
				partSum += input[i];
				if (count == 2)
					frames[frameNr] += ( input[i] + input[i-1] );
				frames[frameNr] += input[i];
				
				// if (input[i] == 10)
					//strike = true;
				if ( input[i] > 0 )
					if ( input[i-1] + input[i] == 10 )
						spare = true;
				if ( spare == true )
					frames[lastFrame] += input[i];
				
			count++;
			*/
		}
		
		int sum = IntStream.of(frames).sum();
		System.out.println(Arrays.toString(frames));

		System.out.println(sum);
		//totalSum = partSum;
		return sum;
	}


	

}

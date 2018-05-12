package bowlScore;

import java.util.stream.IntStream;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(int[] input) {
		int totalSum;
		int partSum = 0;
		int strike = 0;
		int savedPoints = 0;
		int[] frames = new int[10];
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0 || input[i] <= 10)
				partSum += input[i];
				frames[0] += input[i];
				
				//if (strike == 1)
					
				
				//if (input[i] == 10)
				//	strike += 1;
				//	frames[0] += 10;
		}
		
		int sum = IntStream.of(frames).sum();

		System.out.println(sum);
		totalSum = partSum;
		return totalSum;
	}


	

}

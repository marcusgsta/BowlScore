package bowlScore;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(int[] input) {
		int totalSum;
		int partSum = 0;
		int strike = 0;
		int[] frames = new int[10];
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= 0 || input[i] <= 10)
				partSum += input[i];
		}
		
		totalSum = partSum;
		return totalSum;
	}


	

}

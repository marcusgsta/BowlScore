package bowlScore;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(String[] input) {
		int totalSum;
		int partSum = 0;
		for (int i = 0; i < input.length; i++)
			if (input[i] == "dash" || input[i] == "foul")
				partSum += 0;
			else if (input[i] == "strike")
				partSum += 10;
			else {
				int intInput;
				intInput = Integer.parseInt(input[i]);
				if (intInput > 0 || intInput < 10)
					partSum += intInput;
			}
		totalSum = partSum;
		return totalSum;
	}


	

}

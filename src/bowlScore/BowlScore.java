package bowlScore;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(String input) {
		if (input == "dash" || input == "foul")
			return "0";
					
		int intInput;
		intInput = Integer.parseInt(input);
		
		if (intInput > 0 || intInput < 10)
			return String.valueOf(input);

		return null;
	}


	

}

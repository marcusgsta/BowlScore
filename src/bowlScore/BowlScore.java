package bowlScore;

public class BowlScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Object registerScore(String input) {
		if (String.valueOf(input) == "9")
			return String.valueOf(input);
		if (input == "dash")
			return "0";
		return null;
	}


	

}

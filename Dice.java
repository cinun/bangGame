import java.util.Random;

public class Dice{
	
	public static String[] SYMBOLS = {"Indian arrow", "Dynamite", "Bull\'s Eye \"1\"", "Bull\'s Eye \"2\"", "Beer", "Gatling"};

	public static String rollDice(){
		Random rand = new Random();

		int rand_no = rand.nextInt(6) ;

		return SYMBOLS[rand_no];
	}


}  
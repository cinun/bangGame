public class DiceTestDrive{

	public static void main(String[] args){

		Dice d1 = new Dice(), d2 = new Dice(), d3 = new Dice(), d4 = new Dice(), d5 = new Dice();

		System.out.println(d1.rollDice());
		System.out.println(d2.rollDice());
		System.out.println(d3.rollDice());
		System.out.println(d4.rollDice());
		System.out.println(d5.rollDice());

		System.out.println("1st dice re roll");

		System.out.println(d1.rollDice());

		
	}
}
import java.util.Random;

/**
   The Dice program implements an application that simply allows an
   input for a number of six-sided die and then returns the rolls for them.
  
   @author Camryn Way
   @since 2022-27-02
*/
public class Dice {

	/**
	   The rollDice method rolls a random number of die based on the numDice
	   parameter. Each random die roll can only be from 1-6. 
	   @param numDice The number of dice to be rolled
	   @return value Returns a stored random number between 1-6 
	*/
	public static int rollDice(int numDice) {
		{ 
         int value;
         Random r = new Random();
         value = r.nextInt(numDice * 5 + 1) + numDice;
         return value;
      }
   }
}
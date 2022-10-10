import java.util.Random;
/**
   * The Dice program implements an application that
   * simply allows for the user to input a number of six-sided dice 
   * and then rolls that dice.
   *
   * @author  Camryn Way
   * @since   2022-27-02 
*/
public class Dice
{   
   /**
      * Method to rollDice and allow input for numDice used
      * @param numDice is the paramater for the rollDice method
      * @return sum This adds all numbers within array.
   **/
   public static int rollDice(int numDice)
      {    
         int[] roll = new int[numDice];
         int sum = 0;
         
         for (int i = 0; i < roll.length; i++)
         {
            roll[i] = (int)(Math.random()*6)+1;
            sum = sum + roll[i];
         }
         
         return sum;
         
  /**
  Way #1
   public static int rollDice(int numDice)
      { 
         Random r = new Random();
         int total = 0;
         
         for(int i= 1;i <= numDice; i++)
         {
            total += r.nextint(6)+1;
         }
            return total;
         }
         
         int roll;
         roll = Dice.rollDice(1);       
  */
  /**
  Way #2
    public static int rollDice(int numDice)
      { 
         int value;
         Random r = new Random();
         value = r.nextint(numDice * 5 + 1) + numDice;
  
  */
  
      }
}

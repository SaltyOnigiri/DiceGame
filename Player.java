/**
   * The Player program implements an application that
   * simply allows the players name and score to be documented 
   * as well as updateing the score as the game progresses 
   *
   * @author  Camryn Way
   * @since   2022-27-02 
*/
public class Player
{
   private String name;
   private int score;
   
    /**
      *  Constructor
      *  @param name The name of the player
      *  @param score The score of the player
   **/
   public Player(String name)
   { 
      this.name = name;
      score = 0;
   }
   
  
   public Player(Player player)
   {
     name = player.name;
     score = player.score;
   }
   
   /**
      *  This method retrieves the int score
      *  @ return score
   **/
   public int getScore()
   {
      return score;
   }
   
   /**
      * This method updates the score paramater based on game
      * @param the score parameter
   **/
   public void updateScore(int score)
   {
      this.score += score;
   }
   
   /**
      * This method prints a string
      * @return name of player 
   **/
   public String toString()
   {
      return name;
   }
}
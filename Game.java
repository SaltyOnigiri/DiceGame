import java.util.Scanner;
/**
   * The Game program accepts input from the Player and Dice class
   * in order to create a turn based guessing game.
   *
   * @author  Camryn Way
   * @since   2022-27-02 
*/
public class Game
{
   private Player player1; //turns player1 into an object
   private Player player2; //turns player2 into an object
   
   //dependency -----> create an instance for the class
   Dice d = new Dice();

   /**
      *  Constructor creates two new player objects
      *  @param name1 This is the first parameter player1
      *  @param name2 This is the second Parameter player2
   **/
   public Game(String name1, String name2)
   { 
      player1 = new Player(name1);
      player2 = new Player(name2);
   }
   
   /**
   Proper Deep Copy!!!!!!!!!!
   public Game(Game game)
   {
      player1 = new player(game.player1);
      player2 = new player(game.player2);
   }
       
   **/
   //This is actually a Shallow Copy
   public Game(Game game)
   {
      player1 = game.player1;
      player2 = game.player2;  
   }
   
   /**
      *  playGame calls gameWon() to determine when game is over
      *  call determineWinner() to display information about winner when game is over
      *  call playerTurn to simulate each player turn on a round of the game
      *  display current score at end of round
   **/
   public void playGame()
   {
      do 
      {
         System.out.println(); //Adds a space to interface
         playerTurn(player1);
         playerTurn(player2);
         System.out.println(toString());
         System.out.println(); //Adds a space to interface
      }
      while(gameWon() == false);
      determineWinner();   
      
   }
   
    /**
      * toString prints a string
      * @return player names and scores
   **/
   public String toString()
   {
      return (player1 + ": " + player1.getScore() + " " + player2 + ": " + player2.getScore());
   }
 
   /**
      *  playerTurn prompts the user for their prediction
      *  rolls the die and updates the player’s score when appropriate
      *  @param choice accepts either "even" or "odd and determines score based on dice
   **/
   private void playerTurn(Player player)
    {
      String choice;
      
       //player input
       Scanner scanner = new Scanner(System.in); 
       System.out.print(player.toString() + ", enter your prediction (even/odd):");
       choice = scanner.nextLine();
         
       //validate user input
       while (!choice.equalsIgnoreCase("even") && !choice.equalsIgnoreCase("odd"))
       {
         System.out.println("Incorrect Input.....Please enter your prediction(even OR odd): ");
         choice = scanner.nextLine();
       }
       
       int dice = d.rollDice(1); //determines number of dice used in game
          
       //Verifies whether user input matches term definition 
       System.out.println("A " + dice + " was rolled.");
          if (choice.equalsIgnoreCase("even") && dice % 2 == 0)
          {
             System.out.println ("Adding " + dice + " to your score!");
             player.updateScore(dice);
          }
         
          else if (choice.equalsIgnoreCase("odd") && dice % 2 != 0)
          {
            System.out.println ("Adding " + dice + " to your score!");
            player.updateScore(dice);
          }
            
          else 
          {
             System.out.println("Better luck next time!");
          }
           
       }
    
   /**
      *  gameWon determines when the game is over
      *  @param status determines whether game is won:true or not:false
      *  @param w1 creates a parameter that gets player1s score
      *  @param w2 creates a parameter that gets player2s score
      *  @return a true status boolean if either w1 or w2 reach a score of 50
      *  @return a false status boolean if no players have won the game
   **/
   private boolean gameWon()
   {
      boolean status = false;
      int w1 = player1.getScore();
      int w2 = player2.getScore();
      
      if (w1 >= 50 || w2 >= 50)
      {
         return status = true; //game is over
      }
      else 
      {
         return status = false; //game continues
      }   
   }
   
   /**
      *  determineWinner determines who the winner is and displays the name of winner
      *  or an indication that there is a tie.
   **/
   //
   private void determineWinner()
   {
      if(player1.getScore() >= 50)
      {
         System.out.println("**********************************");
         System.out.println("The winner is " + player1 + "!");
         System.out.println("**********************************");
      }
      else if (player2.getScore() >= 50)
      {
         System.out.println("**********************************");
         System.out.println("The winner is " + player2 + "!");
         System.out.println("**********************************");
      }
      else if (player1.getScore() == player2.getScore())
      {
         System.out.println("The game is a Tie!");
      }  
   }
}
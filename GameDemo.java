import java.util.Scanner;

 public class GameDemo
  {
   public static void main(String[] args)
    {
    
    String s1;
    String s2;
    
    System.out.println("Welcome to the Dandy Die Game!");
    System.out.println("This game requires 2 players.");

      Scanner kybd = new Scanner(System.in);
      
      System.out.println("Enter the name of player 1:");
      s1 = kybd.nextLine();
      
      System.out.println("Enter the name of player 2:");   
      s2 = kybd.nextLine();
      
      Game g = new Game(s1, s2);
      
      g.playGame();
     }
    }

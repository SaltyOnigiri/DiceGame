import java.util.Scanner;

/**
   The Game program accepts input from the Player and Dice class in order to
   create a turn based guessing game.
 
   @author Camryn Way
   @since 2022-27-02
*/
public class Game {
	private Player player1; // turns player1 into an object
	private Player player2; // turns player2 into an object

	//Dependency -----> create an instance for the class
	Dice d = new Dice();

	/**
	   The Game constructor creates two new player objects 
	   @param name1 The name of player 1
	   @param name2 The name of player 2
	*/
	public Game(String name1, String name2) {
		player1 = new Player(name1);
		player2 = new Player(name2);
	}

	/**
	   The Game deep copy constructor creates two new Player objects with values from
	   the game's player 1 and player 2 fields 
	   @param game Stores copy of game variables player1 and player2 fields
	*/
	public Game(Game game) {
		player1 = new Player(game.player1);
		player2 = new Player(game.player2);
	}

	/**
	   The playGame method calls the playerTurn method to simulate each player turn
	   on a round of the game display, calls the the gameWon method to determine
	   when game is over, and then calls the determineWinner method to display
	   information about winner when the game is complete
	*/
	public void playGame() {
		do {
			System.out.println(); // Adds a space to interface
			playerTurn(player1);
			playerTurn(player2);
			System.out.println(toString());
			System.out.println(); // Adds a space to interface
		} while (gameWon() == false);
		determineWinner();

	}

	/**
	   The toString method returns the name of each player and their scores
	   @return The name of player1 and their score as well as player2 and their score
	*/
	public String toString() {
		return (player1 + ": " + player1.getScore() + " " + player2 + ": " + player2.getScore());
	}

	/**
	   The playerTurn method prompts the user for their prediction, rolls the die,
	   and updates the player’s score when appropriate 
	   @param player The Stored copy of Player constructor name and score fields
	*/
	private void playerTurn(Player player) {
		String choice;
		// player input
		Scanner scanner = new Scanner(System.in);
		System.out.print(player.toString() + ", enter your prediction (even/odd):");
		choice = scanner.nextLine();

		// validate user input
		while (!choice.equalsIgnoreCase("even") && !choice.equalsIgnoreCase("odd")) {
			System.out.println("Incorrect Input.....Please enter your prediction(even OR odd): ");
			choice = scanner.nextLine();
		}

		int dice = d.rollDice(1); // determines number of dice used in game

		// Verifies whether user input matches term definition
		System.out.println("A " + dice + " was rolled.");
		if (choice.equalsIgnoreCase("even") && dice % 2 == 0) {
			System.out.println("Adding " + dice + " to your score!");
			player.updateScore(dice);
		}

		else if (choice.equalsIgnoreCase("odd") && dice % 2 != 0) {
			System.out.println("Adding " + dice + " to your score!");
			player.updateScore(dice);
		}

		else {
			System.out.println("Better luck next time!");
		}

	}

	/**
	   The gameWon method determines when the game is over. 
	   @return a true status boolean if either w1 or w2 reach a score of 50
	   @return a false status boolean if no players have won the game
	*/
	private boolean gameWon() {
		boolean status = false;
		int w1 = player1.getScore();
		int w2 = player2.getScore();

		if (w1 >= 50 || w2 >= 50) {
			return status = true; // game is over
		} else {
			return status = false; // game continues
		}
	}

	/**
	   The determineWinner method determines who the winner is and displays the name
	   of winner or an indication that there is a tie.
	*/
	private void determineWinner() {
		if (player1.getScore() >= 50) {
			System.out.println("**********************************");
			System.out.println("The winner is " + player1 + "!");
			System.out.println("**********************************");
		} else if (player2.getScore() >= 50) {
			System.out.println("**********************************");
			System.out.println("The winner is " + player2 + "!");
			System.out.println("**********************************");
		} else if (player1.getScore() == player2.getScore()) {
			System.out.println("The game is a Tie!");
		}
	}
}
/**
   The Player program implements an application that simply allows the players
   name and score to be documented and updates the score as the game progresses
 
   @author Camryn Way
   @since 2022-27-02
 */
public class Player {
	private String name;
	private int score;

	/**
	   The Player constructor defaults this.name to name and score to 0 for a Player object 
	   @param name The name of the player
	 */
	public Player(String name) {
		this.name = name;
		score = 0;
	}

	/**
	   The Player copy constructor creates a new Player object by initializing the
	   object with the instance of the same class. 
	   @param player Stores copy of Player constructor name and score fields
	*/
	public Player(Player player) {
		name = player.name;
		score = player.score;
	}

	/**
	   The getScore method returns a Player object's score 
	   @return The value in the score field
	*/
	public int getScore() {
		return score;
	}

	/**
	   The updateScore method updates a Player object's score 
	   @param score The score of the player
	*/
	public void updateScore(int score) {
		this.score += score;
	}

	/**
	   The toString method returns the name of the player 
	   @return The name of player
	*/
	public String toString() {
		return name;
	}
}
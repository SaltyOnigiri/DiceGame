# DiceGame
A simple program that simulates a 2-player game. In the game the first player will predict if a roll of a die will result in an odd or even number. The die is then rolled and if the user was correct, the value on the die is added to their score. The process is then repeated for the second player. The prediction and roll for both players is considered a “round” in the game. The rounds continue until at least one player’s score reaches 50. The player to reach 50 first wins. If both players reach 50 in the same round, the player with the highest score wins. If both players reach 50 in the same round and the players’ scores are the same, the game ends in a tie.

The game requires the creation of 3 classes – Game, Player, and Dice. Use the UML diagram
on the next page to write the 3 classes. In addition, please use the following information when writing your classes.

Game Class
- The playGame() method controls the rounds of the game. It calls playerTurn() to
simulate each player’s turn in a round of the game and should display the current score
at the end of each round. It calls gameWon() to determine when the game is over and
determineWinner() to display information about the winner when the game is over.
- The toString() method returns a String that contains both player’s names and scores.
- The playerTurn() method prompts the user for their prediction (remember to validate the
user input), rolls the die and displays the value rolled, determines the outcome and
updates the player’s score when appropriate. A message indicating the outcome is
displayed. (Note that this method is declared as private (as noted in the UML diagram)
because it is only called from within the Game class.
- The gameWon() method determines when the game is over (ie determines when there is
a winner). Note that this method is declared as private (as noted in the UML diagram)
because it is only called from within the Game class.
- The determineWinner() method determines who the winner is and displays the name of
the winner or an indication that there is a tie. Note that this method is declared as private
(as noted in the UML diagram) because it is only called from within the Game class.

Player Class
- Any time a new Player object is created, the score should be reset to 0.
- The updateScore() method increases the user’s score by the parameter value.
- The toString() method returns a String that contains only the player’s name.

Dice Class
- The rollDice() method is a static method (indicated in UML with underlining) that
simulates rolling the number of dice specified by the value of the parameter. It returns
the result of one roll of numDice dice.

NOTE:
My code is heavily commented on because this is a project for my school, and I needed to state my thought process clearly. 
As such, although the code is mine, the general concept does not come from me.

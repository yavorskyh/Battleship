import java.util.*;

public class Battleship {

	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(2);

		player1.placeShips(1);
		player1.printGameBoard();
		
	}



	// prompts user to select spot on game board to attack
	// (make sure to include error checking user selects their own ship or user selects invalid x and y coordinate)
	// (if user selects correctly, they get another shot at guessing)
	public static void attack(int playerNum){

	}


}

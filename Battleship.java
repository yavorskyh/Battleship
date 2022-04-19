import java.util.*;

public class Battleship {

	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {

		Board grid = new Board();
		grid.createWindow();

		Player player1 = new Player();
		Player player2 = new Player(2);

		player1.placeShips();
		player1.printGameBoard();
		player2.placeShips();
		player2.printGameBoard();



		//
		// do{
		// 	player1.printGameBoard();
		// 	player1.attack();
		//
		// 	player2.printGameBoard();
		// 	player2.attack();
		//
		// }while(player1Ships != 0 || player2Ships != 0 );

	}//end of main


}

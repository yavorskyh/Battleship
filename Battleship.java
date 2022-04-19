import java.util.*;

public class Battleship {

	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(2);

		player1.placeShips(1);
		player1.printGameBoard(1);
		player2.placeShips(2);
		player2.printGameBoard(2);


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

import java.util.*;

public class Battleship {

	// main loop (initialize game board, have each player place ships, then loop through
	// printGameBoard and attack for each player until a winner is decided)
	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player(2);

		player1.placeShips();
		player1.printGameBoard();
		player2.placeShips();
		player2.printGameBoard();
		
		 do{
		 	player1.printGameBoard();
		 	player1.attack(player2);
		
		 	player2.printGameBoard();
		 	player2.attack(player1);
		
		 }while(player1.numShips != 0 || player2.numShips != 0 );
		 
		 if (player1.numShips == 0)
			 System.out.println("Congratualtions Player 1! You  Win!");
		 
		 if (player2.numShips == 0)
			 System.out.println("Congratualtions Player 2! You  Win!");
	
		 
	}//end of main
}//end of Battleship



	